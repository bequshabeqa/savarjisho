package task_7_2;

public class SMSNotification extends Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("sent by SMS: " + message);
    }
    public void sendNotification() {
        System.out.println("snet by SMS service: ");
    }
}