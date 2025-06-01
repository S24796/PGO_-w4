public class Main {
    public static void main(String[] args) {
        BibliotekaMuzyczna biblioteka = new BibliotekaMuzyczna();

        // Dodawanie utworów
        biblioteka.dodajUtwor("Imagine - John Lennon");
        biblioteka.dodajUtwor("Bohemian Rhapsody - Queen");
        biblioteka.dodajUtwor("Let It Be - The Beatles");

        // Wyświetlanie wszystkich utworów
        biblioteka.wyswietlUtwory();

        // Tworzenie playlist
        biblioteka.utworzPlayliste("Rock");
        biblioteka.utworzPlayliste("Relaks");

        // Dodawanie utworów do playlist
        biblioteka.dodajUtworDoPlaylisty("Rock", "Bohemian Rhapsody - Queen");
        biblioteka.dodajUtworDoPlaylisty("Relaks", "Imagine - John Lennon");

        // Wyświetlenie playlist
        biblioteka.wyswietlPlayliste("Rock");
        biblioteka.wyswietlPlayliste("Relaks");

        // Wyszukiwanie
        biblioteka.wyszukajUtwory("let");

        // Usuwanie utworu
        biblioteka.usunUtwor("Let It Be - The Beatles");

        // Po usunięciu
        biblioteka.wyswietlUtwory();
        biblioteka.wyswietlWszystkiePlaylisty();
    }
}
