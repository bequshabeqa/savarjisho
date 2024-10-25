package Task_63;

public class Mammal extends Animal {
    private String diet;

    public Mammal(String species, String diet) {
        super(species);
        this.diet = diet;
    }

    public String getDiet() {
        return diet;
    }
    public void dietInfo() {
        System.out.println("წონა: " + getDiet());
    }

}
