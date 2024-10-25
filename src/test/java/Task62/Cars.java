package Task62;

public class Cars {
    private String model;
    private int year;
    private double price;


    public Cars(String model, int year, double price) {
            this.model = model;
            this.year = year;
            this.price = price;
       }
       public Cars(String model){
        this(model, 2015, 20000);
       }

    void printInfo() {
        System.out.println("Info: " + "Model: " + model + "," + "Year: " + year + "," + "Price: " + price );
    }
}
