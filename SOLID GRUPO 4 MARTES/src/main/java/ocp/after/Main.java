package ocp.after;

public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        
        Notification email = new EmailNotification();
        Notification sms = new SMSNotification();
        Notification push = new PushNotification();
        
        service.sendNotification(email, "Hello via Email!");
        service.sendNotification(sms, "Hello via SMS!");
        service.sendNotification(push, "Hello via Push Notification!");
    }
}