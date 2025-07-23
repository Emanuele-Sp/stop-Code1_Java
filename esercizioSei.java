package esercitazioneAlgoritmiche;


import java.time.LocalDate;
import java.time.Period;
import java.time.Year;

public class esercizioSei {
    public static void main(String[] args){
       int annoNascita = 1992;
       int dataOdierna = 2025;

       boolean even;

       if((dataOdierna - annoNascita + 1) % 2 == 0){
           even = true;
       }else{
           even = false;
       }
        System.out.println(even);
    }
}
