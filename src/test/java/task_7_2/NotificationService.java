package task_7_2;

public class NotificationService {
    public static void sendAlert(Notification notification, String message) {
        notification.sendNotification(message);
    }
}
