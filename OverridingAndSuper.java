public class OverridingAndSuper {
    static class BaseNotification {
        void send(String msg) { System.out.println("Base notification: " + msg); }
    }

    static class EmailNotification extends BaseNotification {
        @Override
        void send(String msg) {
            super.send(msg);
            System.out.println("Email notification sent.");
        }
    }

    public static void main(String[] args) {
        EmailNotification email = new EmailNotification();
        email.send("Account Alert");
    }
}
