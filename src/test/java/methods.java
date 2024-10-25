public class methods {
    public static void main(String[] args) {
        task_2 task_2 = new task_2();
        int number = task_2.findLargest();
        System.out.println("Task_2 = " + number);

        calculateArea calculateArea = new calculateArea();
        double result = calculateArea.calculateArea();
        System.out.println("Task_3 = " + result);

        greet greet = new greet();
        String str = greet.greet("Hello", "Alice!", " ", ",");
        System.out.println("Task_4 შედეგი = " + str);
//        System.out.println("შედეგი = " + greet.greet() + ", " + greet.greet1());


        task5 task5 = new task5();
        System.out.println("შედეგი = " + task5.convertToCelsius(98.6));

    }
}
