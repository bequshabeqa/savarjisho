package Task_63;

public class Dog extends Mammal {
    private String breed;

    public Dog(String species, String diet, String breed) {
        super(species, diet);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
    public void breedInfo() {
        System.out.println("ჯიში: " + getBreed());
    }
}
