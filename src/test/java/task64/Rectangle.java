package task64;

public class Rectangle extends Shape{
    private int lenght;
    private int width;


    public Rectangle(int lenght, int width) {
        super("მართკუთხედი");
        this.lenght = lenght;
        this.width = width;
    }
    public Rectangle(int side) {
        this(side, side);
    }
    public void area() {
        int area = lenght * width;
        System.out.println("მართკუთხედის ფართობი: " + area);
    }
    public int getLength() {
        return lenght;
    }
    public int getWidth() {
        return width;
    }
}
