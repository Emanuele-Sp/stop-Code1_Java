package esercitazioneAlgoritmiche;

import java.sql.Timestamp;
import java.time.Instant;

public class EsercizioDue {
    public static void main(String[] args){
        Byte eta = 33;
        Long Timestamp = Instant.now().getEpochSecond();
        Double redditoMedio = 2000.00;
        String nomeCognome = "Emanuele Spataro";
        boolean maggiorenne;
        char inizialeNome = nomeCognome.charAt(0);

        if(eta >= 18){
            maggiorenne = true;
        }else{
            maggiorenne = false;
        }


        System.out.println(eta);
        System.out.println(Timestamp);
        System.out.println(redditoMedio);
        System.out.println(nomeCognome);
        System.out.println(maggiorenne);
        System.out.println(inizialeNome);
    }
}
