package esercitazioneAlgoritmiche;

public class EsercizioOtto {
    public static void main(String[] args){
        String phrase = "Ciao mondo";
        int indice = phrase.indexOf('o');

        if (indice % 2 == 0){
            System.out.println("L'indice della prima lettera 'o' è pari");
        }else{
            System.out.println("L'indice della prima lettera 'o' è dispari");
        }

    }
}
