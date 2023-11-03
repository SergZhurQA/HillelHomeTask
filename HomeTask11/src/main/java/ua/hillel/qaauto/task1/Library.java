package ua.hillel.qaauto.task1;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<ItemInLibrary> itemInLibraryList = new ArrayList();

    public void printAllItemInLibrary() {
        System.out.println("Items in the library.");

        for (ItemInLibrary i : itemInLibraryList) {
            System.out.println(i);
        }
    }
}
