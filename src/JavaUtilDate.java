import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtilDate {

    public static void main(String[] args) {

        Date miFecha = new Date();
        System.out.println("miFecha = " + miFecha);
        //SimpleDateFormat miFormato = new SimpleDateFormat("dd MMMM yyyy");
        SimpleDateFormat miFormato = new SimpleDateFormat("dd 'de ' MMMM 'de' yyyy");
        String resultado = miFormato.format(miFecha);
        System.out.println("resultado = " + resultado);
    }
}
