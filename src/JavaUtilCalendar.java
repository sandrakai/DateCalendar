import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class JavaUtilCalendar {
    public static void main(String[] args) {
        
        Calendar calendario = Calendar.getInstance();
        calendario.set(2022,5,12,16,50,50);
        Date miDate = calendario.getTime();
        System.out.println("midate = " + miDate);
        System.out.println("calendario = " + calendario);

        SimpleDateFormat fechaBonita = new SimpleDateFormat("dd/MM/yy");
        System.out.println(fechaBonita.format(miDate));
    }
}
