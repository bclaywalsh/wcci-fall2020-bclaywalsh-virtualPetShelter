package VirtualPetShelter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VirtualPetShelterApp {
    public static void main(String[] args) {
        int command = 0;
        double randomNumber1to10 = Math.ceil(Math.random() * 10);
        Scanner input = new Scanner(System.in);
        int karma = 0;

        VirtualPetShelter shelter = new VirtualPetShelter();

        shelter.admitPet(new VirtualPet("Mimi", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2));
        shelter.admitPet(new VirtualPet("Dapple", "Nature Kami", 3, 2, 3, 0, 1, 1, 3, 2));
//        shelter.admitPet(new VirtualPet("Detesh", "Hearth Kami", 1, 1, 2, 1, 3, 2, 2, 2));
//        shelter.admitPet(new VirtualPet("Juon", "Curse Kami", 4, 2, 0, 2, 3, 1, 3, 3));
//        shelter.admitPet(new VirtualPet("Faulks", "Phoenix", 0, 0, 0, 8, 1, 1, 2, 5));

        HashMap<String, VirtualPet> shelterRoster = shelter.getRoster();


        System.out.println("\n      (>   -   -   ((> GARDENS OF SHINKAI <))   -   -   <)\n");

        System.out.println("In a place of timelessness, in a realm of hidden power, the Garden of Shinkai stands.\nThe garden calls to Kami lost, the garden cares for Kami low.\nOnce per year in this shining land, the gates to the Center Kingdom are thrown open and Kami come and go as they please.\n");
        System.out.println("As a spirit guardian, it is your task to assist and guide the Kami under your care.\nOnce per year you can interract with your spirit friends and help them along their path.");
        System.out.println("The day of awakenings has come once more. Extend your will into the realm of Shinkai, shape destiny with your own two hands.");


        //MAIN LOOP
        while (command != 6) {
            System.out.println("\n-))~------------------------------------------------------------------------------------~~~~~~~~~~~~~~~/~/~/");
            System.out.println("((>=================================================================================================================/");
            System.out.println("Your karma is rank " + karma);
            System.out.println("It is a new year, and a new opportunity to shape destiny.");
            System.out.println("((>=============================================================================================================/");
            System.out.println("-))~------------------------------------------------------------------------------------~~///(\n");
            System.out.println("Kami Name\tSpecies\tGoal");
            System.out.println("        Activity and Mood");

            //Update the apps list of the kami
            shelterRoster = shelter.getRoster();
            //Display info on each Kami
            for (VirtualPet kami : shelterRoster.values()) {
                System.out.println("=========================================================================================================================<))");
                System.out.println("Name: " + kami.getPetName() + "\t\tSpecies: " + kami.getPetSpecies() + "\t\tGoal: " + kami.getGoalName());
                System.out.println(kami.getPetName() + " is now " + kami.getLifeSpan() + " years old, is a rank " + kami.getQuintessence() + " god and is " + kami.getGoalProgression() + " steps along the path towards its ultimate goal.");
                System.out.println("          " + kami.getPetName() + " the " + kami.getPetSpecies() + " is " + kami.getReactionString() + " and is feeling " + kami.getMood());
                System.out.println("    ~~~~--------------------------------------------------------------------------------------~~~~");
                System.out.println("     Hunger: " + kami.getHunger() + "\t||\tBoredom: " + kami.getBoredom() + "\t\t||\tLoyalty: " + kami.getLoyalty());
                System.out.println("Intelligence: " + kami.getIntelligence() + "\t||\tDiscipline: " + kami.getDiscipline() + "\t||\tQuintessence: " + kami.getQuintessence());
                System.out.println("      ~~~~--------------------------------------------------------------------------------------~~~~");
                if (kami.getHunger() > 3) {
                    System.out.println(kami.getPetName() + " is feeling very hungry. A hungry Kami can cause all sorts of havoc, figure out a way to feed it's essence.");
                }
                if (kami.getQuintessence() < 2) {
                    System.out.println("The Quintessence of " + kami.getPetName() + " is very low. If the Quintessence of a kami reaches zero, they will fade to nothing.");
                }
                System.out.println("\n-------------------------------------------------------------------------------------------------~~");
            }
            System.out.println("enter 1 to provide nourishment to all of your wards, reducing their hunger.");
            System.out.println("enter 2 to grant divine sanctions to your wards, allowing them extra freedoms in the year to come.");
            System.out.println("enter 3 to focus your efforts on a single kami in the coming year.");
            System.out.println("enter 4 to bring forth a new kami into your garden.");
            System.out.println("enter 5 to release a kami from your care. The happiness of a released kami will add or subtract from your karma.");
            System.out.println("enter 6 to escape your divine obligations.");

            command = input.nextInt();
            boolean goOn = false;
            if (command == 6) System.exit(0);

            //Secondary Loop that repeats until a full action has been declared (not just releasing or inviting a new kami)
            do {
                // FEED ALL
                if (command == 1) shelter.nurtureKami();

                // REDUCE BOREDOM (WITH CONSEQUENCES)
                if (command == 2) shelter.grantDivineSanctions();

                // FOCUS ON ONE PET
                goOn = false;
                if (command == 3) {
                    while (!goOn) {
                        System.out.println("Which Kami would you like to focus your will on?\n > type it's name and press enter");
                        System.out.println(shelterRoster.keySet());
                        input.nextLine();
                        String kamiName = input.nextLine().trim();
                        if (shelterRoster.containsKey(kamiName)) {
                            shelter.focusWill(kamiName);
                            goOn = true;
                        } else
                            System.out.println(kamiName);
                            System.out.println("No Kami by that name resides in your garden. Please restate your Kami's name.");
                    }
                }


                // ADMIT NEW PET
                goOn = false;
                boolean areYouSure = false;
                if (command == 4) {
                    VirtualPet newPet = new VirtualPet("nameless", "unknown");
                    while (!areYouSure) {
                        boolean inputRecognized = false;
                        while (!inputRecognized) {
                            System.out.println("What kind of Kami are you interested in bringing into your garden?");
                            System.out.println("      *Hearth Kami*                  *Nature Kami*                 **Curse Kami**");
                            System.out.println("       **Kirrin**                     **Phoenix**                    **Dragon**");

                            input.nextLine();
                            String petSpecies = input.nextLine().toLowerCase().trim();
                            inputRecognized=true;
                            if (petSpecies.equals("hearth") || petSpecies.equals("hearth kami"))
                                System.out.println("The Hearth Kami's overriding reason for being is its drive to ensure that the home over which it watches is healthy, happy, and prosperous.");
                            else if (petSpecies.equals("nature") || petSpecies.equals("nature kami"))
                                System.out.println("The Nature Kami is a spirit which watches over the natural world, which grows and thrives as it does.");
                            else if (petSpecies.equals("curse") || petSpecies.equals("curse kami"))
                                System.out.println("The Curse Kami is a malevolent spirit of anger and frustration which seeks to spread itself as widely as possible.");
                            else if (petSpecies.equals("dragon"))
                                System.out.println("The Dragon is a physically manifesting Kami whose everlasting goal is to destroy chaos in all forms, creating a prosperous realm of order under its control.");
                            else if (petSpecies.equals("kirrin"))
                                System.out.println("The Kirrin is a mysterious and majestic beast. Lesser Kirrin serve as witnesses to the implementation of divine fate. Greater Kirrin seek to shape the world by choosing worthy individuals to receive the blessings of the high gods.");
                            else if (petSpecies.equals("phoenix"))
                                System.out.println("The Phoenix is an elegant bird of eternally renewing life. The phoenix is born at the start of a great age, and blesses each portentous beginning with its divine grace.");
                            else {
                                System.out.println("That variety of Kami is not known to us, please restate");
                                inputRecognized=false;
                            }
                        }
                        System.out.println("Is this the companion you seek to bring into your garden? (Y / N)");
                        if(input.nextLine().toLowerCase().trim().equals("y")){
                            areYouSure=true;
                            System.out.println("line136 is reached");
//                            break;
                        }
                        if (!areYouSure) System.out.println("take your time, this is a fateful decision.");
                    }
                }

                // RELEASE PET
                goOn = false;
                areYouSure = false;
                if (command == 5) {
                    String response="";
                    String petToRelease = "";
                    while (!goOn) {
                        System.out.println("Which kami are you releasing?");
                        System.out.println(shelterRoster.keySet());
                        petToRelease = input.nextLine();
                        input.next();
                        if (shelterRoster.containsKey(petToRelease)) {
                            System.out.println("Are you sure? ( Y / N / Nevermind)");
                            response =input.nextLine().toLowerCase().trim();
                            if (response.equals("y")) areYouSure=true;
                            if(areYouSure) goOn=true;
                        } else {
                            System.out.println("There is no Kami in your garden by that name. Please enter another name.");
                        }
                    }
                    if(!response.equals("nevermind")){
                        VirtualPet thisPet = shelter.getPet(petToRelease);
                        karma+=(int)((thisPet.getGoalProgression() + thisPet.getQuintessence())/thisPet.getLifeSpan()) + 3*(Math.random()-1);
                        shelter.releasePet(petToRelease);
                    }
                }
            } while (command > 3); // CONTINUE AS LONG AS A YEAR-LONG ACTION IS NOT YET TAKEN
            shelter.tick();
        }
    }
}