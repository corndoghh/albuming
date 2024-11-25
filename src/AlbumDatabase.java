import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class AlbumDatabase {

    public static void main(String[] args) {
        System.out.println("hello");

        Album album = new Album("myArists", "fuckGods", 1920);

        album.appendTrack(new Track("Everyone Dies", "1:03:01"));

        System.out.println(Arrays.toString(album.getTracks()[0].getDuration()));

        try {
            File myObj = new File("src/albums.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                // System.out.println(data);
                String splitter = "[:\\::\\-]";
                String[] splitData = data.split(splitter);
                String splitter2 = "[()\\:]";
                String[] splitData2 = data.split(splitter2);

                // if (splitData[0] != "0") {
                //     System.out.println("This is a album line, name: " + splitData[0]);
                // } else {
                //     System.out.println("its a song");
                // }

                try {
                    Integer.parseInt(splitData[0]);
                    Duration duration = new Duration(data.split(" ")[0]);
                    System.out.println(Arrays.toString(duration.getDuration()));



                } catch (Exception e) {
                    String artist = splitData[0];
                    String title = splitData2[1];
                    String year = splitData2[2];
                    System.out.println("This is the artist: " + artist + ", and this is the album title: " + title + "and this is the year: " + year);

                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
