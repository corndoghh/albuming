import java.util.Arrays;

public class AlbumDatabase {

    public static void main(String[] args) {
        System.out.println("hello");


        Album album = new Album("myArists", "fuckGods", 1920);

        album.appendTrack(new Track("Everyone Dies", "1:03:01"));

        System.out.println(Arrays.toString(album.getTracks()[0].getDuration()));
    }

}
