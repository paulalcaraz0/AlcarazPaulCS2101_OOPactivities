package Artists;

public class ArtistDemo {
    public static void main(String[] args) {
        // instance of Artist
        Artist artist = new Artist("Charlie Puth", "American", 32, "Music");
        artist.displayInfo();

        System.out.println();

        Singer singer = new Singer("Nayeon Im", "Korean", 29, "Music", Genre.POP);
        singer.displayInfo();

        System.out.println();

        Dancer dancer = new Dancer("George Balanchine", "Grogorian", 120, "Dancing", DanceStyle.BALLET);
        dancer.displayInfo();

        System.out.println();

        Painter painter = new Painter("Pablo Picasso", "Spanish", 91, "Painting", Medium.OIL);
        painter.displayInfo();

        System.out.println();

        Writer writer = new Writer("John Grisham", "German", 69, "Writing", WritingStyle.FICTION);
       writer.displayInfo();
    }
}