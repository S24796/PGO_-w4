import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();

        lista.add("Rock");
        lista.add("Pop");
        lista.add("Rap");
        lista.add("Punk");

        System.out.println(lista);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println( "Playlista" + i + ": " + lista.get(i));
        }


        lista.remove("Rap");
        System.out.println(lista);

        ArrayList<Integer> listaInteger = new ArrayList<>();
        System.out.println("==============");

        Playlista playlista = new Playlista("Rock");
        playlista.dodajUtwor("Like a Rolling Stone - Bob Dylan");
        playlista.dodajUtwor("(I Can't Get No) Satisfaction - The Rolling Stones");
        playlista.dodajUtwor(null);
        playlista.dodajUtwor("");
        playlista.dodajUtwor("Imagine - John Lennon");

        playlista.wyswietlUtwory();
        System.out.println("==============");

        playlista.usunUtwor("Imagine - John Lennon");
        playlista.usunUtwor(null);
        playlista.usunUtwor("");
        playlista.usunUtwor("Test3");
        playlista.wyswietlUtwory();
        System.out.println("==============2");



        playlista.wyszukajUtwory("Rolling");
        playlista.wyszukajUtwory("i");
        playlista.wyszukajUtwory(null);
        playlista.wyszukajUtwory("");
    }

}