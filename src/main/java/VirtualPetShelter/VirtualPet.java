package VirtualPetShelter;

import java.util.HashMap;

public class VirtualPet {
    private String petName;
    private String petSpecies;
    private String goalName;
    private String mood;

    private int hunger;
    private int goalProgression;
    private int goalProgressionLast;
    private int boredom;
    private int lifeSpan;
    private int intelligence;
    private int discipline;
    private int loyalty;
    private int quintessence;
    private int quintessenceLast = quintessence;

    private int ascendance = 8;
    private int capriciousness;
    private int randomNumber1to10;

    double randomProgress = (((double) goalProgression + (double) loyalty) * Math.random() * 2 / ((double) capriciousness + (double) lifeSpan * 0.5 + (double) hunger));

    private int interactionOne = 4;
    private String interactionOneString;
    private int interactionTwo = 6;
    private String interactionTwoString;
    private int interactionThree = 8;
    private String interactionThreeString;
    private int reaction = 0;
    private String reactionString;

    // interactions are the options you have when interacting with your Kami. Each interaction has a set of consequences associated with it, and a desired reacting that is rolled for randomly.
    public HashMap<Integer, String> interactions = new HashMap<Integer, String>();

    // Overloaded Constructor For Default Random Variables
    public VirtualPet(String name, String petSpecies) {
        this.petName = name;
        this.hunger = (int) Math.random() * 5;
        this.goalProgression = (int) Math.random() * 2;
        this.boredom = (int) Math.random() * 3;
        this.lifeSpan = (int) Math.random() * 10;
        this.intelligence = (int) Math.random() * 5;
        this.loyalty = (int) Math.random() * 3;
        this.discipline = (int) Math.random() * 5;
        this.quintessence = (int) Math.random() * 5 + 1;

        //Randomly Determine Species
        //int randomRoll = (int) Math.random() * 20;
        if ((petSpecies.equals("hearth")) || (petSpecies.equals("hearth kami"))) {
            this.petSpecies = "Hearth Kami";
            this.ascendance = 13;
        } else if ((petSpecies.equals("nature")) || (petSpecies.equals("nature kami"))) {
            this.petSpecies = "Neature Kami";
            if (boredom < 2) boredom = 2;
            if (intelligence > 2) intelligence = 2;
            if (discipline > 3) discipline = 3;
            this.ascendance = 8;

        } else if ((petSpecies.equals("curse")) || (petSpecies.equals("curse kami"))) {
            this.petSpecies = "Curse Kami";
            if (hunger < 4) hunger = 4;
            this.loyalty = 0;
            this.ascendance = 7;

        }else if ((petSpecies.equals("dragon")) || (petSpecies.equals("ryu"))) {
            this.petSpecies = "Dragon";
            if (boredom < 3) boredom = 3;
            if (intelligence < 5) intelligence = 5;
            if (discipline < 4) discipline = 4;
            if (lifeSpan < 3) lifeSpan = 3;
            if (quintessence < 4) quintessence = 4;
            this.ascendance = 13;
        }else if ((petSpecies.equals("kirrin")) || (petSpecies.equals("quilin"))) {
            this.petSpecies = "Kirrin";
            this.boredom = 0;
            if (intelligence < 3) intelligence = 3;
            if (discipline < 4) discipline = 4;
            this.quintessence = 1;
            this.ascendance = 20;
        }else if ((petSpecies.equals("phoenix")) || (petSpecies.equals("pheonix"))) {
            this.petSpecies = "Phoenix";
            if (boredom < 3) boredom = 3;
            if (intelligence > 4) intelligence = 4;
            if (discipline > 4) discipline = 4;
            if (lifeSpan < 8) lifeSpan = 8;
            if (quintessence < 4) quintessence = 4;
            this.ascendance = 20;
        }
    }

    //Full Constructor
    public VirtualPet(String name, String petSpecies, int hunger, int goalProgression, int boredom, int lifeSpan, int intelligence, int discipline, int loyalty, int quintessence) {
        this.petSpecies = petSpecies;
        this.petName = name;
        this.hunger = hunger;
        this.goalProgression = goalProgression;
        this.boredom = boredom;
        this.lifeSpan = lifeSpan;
        this.intelligence = intelligence;
        this.loyalty = loyalty;
        this.discipline = discipline;
        this.quintessence = quintessence;
    }

    public int getGoalProgressionLast() {
        return goalProgressionLast;
    }

    public void setGoalProgressionLast(int goalProgressionLast) {
        this.goalProgressionLast = goalProgressionLast;
    }

    public int getCapriciousness() {
        return capriciousness;
    }

    public void setCapriciousness(int capriciousness) {
        this.capriciousness = capriciousness;
    }

    public int getGoalProgression() {
        return goalProgression;
    }

    public void setGoalProgression(int goalProgression) {
        this.goalProgression = goalProgression;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getDiscipline() {
        return discipline;
    }

    public void setDiscipline(int discipline) {
        this.discipline = discipline;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getQuintessence() {
        return quintessence;
    }

    public void setQuintessence(int quintessence) {
        this.quintessence = quintessence;
    }

    public int getAscendance() {
        return ascendance;
    }

    public void setAscendance(int ascendance) {
        this.ascendance = ascendance;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetSpecies() {
        return petSpecies;
    }

    public void setPetSpecies(String petSpecies) {
        this.petSpecies = petSpecies;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getBoredom() {
        return boredom;
    }

    public void setBoredom(int boredom) {
        this.boredom = boredom;
    }

    public String getGoalName() {
        return goalName;
    }

    public void setGoalName(String goalName) {
        this.goalName = goalName;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public int getQuintessenceLast() {
        return quintessenceLast;
    }

    public void setQuintessenceLast(int quintessenceLast) {
        this.quintessenceLast = quintessenceLast;
    }

    public int getInteractionOne() {
        return interactionOne;
    }

    public void setInteractionOne(int interactionOne) {
        this.interactionOne = interactionOne;
    }

    public String getInteractionOneString() {
        return interactionOneString;
    }

    public void setInteractionOneString(String interactionOneString) {
        this.interactionOneString = interactionOneString;
    }

    public int getInteractionTwo() {
        return interactionTwo;
    }

    public void setInteractionTwo(int interactionTwo) {
        this.interactionTwo = interactionTwo;
    }

    public String getInteractionTwoString() {
        return interactionTwoString;
    }

    public void setInteractionTwoString(String interactionTwoString) {
        this.interactionTwoString = interactionTwoString;
    }

    public int getInteractionThree() {
        return interactionThree;
    }

    public void setInteractionThree(int interactionThree) {
        this.interactionThree = interactionThree;
    }

    public String getInteractionThreeString() {
        return interactionThreeString;
    }

    public void setInteractionThreeString(String interactionThreeString) {
        this.interactionThreeString = interactionThreeString;
    }

    public int getReaction() {
        return reaction;
    }

    public void setReaction(int reaction) {
        this.reaction = reaction;
    }

    public String getReactionString() {
        return reactionString;
    }

    public void setReactionString(String reactionString) {
        this.reactionString = reactionString;
    }

    public HashMap<Integer, String> getInteractions() {
        return interactions;
    }

    public void setInteractions(HashMap<Integer, String> interactions) {
        this.interactions = interactions;
    }

    //generate random interactions
    public void generateChoices() {
        //randomly generate 3 different numbers 1 through 10
        interactionOne = (int) Math.ceil(Math.random() * 10);
        do {
            interactionTwo = (int) Math.ceil(Math.random() * 10);
        } while (interactionTwo == interactionOne);
        do {
            interactionThree = (int) Math.ceil(Math.random() * 10);
        } while ((interactionThree == interactionOne) || (interactionThree == interactionTwo));

        interactionOneString = interactions.get(interactionOne);
        interactionTwoString = interactions.get(interactionTwo);
        interactionThreeString = interactions.get(interactionThree);
    }

    public void updateBio() {
        //HEARTH KAMI RECONSTRUCTION
        if ((petSpecies.equals("hearth")) || (petSpecies.equals("hearth kami")) || (petSpecies.equals("Hearth Kami"))) {
            petSpecies = "Hearth Kami";
            goalName = "maintain a happy and healthy home.";

            capriciousness = 3;
            lifeSpan = 0;
            boredom = 0;
            hunger = 2;
            loyalty = 5;
            discipline = 5;
            intelligence = 3;
            goalProgression = 0;
            quintessence = 2;
            quintessenceLast = quintessence;
            reactionString = "is patiently awaiting instructions,";
            mood = "hopeful.";
            ascendance = 10;

            // list of interactions available, aligned in order of difficulty and helpfulness at increasing goalProgress
            interactions.put(10, "Urge " + petName + " to help a child learn.");
            interactions.put(9, "Help "  + petName + " to reward a good child.");
            interactions.put(8, "Encourage " + petName + " to help increase the household income.");
            interactions.put(7, "Instruct " + petName + " to help with cleaning the house.");
            interactions.put(6, "Teach " + petName + " some household rules.");
            interactions.put(5, "Offer up " + petName + " an offering for all their hard work.");
            interactions.put(4, "Allow " + petName + " to do as they please.");
            interactions.put(3, "Encourage " + petName + " to work harder.");
            interactions.put(2, "Ignore the Kami for the time being.");
            interactions.put(1, "This is ridiculous, there are no such things as Kami, right?");

        }

        //NATURE KAMI RECONSTRUCTION
        if ((petSpecies.equals("nature")) || (petSpecies.equals("nature kami")) || (petSpecies.equals("Nature Kami"))) {
            petSpecies = "Nature Kami";
            goalName = "maintain the natural order of the wilderness.";

            capriciousness = 4;
            lifeSpan = 0;
            boredom = 3;
            hunger = 2;
            loyalty = 4;
            discipline = 0;
            intelligence = 2;
            goalProgression = 0;
            quintessence = 3;
            quintessenceLast = quintessence;
            reactionString = "is playing made-up games amidst the sun-dappled grasses,";
            mood = "exhuberant.";
            ascendance = 12;

            // list of interactions available, aligned in order of difficulty and helpfulness at increasing goalProgress
            interactions.put(10, "Work with " + petName + " to become a spiritual warden of a protected wilderness.");
            interactions.put(9, "Work with " + petName + " to establish a healthy local ecosystem.");
            interactions.put(8, "Rope off and bless a spirit tree in which " + petName + " is to reside.");
            interactions.put(7, "Teach " + petName + " about life and death, and the necessity of the hunt.");
            interactions.put(6, "Frolic and play with " + petName + " amidst natural splendor.");
            interactions.put(5, "Offer up " + petName + " an offering for all their hard work.");
            interactions.put(4, "Allow " + petName + " to do as they please.");
            interactions.put(3, "Disparage " + petName + "'s commitment to their goal.");
            interactions.put(2, "Ignore the Kami for the time being.");
            interactions.put(1, "This is ridiculous, there are no such things as Kami, right?");

        }

        //CURSE KAMI RECONSTRUCTION
        if ((petSpecies.equals("curse")) || (petSpecies.equals("curse kami")) || (petSpecies.equals("Curse Kami"))) {
            petSpecies = "Curse Kami";
            goalName = "spread the misery and anger with which they are infected.";

            capriciousness = 0;
            lifeSpan = 0;
            boredom = 0;
            hunger = 6;
            loyalty = 0;
            discipline = 5;
            intelligence = 5;
            goalProgression = 3;
            quintessence = 2;
            quintessenceLast = quintessence;
            reactionString = "is watching you silently,";
            mood = "malevolent.";
            ascendance = 10;

            // list of interactions available, aligned in order of difficulty and helpfulness at increasing goalProgress
            interactions.put(10, "Perform a blasphemous and highly difficult rite of chaos to strengthen the bonds between Yomi-tsu-kuni and this world.");
            interactions.put(9, "Offer up an appropriate victim to " + petName + ".");
            interactions.put(8, "Commune with " + petName + " to strengthen your bonds.");
            interactions.put(7, "Tear down protective talismans to allow " + petName + " free reign.");
            interactions.put(6, "Undermine the good works of others.");
            interactions.put(5, "Offer up " + petName + " an offering for all their hard work.");
            interactions.put(4, "Spread gloom.");
            interactions.put(3, "Encourage " + petName + " to work harder.");
            interactions.put(2, "Ignore the Kami for the time being.");
            interactions.put(1, "This is ridiculous, there are no such things as curses, or Kami...right?");

        }

        //DRAGON RECONSTRUCTION
        if ((petSpecies.equals("dragon")) || (petSpecies.equals("ryu")) || (petSpecies.equals("Dragon"))) {
            petSpecies = "Dragon";
            goalName = "rule over all it sees, and to profit in all ways.";

            capriciousness = 7;
            lifeSpan = 0;
            boredom = 0;
            hunger = 2;
            loyalty = 0;
            discipline = 5;
            intelligence = 8;
            goalProgression = 0;
            quintessence = 7;
            quintessenceLast = quintessence;
            reactionString = "is paying rapt attention to you,";
            mood = "eager to dominate.";
            ascendance = 20;

            // list of interactions available, aligned in order of difficulty and helpfulness at increasing goalProgress
            interactions.put(10, "Bind local gods in agreements tying them inextricably to " + petName + ".");
            interactions.put(9, "Use the gifts of " + petName + " to build upon your mortal network to gain wealth and influence.");
            interactions.put(8, "Establish a shrine in which " + petName + " is revered.");
            interactions.put(7, "Give a substantial gift to " + petName + " as a token of your respect.");
            interactions.put(6, "Fight chaos wherever it is to be found.");
            interactions.put(5, "Offer up " + petName + " an appeasement as a sign of utmost respect.");
            interactions.put(4, "Allow " + petName + " to do as they please.");
            interactions.put(3, "Encourage " + petName + " to work harder.");
            interactions.put(2, "Ignore the Kami for the time being.");
            interactions.put(1, "This is ridiculous, there are no such things as Kami, right?");

        }

        //KIRRIN RECONSTRUCTION
        if ((petSpecies.equals("kirrin")) || (petSpecies.equals("quilin")) || (petSpecies.equals("Kirrin"))) {
            petSpecies = "Kirrin";
            goalName = "witness and channel profound acts of destiny in this world.";

            capriciousness = 0;
            lifeSpan = 0;
            boredom = 0;
            hunger = 3;
            loyalty = 3;
            discipline = 7;
            intelligence = 4;
            goalProgression = 0;
            quintessence = 1;
            quintessenceLast = quintessence;
            reactionString = "is watching the world closely,";
            mood = "calm.";
            ascendance = 8;

            // list of interactions available, aligned in order of difficulty and helpfulness at increasing goalProgress
            interactions.put(10, "Establish a sacred shrine to a greater deity, in which " + petName + " acts as a messenger.");
            interactions.put(9, "Show " + petName + " an act of great providence.");
            interactions.put(8, "Establish a network of lesser shrines to multiple deities, with the mark of " + petName + " upon them.");
            interactions.put(7, "Share a powerful life lesson with " + petName + ", learned from your own hard-earned experience.");
            interactions.put(6, "Teach " + petName + " about the mortal realm.");
            interactions.put(5, "Offer up " + petName + " an offering to strengthen their resolve.");
            interactions.put(4, "Allow " + petName + " freedom to explore.");
            interactions.put(3, "Encourage " + petName + " to work harder.");
            interactions.put(2, "Ignore the Kami for the time being.");
            interactions.put(1, "This is ridiculous, there are no such things as Kami, right?");

        }

        //PHOENIX RECONSTRUCTION
        if ((petSpecies.equals("phoenix")) || (petSpecies.equals("pheonix")) || (petSpecies.equals("Phoenix"))) {
            petSpecies = "Phoenix";
            goalName = "bless sacred beginnings and instill them with vitality.";

            capriciousness = 4;
            lifeSpan = 0;
            boredom = 4;
            hunger = 4;
            loyalty = 1;
            discipline = 1;
            intelligence = 2;
            goalProgression = 5;
            quintessence = 5;
            quintessenceLast = quintessence;
            reactionString = "is pulling itself from a pile of ashes,";
            mood = "rejuvenated.";
            ascendance = 20;

            // list of interactions available, aligned in order of difficulty and helpfulness at increasing goalProgress
            interactions.put(10, "Construct an effigy of ancient deadwood around a blood sacrifice, and burn it at dusk.");
            interactions.put(9, "Plant or reap a harvest for " + petName + " to bless.");
            interactions.put(8, "Compose a new piece of music.");
            interactions.put(7, "Work towards establishing a new venture.");
            interactions.put(6, "Build a comfy nest for " + petName + ".");
            interactions.put(5, "Burn some incense for " + petName + ".");
            interactions.put(4, "Allow " + petName + " to do as they please.");
            interactions.put(3, "Encourage " + petName + " to work harder.");
            interactions.put(2, "Ignore the Kami for the time being.");
            interactions.put(1, "This is ridiculous, there are no such things as Kami, right?");

        }
    }


    //update status
    public void tick(){
        lifeSpan++;
        hunger++;
        reactionString = " is looking after themselves";

        //update mood
        if (hunger > 5) {
            mood = "hungry.";
        } else if (goalProgression < lifeSpan * 0.5) {
            mood = "tired...";
        } else if (boredom > 3) {
            mood = "bored.";
        } else if (goalProgression > goalProgressionLast && quintessenceLast < quintessence) {
            mood = "ecstatic!";
        } else if (goalProgression > goalProgressionLast) {
            mood = "happy.";
        }

        randomProgress = (Math.random() + 0.5) + 0.1 * ((double) goalProgression + (double) loyalty + (double) discipline - (double) lifeSpan * 0.75 - (double) hunger - (double) boredom);

        //update goalProgress && quintessence
        if (randomProgress > 1) {
            goalProgression++;
            if (randomProgress > 1.2) {
                quintessence++;
            }
        } else if (randomProgress < 0.8) {
            if (Math.random() > randomProgress) quintessence--;

            //Kami Death
            if (quintessence < 1) {
                System.out.println("And sadly, Kynereg faded away, and was forgotten.");
                System.exit(0);
            }
        }

        //Kami Stats Cannot Drop Below Zero
        if (loyalty < 0) loyalty = 0;
        if (discipline < 0) discipline = 0;
        if (boredom < 0) boredom = 0;
        if (intelligence < 0) intelligence = 0;
        if (goalProgression < 0) goalProgression = 0;
        if (hunger < 0) hunger = 0;
    }
    public void react(int reaction) {

        //reaction = command;
        if (reaction != interactionOne && reaction != interactionTwo && reaction != interactionThree) reaction = 11;


        //translate reaction back through interaction variables to match it to the correct interaction
        if (reaction == 1) {
            reaction = interactionOne;
        } else if (reaction == 2) {
            reaction = interactionTwo;
        } else if (reaction == 3) {
            reaction = interactionThree;
        }



        //check the loyalty of the kami against a random number 1 through 10, with an increased difficulty based on the index of the interaction
        if ((int) Math.ceil(Math.random() * 10) + randomProgress > reaction + getBoredom()) {
            //reaction = command;


            //create a random reaction with high boredom producing worse results
        } else {
            reaction = (int) Math.ceil(Math.random() * 10) - (int) Math.ceil(boredom) - 2;
        }

        //!!! THE ALL IMPORTANT REACTIONS!!! ------------------------------------------------------------------------HEARTH KAMI
        if (getPetSpecies().equals("Hearth Kami")) {
            if (reaction == 11) { // no appropriate command given
                reactionString = "looking after themselves as best they can.";
                randomNumber1to10 = (int) (Math.ceil(Math.random() * 10));
                if (randomNumber1to10 + boredom > 10) {
                    boredom -= 2;
                } else if (randomNumber1to10 + boredom > 5) {
                    boredom--;
                }
                randomNumber1to10 = (int) (Math.ceil(Math.random() * 10));
                if (randomNumber1to10 + hunger > 10) {
                    hunger -= 2;
                } else if (randomNumber1to10 + hunger > 5) {
                    hunger--;
                }

            }
            if (reaction == 10) {
                reactionString = "helping a child understand their homework,";
                boredom++;
                hunger -= 5;
            }
            if (reaction == 9) {
                reactionString = "instilling a sense of pride in the children's accomplishments,";
                loyalty++;
                hunger -= 2;
                boredom -= 2;
            }
            if (reaction == 8) {
                reactionString = "bending their will towards helping the families wage earners,";
                discipline++;
                intelligence++;
                hunger -= 3;
                boredom++;
            }
            if (reaction == 7) {
                reactionString = "helping the Grime and Disorder Kami move out,";
                discipline++;
                hunger--;
                boredom -= 3;
            }
            if (reaction == 6) {
                reactionString = "shaping itself to fit the household rules, and engraving them into the memories of its inhabitants,";
                discipline++;
                hunger -= 2;
                boredom--;
                intelligence++;
            }
            if (reaction == 5) {
                reactionString = "working harder than ever,";
                loyalty++;
                hunger -= 2;
                boredom -= 2;
            }
            if (reaction == 4) {
                reactionString = "going about, instilling merry chaos into the families lives,";
                boredom -= 5;
            }
            if (reaction == 3) {
                reactionString = "grimly working hard to improve,";
                hunger -= 2;
                if (Math.random() < 0.4) {
                    loyalty--;
                } else discipline++;
            }
            if (reaction == 2) {
                reactionString = "wandering about looking for something to do,";
                randomNumber1to10 = (int) (Math.ceil(Math.random() * 10));
                if (randomNumber1to10 > 8) {
                    boredom -= 2;
                    hunger -= 3;
                    loyalty++;
                } else if (randomNumber1to10 > 6) {
                    boredom -= 3;
                    hunger--;
                } else if (randomNumber1to10 > 4) {
                    boredom -= 4;
                } else {
                    boredom = 0;
                    discipline--;
                    loyalty--;
                }
            }
            if (reaction < 2) {
                reactionString = "staring about hopelessly wondering if they even exist,";
                loyalty--;
                discipline--;
                if (Math.random() < 0.4) {
                    if (quintessence == quintessenceLast) quintessence--;
                }
            }
        }

        //  -------------------------------------------------------------------------------NATURE KAMI
        if (getPetSpecies().equals("Nature Kami")) {
            if (reaction == 11) { // no appropriate command given
                reactionString = "looking after themselves as best they can.";
                randomNumber1to10 = (int) (Math.ceil(Math.random() * 10));
                if (randomNumber1to10 + boredom > 10) {
                    boredom -= 2;
                } else if (randomNumber1to10 + boredom > 5) {
                    boredom--;
                }
                randomNumber1to10 = (int) (Math.ceil(Math.random() * 10));
                if (randomNumber1to10 + hunger > 10) {
                    hunger -= 2;
                } else if (randomNumber1to10 + hunger > 5) {
                    hunger--;
                }

            }
            if (reaction == 10) {
                reactionString = "shepherding the spirits of the fallen into reincarnation,";
                boredom -= 2;
                hunger -= 3;
                intelligence++;
                loyalty++;
            }
            if (reaction == 9) {
                reactionString = "playing amongst the pools and meadows of their healthy home,";
                loyalty++;
                boredom -= 5;
            }
            if (reaction == 8) {
                reactionString = "decorating their new home tree with all manner of blooms and funguses,";
                discipline++;
                intelligence++;
                loyalty++;
            }
            if (reaction == 7) {
                reactionString = "guiding the predators within their domain to hunt responsibly,";
                hunger -= 3;
                boredom -= 2;
            }
            if (reaction == 6) {
                reactionString = "basking lazily in the sun while absorbing vitality,";
                discipline++;
                hunger -= 2;
                boredom--;
                intelligence++;
            }
            if (reaction == 5) {
                reactionString = "feasting on the attention of your offering,";
                loyalty++;
                hunger -= 2;
                boredom -= 1;
            }
            if (reaction == 4) {
                reactionString = "going about the wilderness, living its many many lives,";
                boredom -= 5;
                loyalty++;
            }
            if (reaction == 3) {
                reactionString = "is pouting and patently ignoring you,";
                loyalty--;
            }
            if (reaction == 2) {
                reactionString = "quietly soaks into the landscape,";
                randomNumber1to10 = (int) (Math.ceil(Math.random() * 10));
                if (randomNumber1to10 > 8) {
                    boredom -= 2;
                    hunger -= 3;
                    loyalty++;
                } else if (randomNumber1to10 > 6) {
                    boredom -= 3;
                    hunger--;
                } else if (randomNumber1to10 > 4) {
                    boredom -= 4;
                    discipline--;
                } else {
                    boredom = 0;
                    discipline -= 2;
                    loyalty--;
                }
            }
            if (reaction < 2) {
                reactionString = "staring about hopelessly wondering if they even exist,";
                loyalty--;
                discipline--;
                if (Math.random() < 0.4) {
                    if (quintessence == quintessenceLast) quintessence--;
                }
            }
        }
        //  -------------------------------------------------------------------------------CURSE KAMI
        if (getPetSpecies().equals("Curse Kami")) {
            if (reaction == 11) { // no appropriate command given
                reactionString = "looking after themselves as best they can.";
                randomNumber1to10 = (int) (Math.ceil(Math.random() * 10));
                if (randomNumber1to10 + boredom > 10) {
                    boredom -= 2;
                } else if (randomNumber1to10 + boredom > 5) {
                    boredom--;
                }
                randomNumber1to10 = (int) (Math.ceil(Math.random() * 10));
                if (randomNumber1to10 + hunger > 10) {
                    hunger -= 2;
                } else if (randomNumber1to10 + hunger > 5) {
                    hunger--;
                }

            }
            if (reaction == 10) {
                reactionString = "drawing forth tormented souls from the underworld,";
                boredom++;
                hunger -= 5;
            }
            if (reaction == 9) {
                reactionString = "is darkening the light within their victim,";
                loyalty++;
                hunger -= 2;
                boredom -= 2;
            }
            if (reaction == 8) {
                reactionString = "sharing their torment and rage, settling deeper into you,";
                discipline++;
                intelligence++;
                hunger -= 3;
                boredom++;
            }
            if (reaction == 7) {
                reactionString = "spreading itself into the once sanctified homes and shrines,";
                discipline++;
                hunger--;
                boredom -= 3;
            }
            if (reaction == 6) {
                reactionString = "spreading itself through the frustration of your adversaries,";
                discipline++;
                hunger -= 2;
                boredom--;
                intelligence++;
            }
            if (reaction == 5) {
                reactionString = "swelling with power,";
                loyalty++;
                hunger -= 2;
                boredom -= 2;
            }
            if (reaction == 4) {
                reactionString = "taking advantage of the passersby who tempt fate by daring to look into the darkness,";
                boredom -= 5;
            }
            if (reaction == 3) {
                reactionString = "eyeing you hungrily,";
                hunger -= 2;
                if (Math.random() < 0.4) {
                    loyalty--;
                } else discipline++;
            }
            if (reaction == 2) {
                reactionString = "consolidating their strength, producing strange groaning clicks in the night to frighten wrestless sleepers,";
                randomNumber1to10 = (int) (Math.ceil(Math.random() * 10));
                if (randomNumber1to10 > 8) {
                    boredom -= 2;
                    hunger -= 3;
                    loyalty++;
                } else if (randomNumber1to10 > 6) {
                    boredom -= 3;
                    hunger--;
                } else if (randomNumber1to10 > 4) {
                    boredom -= 4;
                } else {
                    boredom = 0;
                    discipline--;
                    loyalty--;
                }
            }
            if (reaction < 2) {
                reactionString = "grinning wickedly at you from beyond the shadows,";
                loyalty--;
                discipline--;
                if (Math.random() < 0.4) {
                    if (quintessence == quintessenceLast) quintessence--;
                }
            }
        }
        //  -------------------------------------------------------------------------------DRAGON
        if (getPetSpecies().equals("Dragon")) {
            if (reaction == 11) { // no appropriate command given
                reactionString = "looking after themselves as best they can.";
                randomNumber1to10 = (int) (Math.ceil(Math.random() * 10));
                if (randomNumber1to10 + boredom > 10) {
                    boredom -= 2;
                } else if (randomNumber1to10 + boredom > 5) {
                    boredom--;
                }
                randomNumber1to10 = (int) (Math.ceil(Math.random() * 10));
                if (randomNumber1to10 + hunger > 10) {
                    hunger -= 2;
                } else if (randomNumber1to10 + hunger > 5) {
                    hunger--;
                }

            }
            if (reaction == 10) {
                reactionString = "arranging the hierarchy of Kami within their court, doling out commands,";
                boredom++;
                hunger -= 5;
            }
            if (reaction == 9) {
                reactionString = "spreading the bounds of their spiritual rule abroad into your conquests,";
                loyalty++;
                hunger -= 2;
                boredom -= 2;
            }
            if (reaction == 8) {
                reactionString = "admiring their depiction in the adequate shrine you have erected,";
                discipline++;
                intelligence++;
                hunger -= 3;
                boredom++;
            }
            if (reaction == 7) {
                reactionString = "basking lazily in the aftermath of a glorious feast,";
                discipline++;
                hunger--;
                boredom -= 3;
            }
            if (reaction == 6) {
                reactionString = "bringing order to the chaotic spiritual realm in the wake of your deeds,";
                discipline++;
                hunger -= 2;
                boredom--;
                intelligence++;
            }
            if (reaction == 5) {
                reactionString = "continuing to allow you to serve them, for now,";
                loyalty++;
                hunger -= 2;
                boredom -= 2;
            }
            if (reaction == 4) {
                reactionString = "waging reckless war in the spirit realm,";
                boredom -= 5;
            }
            if (reaction == 3) {
                reactionString = "considering you with narrowed gaze,";
                hunger -= 2;
                if (Math.random() < 0.4) {
                    loyalty--;
                } else discipline++;
            }
            if (reaction == 2) {
                reactionString = "settling in for a draconic nap,";
                randomNumber1to10 = (int) (Math.ceil(Math.random() * 10));
                if (randomNumber1to10 > 8) {
                    boredom -= 2;
                    hunger -= 3;
                    loyalty++;
                } else if (randomNumber1to10 > 6) {
                    boredom -= 3;
                    hunger--;
                } else if (randomNumber1to10 > 4) {
                    boredom -= 4;
                } else {
                    boredom = 0;
                    discipline--;
                    loyalty--;
                }
            }
            if (reaction < 2) {
                reactionString = "beginning to fall into a deep slumber,";
                loyalty--;
                discipline--;
                if (Math.random() < 0.4) {
                    if (quintessence == quintessenceLast) quintessence--;
                }
            }
        }
        //  -------------------------------------------------------------------------------PHOENIX
        if (getPetSpecies().equals("Phoenix")) {
            if (reaction == 11) { // no appropriate command given
                reactionString = "looking after themselves as best they can.";
                randomNumber1to10 = (int) (Math.ceil(Math.random() * 10));
                if (randomNumber1to10 + boredom > 10) {
                    boredom -= 2;
                } else if (randomNumber1to10 + boredom > 5) {
                    boredom--;
                }
                randomNumber1to10 = (int) (Math.ceil(Math.random() * 10));
                if (randomNumber1to10 + hunger > 10) {
                    hunger -= 2;
                } else if (randomNumber1to10 + hunger > 5) {
                    hunger--;
                }

            }
            if (reaction == 10) {
                reactionString = "spreading their wings over the glowing embers of the Effigy, basking in the warm glow";
                boredom++;
                hunger -= 5;
            }
            if (reaction == 9) {
                reactionString = "flashing through the sunbeams about your crop, raining down blessed sparks of vitality,";
                loyalty++;
                hunger -= 2;
                boredom -= 2;
            }
            if (reaction == 8) {
                reactionString = "trilling your tune more beautifully than you could have ever believed possible,";
                discipline++;
                intelligence++;
                hunger -= 3;
                boredom++;
            }
            if (reaction == 7) {
                reactionString = "establishing a spiritual roost near your venture,";
                discipline++;
                hunger--;
                boredom -= 3;
            }
            if (reaction == 6) {
                reactionString = "settling into the nest, crooning and squawking happily in a decidedly non-regal manner,";
                discipline++;
                hunger -= 2;
                boredom--;
                intelligence++;
            }
            if (reaction == 5) {
                reactionString = "inhaling the sacred smoke contentedly,";
                loyalty++;
                hunger -= 2;
                boredom -= 2;
            }
            if (reaction == 4) {
                reactionString = "flying about the land, spreading vitality,";
                boredom -= 5;
            }
            if (reaction == 3) {
                reactionString = "scoffing at your young impatience,";
                hunger -= 2;
                if (Math.random() < 0.4) {
                    loyalty--;
                } else discipline++;
            }
            if (reaction == 2) {
                reactionString = "going about the everyday business of spiritual life,";
                randomNumber1to10 = (int) (Math.ceil(Math.random() * 10));
                if (randomNumber1to10 > 8) {
                    boredom -= 2;
                    hunger -= 3;
                    loyalty++;
                } else if (randomNumber1to10 > 6) {
                    boredom -= 3;
                    hunger--;
                } else if (randomNumber1to10 > 4) {
                    boredom -= 4;
                } else {
                    boredom = 0;
                    discipline--;
                    loyalty--;
                }
            }
            if (reaction < 2) {
                reactionString = "looking at you dispassionately,";
                loyalty--;
                discipline--;
                if (Math.random() < 0.4) {
                    if (quintessence == quintessenceLast) quintessence--;
                }
            }
        }
        //  -------------------------------------------------------------------------------KIRRIN
        if (getPetSpecies().equals("Kirrin")) {
            if (reaction == 11) { // no appropriate command given
                reactionString = "looking after themselves as best they can.";
                randomNumber1to10 = (int) (Math.ceil(Math.random() * 10));
                if (randomNumber1to10 + boredom > 10) {
                    boredom -= 2;
                } else if (randomNumber1to10 + boredom > 5) {
                    boredom--;
                }
                randomNumber1to10 = (int) (Math.ceil(Math.random() * 10));
                if (randomNumber1to10 + hunger > 10) {
                    hunger -= 2;
                } else if (randomNumber1to10 + hunger > 5) {
                    hunger--;
                }

            }
            if (reaction == 10) {
                reactionString = "carrying out covert missions directly from the sacred realm,";
                boredom++;
                hunger -= 5;
            }
            if (reaction == 9) {
                reactionString = "engraving a record of the destined event upon their scaly hide,";
                loyalty++;
                hunger -= 2;
                boredom -= 2;
            }
            if (reaction == 8) {
                reactionString = "standing in a cusp between its many shrines, looking out upon all for moments of providence,";
                discipline++;
                intelligence++;
                hunger -= 3;
                boredom++;
            }
            if (reaction == 7) {
                reactionString = "standing regally by your side to discern the depths of your wisdom,";
                discipline++;
                hunger--;
                boredom -= 3;
            }
            if (reaction == 6) {
                reactionString = "paying close attention to the comings and goings of mortals with ever improving comprehension,";
                discipline++;
                hunger -= 2;
                boredom--;
                intelligence++;
            }
            if (reaction == 5) {
                reactionString = "bounding ever surer from roof-top to roof-top and branch to branch,";
                loyalty++;
                hunger -= 2;
                boredom -= 2;
            }
            if (reaction == 4) {
                reactionString = "picking their way delicately between the spaces of human awareness, enacting the mysterious will of the beyond,";
                boredom -= 5;
            }
            if (reaction == 3) {
                reactionString = "giving you a blank look,";
                hunger -= 2;
                if (Math.random() < 0.4) {
                    loyalty--;
                } else discipline++;
            }
            if (reaction == 2) {
                reactionString = "roaming farther and farther from your side,";
                randomNumber1to10 = (int) (Math.ceil(Math.random() * 10));
                if (randomNumber1to10 > 8) {
                    boredom -= 2;
                    hunger -= 3;
                    loyalty++;
                } else if (randomNumber1to10 > 6) {
                    boredom -= 3;
                    hunger--;
                } else if (randomNumber1to10 > 4) {
                    boredom -= 4;
                } else {
                    boredom = 0;
                    discipline--;
                    loyalty--;
                }
            }
            if (reaction < 2) {
                reactionString = "seeming more and more insubstantial and unsure of their goal,";
                if (Math.random() < 0.4) {
                    loyalty--;
                }
                if (Math.random() < 0.4) {
                    discipline--;
                }
                if (Math.random() < 0.4) {
                    if (quintessence == quintessenceLast) quintessence--;
                }
            }
        }
    }
}
