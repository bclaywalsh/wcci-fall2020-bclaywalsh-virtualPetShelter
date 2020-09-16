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
    public void getNameShouldReturnName() {
        VirtualPet underTest = new VirtualPet("Mimi", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2);
        assertEquals(underTest.getPetName(), "Mimi");
    }

    @Test
    public void setNameShouldChangeName() {
        VirtualPet underTest = new VirtualPet("Mimi", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2);
        underTest.setPetName("Momo");
        assertEquals(underTest.getPetName(), "Momo");
    }

    @Test
    public void getSpeciesShouldReturnSpecies() {
        VirtualPet underTest = new VirtualPet("Mimi", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2);
        assertEquals(underTest.getPetSpecies(), "Hearth Kami");
    }

    @Test
    public void setSpeciesShouldChangeSpecies() {
        VirtualPet underTest = new VirtualPet("Mimi", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2);
        underTest.setPetSpecies("Boojum");
        assertEquals(underTest.getPetSpecies(), "Boojum");
    }

    @Test
    public void getHungerShouldReturnHunger() {
        VirtualPet underTest = new VirtualPet("Mimi", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2);
        assertEquals(underTest.getHunger(), 2);
    }

    @Test
    public void setHungerShouldChangeHunger() {
        VirtualPet underTest = new VirtualPet("Mimi", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2);
        underTest.setHunger(6000);
        assertEquals(underTest.getHunger(), 6000);
    }

    @Test
    public void getGoalProgressionShouldReturnGoalProgression() {
        VirtualPet underTest = new VirtualPet("Mimi", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2);
        assertEquals(underTest.getGoalProgression(), 0);
    }

    @Test
    public void setGoalProgressionShouldChangeGoalProgression() {
        VirtualPet underTest = new VirtualPet("Mimi", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2);
        underTest.setGoalProgression(63432);
        assertEquals(underTest.getGoalProgression(), 63432);
    }

    @Test
    public void getGoalNameReturns() {
        VirtualPetShelter underTestShelter = new VirtualPetShelter();
        underTestShelter.admitPet(new VirtualPet("Mimi", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2));
        VirtualPet underTestPet = underTestShelter.getPet("Mimi");
        underTestPet.updateBio();
        assertThat(underTestPet.getGoalName(), is("maintain a happy and healthy home."));
    }

    @Test
    public void setGoalNameShouldChangeGoalName() {
        VirtualPet underTest = new VirtualPet("Mimi", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2);
        underTest.setGoalName("to infinity, and beyond!");
        assertEquals(underTest.getGoalName(), "to infinity, and beyond!");
    }

    @Test
    public void petShouldHaveBoredom() {
        VirtualPet underTest = new VirtualPet("Mimi", "Hearth Kami", 2, 0, 12, 0, 2, 3, 3, 2);
        int petBoredom = underTest.getBoredom();
        assertEquals(12, petBoredom);
    }

    @Test
    public void setBoredomShouldChangeBoredom() {
        VirtualPet underTest = new VirtualPet("Mimi", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2);
        underTest.setBoredom(-54);
        assertEquals(underTest.getBoredom(), -54);
    }

    @Test
    public void petShouldHaveDiscipline() {
        VirtualPet underTest = new VirtualPet("Mimi", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2);
        assertEquals(underTest.getDiscipline(), 3);
    }

    @Test
    public void setDisciplineShouldChangeDiscipline() {
        VirtualPet underTest = new VirtualPet("Mimi", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2);
        underTest.setDiscipline(98);
        assertEquals(underTest.getDiscipline(), 98);
    }

    @Test
    public void petShouldHaveIntelligence() {
        VirtualPet underTest = new VirtualPet("Mimi", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2);
        assertEquals(underTest.getIntelligence(), 2);
    }

    @Test
    public void setIntelligenceShouldChangeIntelligence() {
        VirtualPet underTest = new VirtualPet("Mimi", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2);
        underTest.setIntelligence(120);
        assertEquals(underTest.getIntelligence(), 120);
    }

    @Test
    public void petShouldHaveLoyalty() {
        VirtualPet underTest = new VirtualPet("Mimi", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2);
        assertEquals(underTest.getLoyalty(), 3);
    }

    @Test
    public void setLoyaltyShouldChangeLoyalty() {
        VirtualPet underTest = new VirtualPet("Mimi", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2);
        underTest.setLoyalty(50);
        assertEquals(underTest.getLoyalty(), 50);
    }

    @Test
    public void petShouldHaveQuintessence() {
        VirtualPet underTest = new VirtualPet("Mimi", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2);
        assertEquals(underTest.getQuintessence(), 2);
    }

    @Test
    public void setQuintessenceShouldChangeQUintessence() {
        VirtualPet underTest = new VirtualPet("Mimi", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2);
        underTest.setQuintessence(12);
        assertEquals(underTest.getQuintessence(), 12);
    }

    @Test
    public void updateBioShouldChangeDragonQuintessenceTo7() {
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
    public void setAscendanceShouldChangeAscendance() {
        VirtualPet underTest = new VirtualPet("Mimi", "Hearth Kami", 2, 0, 0, 0, 2, 3, 3, 2);
        underTest.setAscendance(2);
        assertEquals(underTest.getAscendance(), 2);
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

    @Test
    public void virtualShelterTickShouldAdvanceBoredomOfAllPetsBy1() {
        VirtualPetShelter underTestShelter = new VirtualPetShelter();
        underTestShelter.admitPet(new VirtualPet("Mimi", "Hearth Kami", 1, 0, 4, 0, 2, 3, 3, 2));
        underTestShelter.admitPet(new VirtualPet("Roland", "Hearth Kami", 2, 0, 4, 0, 2, 3, 3, 2));
        VirtualPet petA = underTestShelter.getPet("Mimi");
        VirtualPet petB = underTestShelter.getPet("Roland");
        underTestShelter.tick();
        assertEquals(5, petA.getBoredom());
        assertEquals(5, petB.getBoredom());
    }
}
