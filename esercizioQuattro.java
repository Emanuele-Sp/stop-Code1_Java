package esercitazioneAlgoritmiche;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class esercizioQuattro {
    public static void main(String[] args) {

        LocalDate dataNascita = LocalDate.of(1992, 6, 4);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataNascitaF = dataNascita.format(formato);
        LocalDate dataAttuale = LocalDate.now();

        Period eta = Period.between(dataNascita,dataAttuale);
        int anni = eta.getYears();



        boolean maggiorenne;
        if(anni >= 18){
           maggiorenne = true;
        }else{
          maggiorenne = false;
        }

        System.out.println(anni);
        System.out.println(dataNascitaF);
        System.out.println(dataAttuale);
        System.out.println(maggiorenne);

    }
}
