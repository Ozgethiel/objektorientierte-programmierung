package probePrufung.generics.Song;

public class Radio {

    public static void main(String[]args) {
        Artist artist1 = new Artist("The Beatles");
        Artist artist2 = new Artist("The Rolling Stones");

        Song name = new Song("Here comes the sun",185, artist1);
        Song name2= new Song("Paint it black",202,artist2);

        System.out.println(name.getName() + " von " + artist1.getName() + " mit der Länge " + name.getLength() + " Sekunden ");
        System.out.println(name2.getName() + " von " + artist2.getName() + " mit der Länge " + name2.getLength() + " Sekunden ");
    }
}
