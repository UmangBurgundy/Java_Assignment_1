import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCalendarDemo {
    public static void main(String[] args) {
        System.out.println("=== Demonstrating java.util.Date and java.util.Calendar ===\n");

        Date currentDate = new Date();
        System.out.println("1. Current Date object: " + currentDate);
        System.out.println("   Current epoch timestamp (ms): " + currentDate.getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("   Formatted Date & Time: " + sdf.format(currentDate));

        Calendar calendar = Calendar.getInstance();
        System.out.println("\n2. Calendar Details:");
        System.out.println("   Year         : " + calendar.get(Calendar.YEAR));
        System.out.println("   Month (0-11) : " + calendar.get(Calendar.MONTH) + " (1-based: " + (calendar.get(Calendar.MONTH) + 1) + ")");
        System.out.println("   Day of Month : " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("   Hour (24-hr) : " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("   Minute       : " + calendar.get(Calendar.MINUTE));
        System.out.println("   Second       : " + calendar.get(Calendar.SECOND));
        System.out.println("   Time Zone    : " + calendar.getTimeZone().getDisplayName());

        calendar.add(Calendar.DAY_OF_MONTH, 7);
        System.out.println("\n3. Date after 7 days from now: " + sdf.format(calendar.getTime()));
    }
}
