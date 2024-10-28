package Task65;

public class Run {
    public static void main(String[] args) {

        Employee employee = new Employee("bekaaa", 7500.0);
        System.out.println("მომხმარებლის ინფორმაცია: ");
        employee.displayDetails();

        System.out.println();

        Manager manager = new Manager("nika", 3200,"ხარისხის უზრუნველყოფა");
        System.out.println("მენეჯერის ინფორმაცია: ");
        manager.displayDetails();
    }
}
