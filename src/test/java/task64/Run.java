package task64;

public class Run {
    public static void main(String[] args) {
        System.out.println("Unknown area");

        Rectangle rectangle = new Rectangle(5, 7);
        System.out.println("მართკუთხედის სახეობა: " + rectangle.getRectangleName());
        rectangle.area();

        Rectangle square = new Rectangle(4);
        System.out.println("მართკუთხედის სახეობა: " + square.getSquareName());
        square.area();
    }
}
