package probePrufung.generics.Song;

public class Song {
    private String name;
    private int length;
    private Artist artist;

    public Song(String name, int length, Artist artist) {
        this.name = name;
        this.length = length;
        this.artist = artist;
    }

    public String getName() {
        return name;
    }


    public int getLength() {
        return length;
    }

    public Artist getArtist() {
        return artist;
    }

}