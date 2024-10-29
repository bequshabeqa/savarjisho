package task_7_2;

public class EmailNotification extends Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("sent by email: " + message);
    }

    public void sendNotification() {
        System.out.println("snet by email service: ");
    }
}