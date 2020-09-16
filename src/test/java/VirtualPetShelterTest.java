import VirtualPetShelter.VirtualPet;
import VirtualPetShelter.VirtualPetShelter;
import org.junit.Test;

import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class VirtualPetShelterTest {
    @Test
    public void petShouldHaveName() {
        VirtualPet underTest = new VirtualPet("Mimi", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2);
        String petName = underTest.getPetName();
        assertEquals(petName, "Mimi");
    }

    @Test
    public void petShouldHaveSpecies() {
        VirtualPet underTest = new VirtualPet("Mimi", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2);
        String petSpecies = underTest.getPetSpecies();
        assertEquals(petSpecies, "Hearth Kami");
    }

    @Test
    public void petShouldHaveHunger() {
        VirtualPet underTest = new VirtualPet("Mimi", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2);
        int petHunger = underTest.getHunger();
        assertEquals(petHunger, 2);
    }

    @Test
    public void petShouldHaveGoalProgression() {
        VirtualPet underTest = new VirtualPet("Mimi", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2);
        int petThirst = underTest.getGoalProgression();
        assertEquals(petThirst, 0);
    }

    @Test
    public void petShouldHaveGoalName(){
        VirtualPetShelter underTestShelter = new VirtualPetShelter();
        underTestShelter.admitPet(new VirtualPet("Mimi", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2));
        VirtualPet underTestPet = underTestShelter.getPet("Mimi");
        underTestPet.updateBio();
        assertThat(underTestPet.getGoalName(), is("maintain a happy and healthy home."));
    }

    @Test
    public void petShouldHaveBoredom() {
        VirtualPet underTest = new VirtualPet("Mimi", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2);
        int petBoredom = underTest.getBoredom();
        assertEquals(petBoredom, 0);
    }

    @Test
    public void petShouldHaveDiscipline() {
        VirtualPet underTest = new VirtualPet("Mimi", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2);
        assertEquals(underTest.getDiscipline(), 3);
    }

    @Test
    public void petShouldHaveIntelligence() {
        VirtualPet underTest = new VirtualPet("Mimi", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2);
        assertEquals(underTest.getIntelligence(), 2);
    }

    @Test
    public void petShouldHaveLoyalty() {
        VirtualPet underTest = new VirtualPet("Mimi", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2);
        assertEquals(underTest.getLoyalty(), 3);
    }

    @Test
    public void petShouldHaveQuintessence() {
        VirtualPet underTest = new VirtualPet("Mimi", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2);
        assertEquals(underTest.getQuintessence(), 2);
    }

    @Test
    public void updateBioShouldChangeDragonQuintessenceTo7(){
        VirtualPet underTest = new VirtualPet("Mimi", "dragon", 2, 0, 0, 0, 2, 3, 3, 2);
        underTest.updateBio();
        assertEquals(underTest.getQuintessence(), 7);
    }
    @Test
    public void petShouldHaveAscendance() {
        VirtualPet underTest = new VirtualPet("Mimi", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2);
        underTest.updateBio();
        assertEquals(underTest.getAscendance(), 8);
    }

    @Test
    public void admitShouldAddPetToRoster() {
        VirtualPetShelter underTestShelter = new VirtualPetShelter();
        underTestShelter.admitPet(new VirtualPet("Mimi", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2));
        Map underTestShelterRoster = underTestShelter.getRoster();
        int shelterRosterSize = underTestShelterRoster.size();
        assertEquals(1, shelterRosterSize);
    }

    @Test
    public void admitShouldAddOneMorePetToRoster() {
        VirtualPetShelter underTestShelter = new VirtualPetShelter();
        underTestShelter.admitPet(new VirtualPet("Mimi", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2));
        underTestShelter.admitPet(new VirtualPet("Ralph", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2));
        Map underTestShelterRoster = underTestShelter.getRoster();
        int shelterRosterSize = underTestShelterRoster.size();
        assertEquals(2, shelterRosterSize);
    }

    @Test
    public void releasePetShouldRemovePetFromShelterRoster() {
        VirtualPetShelter underTestShelter = new VirtualPetShelter();
        underTestShelter.admitPet(new VirtualPet("Mimi", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2));
        underTestShelter.admitPet(new VirtualPet("Ralph", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2));
        underTestShelter.releasePet("Ralph");
        Map underTestShelterRoster = underTestShelter.getRoster();
        int shelterRosterSize = underTestShelterRoster.size();
        assertEquals(1, shelterRosterSize);
    }

    @Test
    public void getPetShouldReturnTheGiveVirtualPet() {
        VirtualPetShelter underTestShelter = new VirtualPetShelter();
        underTestShelter.admitPet(new VirtualPet("Mimi", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2));
        underTestShelter.admitPet(new VirtualPet("Ralph", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2));
        VirtualPet thisPet = underTestShelter.getPet("Ralph");
        assertEquals("Ralph", thisPet.getPetName());
        assertEquals("Hearth Kami", thisPet.getPetSpecies());
    }

    @Test
    public void nurtureKamiShouldReduceAllHungerBy3() {
        VirtualPetShelter underTestShelter = new VirtualPetShelter();
        underTestShelter.admitPet(new VirtualPet("Mimi", "Hearth Kami", 4, 0, 0, 0, 2, 3, 3, 2));
        underTestShelter.admitPet(new VirtualPet("Ralph", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2));
        underTestShelter.nurtureKami();
        VirtualPet petA = underTestShelter.getPet("Mimi");
        VirtualPet petB = underTestShelter.getPet("Ralph");
        assertEquals(petA.getHunger(), 1);
        assertEquals(petB.getHunger(), -1);
    }

    @Test
    public void grantDivineSanctionsShouldReduceAllBoredomBy3() {
        VirtualPetShelter underTestShelter = new VirtualPetShelter();
        underTestShelter.admitPet(new VirtualPet("Mimi", "Hearth Kami", 4, 0, 4, 0, 2, 3, 3, 2));
        underTestShelter.admitPet(new VirtualPet("Ralph", "Hearth Kami", 2, 0, 2, 0, 2, 3, 3, 2));
        underTestShelter.grantDivineSanctions();
        VirtualPet petA = underTestShelter.getPet("Mimi");
        VirtualPet petB = underTestShelter.getPet("Ralph");
        assertEquals(petA.getBoredom(), 1);
        assertEquals(petB.getBoredom(), -1);
    }

    @Test
    public void virtualShelterTickShouldAdvanceHungerOfAllPetsBy1() {
        VirtualPetShelter underTestShelter = new VirtualPetShelter();
        underTestShelter.admitPet(new VirtualPet("Mimi", "Hearth Kami", 1, 0, 4, 0, 2, 3, 3, 2));
        underTestShelter.admitPet(new VirtualPet("Roland", "Hearth Kami", 2, 0, 4, 0, 2, 3, 3, 2));
        VirtualPet petA = underTestShelter.getPet("Mimi");
        VirtualPet petB = underTestShelter.getPet("Roland");
        underTestShelter.tick();
        assertEquals(petA.getHunger(), 2);
        assertEquals(petB.getHunger(), 3);
    }

//    @Test
//    public void petBuiltWithDefaultIsDifferentFromOther(){
//        VirtualPetShelter underTestShelter = new VirtualPetShelter();
//        underTestShelter.admitPet(new VirtualPet("Mimi", "Hearth Kami"));
//        underTestShelter.admitPet(new VirtualPet("Roland", "Hearth Kami", 2, 42, 4, 0, 2, 3, 3, 2));
//        VirtualPet petA = underTestShelter.getPet("Mimi");
//        VirtualPet petB = underTestShelter.getPet("Roland");
//        if(petA.getGoalProgression() != petB.getGoalProgression
//
//    }

//    @Test
//    public void updateRosterNamesShouldAddANewPetNameToRoster(){
//        VirtualPetShelter underTestShelter = new VirtualPetShelter();
//        underTestShelter.admitPet(new VirtualPet("Mimi", "Hearth Kami"));
//        underTestShelter.admitPet(new VirtualPet("Roland", "Hearth Kami", 2, 0, 4, 0, 2, 3, 3, 2));
//
//    }

//    @Test
//    public void petCanBeInteractedWithDirectlyAndToldToPerformRandomizedCommand(){
//        VirtualPetShelter underTestShelter = new VirtualPetShelter();
//        underTestShelter.admitPet(new VirtualPet("Mimi", "Hearth Kami"));
//        assertEquals(underTestShelter.focusWill("Mimi"),0);
//    }
}
