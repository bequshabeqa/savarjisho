package dav_7.task1;

public class run {
    public static void main(String[] args) {
        System.out.println("ინფორმაცია გეომეტრიული ფიგურაზე: ");

        Circle circle = new Circle();
        startDrawing(circle);

        Rectangle rectangle = new Rectangle();
        startDrawing(rectangle);

        Triangle triangle = new Triangle();
        startDrawing(triangle);

    }
    static void startDrawing(Shape shape) {
        shape.draw();
    }
}
