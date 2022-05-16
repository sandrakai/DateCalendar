import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtilParse {
    public static void main(String[] args) {
        SimpleDateFormat miFormato = new SimpleDateFormat("dd/MM/yyyy");

        String fechaString = JOptionPane.showInputDialog("Introduce una fecha con el siguiente formato: dd/mm/año");

        try {
            Date fechaDate = miFormato.parse(fechaString);
            System.out.println(fechaDate);
            System.out.println(miFormato.format(fechaDate));
        } catch (ParseException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"La fecha introducida no es correcta");
        }
    }
}
