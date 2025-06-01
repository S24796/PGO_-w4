public class Main {
    public static void main(String[] args) {
        BibliotekaMuzyczna biblioteka = new BibliotekaMuzyczna();


        biblioteka.dodajUtwor("Imagine - John Lennon");
        biblioteka.dodajUtwor("Bohemian Rhapsody - Queen");
        biblioteka.dodajUtwor("Let It Be - The Beatles");


        biblioteka.wyswietlUtwory();


        biblioteka.utworzPlayliste("Rock");
        biblioteka.utworzPlayliste("pop");


        biblioteka.dodajUtworDoPlaylisty("Rock", "Bohemian Rhapsody - Queen");
        biblioteka.dodajUtworDoPlaylisty("pop", "Imagine - John Lennon");


        biblioteka.wyswietlPlayliste("Rock");
        biblioteka.wyswietlPlayliste("pop");


        biblioteka.wyszukajUtwory("let");


        biblioteka.usunUtwor("Let It Be - The Beatles");


        biblioteka.wyswietlUtwory();
        biblioteka.wyswietlWszystkiePlaylisty();
    }
}
