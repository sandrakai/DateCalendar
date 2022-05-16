import java.util.Date;

public class DateGetTime {
    public static void main(String[] args) {
        
        //getTime() devuelve una variable de tipo long
        //Representa una fecha que son los milisegundos transcurridos desde 1 de enero de 1970

        long j=0;

        Date ahora = new Date();
        long resAhora = ahora.getTime();
        System.out.println("resAhora = " + resAhora);


        for (int i=0;i<10000000;i++){
            j+=i;
        }

        Date despues = new Date();
        long resDespues = despues.getTime();
        System.out.println("resDespues = " + resDespues);

        int tiempoTranscurrido = (int) (resAhora - resDespues);
        System.out.println("tiempoTranscurrido = " + tiempoTranscurrido);
    }
}
