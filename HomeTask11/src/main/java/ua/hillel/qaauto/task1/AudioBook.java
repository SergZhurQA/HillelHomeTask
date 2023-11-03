package ua.hillel.qaauto.task1;

public class AudioBook extends ItemInLibrary {
    double durationInHours;
    String author;
    Genre genre;

    public AudioBook(String type, String name, String author, Genre genre, double durationInHours, boolean available) {
        super(type, name, available);
        this.genre = genre;
        this.author = author;
        this.durationInHours = durationInHours;
    }

    @Override
    public void addItemToLibrary(Library library) {
        library.itemInLibraryList.add(this);
        System.out.printf("The audiobook \"%s\" added to the library.\n", this.getName());
    }

    @Override
    public String toString() {
        return "AudioBook\n" +
                "type: " + type + "\n" +
                "name: " + name + "\n" +
                "genre: " + genre + "\n" +
                "author: " + author + "\n" +
                "durationInHours: " + durationInHours + "\n" +
                "available: " + available;
    }
}
