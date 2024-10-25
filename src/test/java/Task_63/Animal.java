package Task_63;

public class Animal {
    private String species;

    public Animal(String species) {
        this.species = species;
    }
    public String getSpecies() {
        return species;
    }

    public void speciesInfo() {
        System.out.println("სახეობა: " + getSpecies());
    }
}
