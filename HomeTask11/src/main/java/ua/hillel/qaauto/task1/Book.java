package ua.hillel.qaauto.task1;


public class Book extends ItemInLibrary {
    String author;
    Genre genre;

    public Book(String type, String name, Genre genre, String author, boolean available) {
        super(type, name, available);
        this.genre = genre;
        this.author = author;
    }

    @Override
    public void addItemToLibrary(Library library) {
        library.itemInLibraryList.add(this);
        System.out.printf("The book \"%s\" added to the library.\n", this.getName());
    }

    @Override
    public String toString() {
        return "Book\n" +
                "type: " + type + "\n" +
                "name: " + name + "\n" +
                "author: " + author + "\n" +
                "genre: " + genre + "\n" +
                "available: " + available;
    }
}
