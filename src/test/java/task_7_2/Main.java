package task_7_2;

public class Main {
    public static void main(String[] args) {
        Notification emailNotification = new EmailNotification();
        Notification smsNotification = new SMSNotification();


        System.out.println("Sending alerts: ");
        NotificationService.sendAlert(emailNotification, "Email alert. ");
        NotificationService.sendAlert(smsNotification, "SMS verification alert. ");


        System.out.println("with polymorphism ");
        sendEmailAlert(emailNotification);
        sendSMSAlert(smsNotification);

    }

    private static void sendEmailAlert(Notification emailNotification) {
        emailNotification.sendNotification("Email alert. ");
    }
    private static void sendSMSAlert(Notification smsNotification) {
        smsNotification.sendNotification("SMS verification alert. ");
    }

    public static void sendAlert(EmailNotification emailNotification) {
        emailNotification.sendNotification();
    }

}
