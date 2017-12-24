import java.util.*;

public class JavaDateandTime {
    public static String getDay(String day, String month, String year) {    
       Calendar calendar = Calendar.getInstance();
       calendar.setTime(new Date(month+"/"+day+"/"+year));        
       return (calendar.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG,new Locale("en"))).toUpperCase();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
    }
}
