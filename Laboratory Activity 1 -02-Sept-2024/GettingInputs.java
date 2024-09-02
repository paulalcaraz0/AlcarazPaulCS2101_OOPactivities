import java.util.Scanner;

class GettingInputs {
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);
       
        System.out.print("Enter the year: ");
        int year = myObj.nextInt();
        myObj.nextLine();

        System.out.print("Enter the genre: ");
        String genre = myObj.nextLine();

        System.out.print("Enter the album: ");
        String album = myObj.nextLine();

        

        System.out.print("Enter the song title: ");
        String song_title = myObj.nextLine();

        System.out.print("Enter the artist: ");
        String artist = myObj.nextLine();

        System.out.println("--------------------");
        System.out.println("SONG DETAILS");
        System.out.println("--------------------");

        System.out.println("Year Released: " + year );
        System.out.println("Genre: " + genre);
        System.out.println("Album: " + album );
        System.out.println("Title: \"" + song_title + "\"");
        System.out.println("Artist: " + artist );
        
        }
}
