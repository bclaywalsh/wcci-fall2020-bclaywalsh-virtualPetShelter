package VirtualPetShelter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VirtualPetShelter {
    private double randomRoll = Math.random();
    private HashMap<String, VirtualPet> gardenKami = new HashMap<>();
    private boolean focusing = false;
    private Scanner input = new Scanner(System.in);

    public void admitPet(VirtualPet newPet) {
        newPet.updateBio();
        gardenKami.put(newPet.getPetName(), newPet);

    }

    public HashMap getRoster() {
        return gardenKami;
    }

    public VirtualPet getPet(String kamiName) {
        return gardenKami.get(kamiName);
    }

    public void releasePet(String kamiName) {
        gardenKami.remove(kamiName);
    }

    public void nurtureKami() {
        for (VirtualPet kami : gardenKami.values()) {
            kami.setHunger(kami.getHunger() - 3);
        }
    }

    public void grantDivineSanctions() {

        for (VirtualPet kami : gardenKami.values()) {
            kami.setBoredom(kami.getBoredom() - 3);
            randomRoll = Math.random();
            if (randomRoll > 0.6) {     //              ---Possible loyalty increase
                kami.setLoyalty(kami.getLoyalty() + 1);

                randomRoll = Math.random();   //              ---Possible change in Discipline
                if (randomRoll < 0.3) {
                    kami.setDiscipline(kami.getDiscipline() - 1);
                } else if (randomRoll > 0.8) {
                    kami.setDiscipline(kami.getDiscipline() + 1);
                }

                randomRoll = Math.random();   //              ---Possible change in Intelligence
                if (randomRoll < 0.3) {
                    kami.setIntelligence(kami.getIntelligence() - 1);
                } else if (randomRoll > 0.8) {
                    kami.setIntelligence(kami.getIntelligence() + 1);
                }

                randomRoll = Math.random();   //              ---Possible change in Loyalty
                if (randomRoll < 0.3) {
                    kami.setLoyalty(kami.getLoyalty() - 1);
                } else if (randomRoll > 0.8) {
                    kami.setLoyalty(kami.getLoyalty() + 1);
                }

                randomRoll = Math.random();   //              ---Possible change in Goal Progression
                if (randomRoll < 0.3) {
                    kami.setGoalProgression(kami.getGoalProgression() - 1);
                } else if (randomRoll > 0.8) {
                    kami.setGoalProgression(kami.getGoalProgression() + 1);
                }
            }
        }
    }

    public void tick() {
        for (VirtualPet kami : gardenKami.values()) {
            kami.tick();
        }
    }

    public void focusWill(String kamiName) {
        focusing = true;
        int command = 0;
        VirtualPet kami = gardenKami.get(kamiName);
        //display 3 random interaction options
        kami.generateChoices();
        System.out.println("\n" + kami.getInteractionOne() + " = " + kami.getInteractionOneString());
        System.out.println(kami.getInteractionTwo() + " = " + kami.getInteractionTwoString());
        System.out.println(kami.getInteractionThree() + " = " + kami.getInteractionThreeString());
        command = input.nextInt();
        kami.react(command);
    }
}