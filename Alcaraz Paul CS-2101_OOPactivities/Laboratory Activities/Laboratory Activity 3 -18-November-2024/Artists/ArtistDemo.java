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

        Dancer dancer = new Dancer("Nayeon Im", "Korean", 29, "Dancing", DanceStyle.HIPHOP);
        dancer.displayInfo();

        System.out.println();

        Painter painter = new Painter("Nayeon Im", "Korean", 29, "Painting", Medium.CHARCOAL);
        painter.displayInfo();

        System.out.println();

        Writer writer = new Writer("Nayeon Im", "Korean", 29, "Writing", WritingStyle.POETRY);
       writer.displayInfo();
    }
}