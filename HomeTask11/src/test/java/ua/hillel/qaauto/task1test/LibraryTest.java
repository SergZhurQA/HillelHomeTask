package ua.hillel.qaauto.task1test;

import org.testng.annotations.Test;
import ua.hillel.qaauto.task1.*;


public class LibraryTest {

    @Test
    void creatingAndPrintingItemsInLibraryTest() {
        Library library = new Library();

        Book book = new Book("book", "1984", Genre.FANTASY, "George Orwell", true);
        Magazine magazine = new Magazine("magazine", "Cosmopolitan", 50, 2014, true);
        AudioBook audioBook = new AudioBook("audiobook", "It", "Stephen King", Genre.HORROR, 22.3, true);

        System.out.println(book);
        System.out.println(magazine);
        System.out.println(audioBook);

        book.addItemToLibrary(library);
        magazine.addItemToLibrary(library);
        audioBook.addItemToLibrary(library);

        library.printAllItemInLibrary();
    }

    @Test
    void returningAndIssuedTest() {
        Library library = new Library();

        Book book = new Book("book", "1984", Genre.FANTASY, "George Orwell", true);

        book.addItemToLibrary(library);
        book.issuanceItem(library);
        System.out.println(book.isAvailable());

        book.returningItem(library);
        System.out.println(book.isAvailable());
    }

    @Test
    void searchByKeyWordTest() {
        Library library = new Library();

        Magazine magazine = new Magazine("magazine", "Cosmopolitan", 50, 2014, true);
        AudioBook audioBook = new AudioBook("audiobook", "It", "Stephen King", Genre.HORROR, 22.3, true);

        magazine.addItemToLibrary(library);
        audioBook.addItemToLibrary(library);

        ReturnableAndIssued.searchingItem(library, "Cosmopolitan");
        magazine.issuanceItem(library);
        ReturnableAndIssued.searchingItem(library, "Cosmopolitan");

        ReturnableAndIssued.searchingItem(library, "The Witcher");


    }
}
