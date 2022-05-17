import javax.swing.*;

public class Formulario {
    public static void main(String[] args) {

       // String pedirFecha = JOptionPane.showInputDialog(null, "Introduce el día", "INTRODUCIR FECHA", JOptionPane.INFORMATION_MESSAGE);
//Mucho más
        JPanel panel = new JPanel();
        JLabel textoDia = new JLabel("Día");
        JLabel textoMes = new JLabel("Mes");
        JLabel textoAnyo = new JLabel("Año");
        JTextField dia = new JTextField(2);
        JTextField mes = new JTextField(2);
        JTextField anyo = new JTextField(4);
        panel.add(textoDia);
        panel.add(dia);
        panel.add(textoMes);
        panel.add(mes);
        panel.add(textoAnyo);
        panel.add(anyo);

        JOptionPane.showMessageDialog(null, panel,"Introducir fecha",JOptionPane.INFORMATION_MESSAGE);


        String cadenaDia = dia.getText();
        String cadenaMes = mes.getText();
        String cadenaAnyo = anyo.getText();

        System.out.println(cadenaDia +"/"+ cadenaMes + "/"+cadenaAnyo);



    }
}
