import java.util.LinkedList;

public class test {
    private LinkedList<String> songs;
    private int capacity;

    public test(int capacity) {
        this.capacity = capacity;
        songs = new LinkedList<>();
    }

    public void playSong(String song) {

        if (songs.size() >= capacity) {
            songs.removeLast();
        }

        songs.addFirst(song);
    }

    public void displayPlaylist() {
        System.out.println("Current Playlist:");
        for (String song : songs) {
            System.out.println(song);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        test playlist = new test(3);

        playlist.playSong("s1");
        playlist.playSong("s2");
        playlist.playSong("s3");
        playlist.displayPlaylist(); // Output: s3, s2, s1

        playlist.playSong("s4");
        playlist.displayPlaylist(); // Output: s4, s3, s2

        playlist.playSong("s2");
        playlist.displayPlaylist(); // Output: s2, s4, s3

        playlist.playSong("s1");
        playlist.displayPlaylist(); // Output: s1, s2, s4
    }
}
