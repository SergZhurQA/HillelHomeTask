package ua.hillel.qaauto.task1;

public interface ReturnableAndIssued {
    void returningItem(Library library);

    void issuanceItem(Library library);

    static void searchingItem(Library library, String keyWord) {
        int counter = 0;
        for (ItemInLibrary itemInLibrary : library.itemInLibraryList) {
            if (itemInLibrary.getName().equalsIgnoreCase(keyWord) && itemInLibrary.isAvailable()) {
                System.out.printf("The book \"%s\" is available in the library\n", keyWord);
                counter++;
                break;
            } else if (itemInLibrary.getName().equalsIgnoreCase(keyWord)) {
                System.out.printf("The book \"%s\" is in our library, but is currently unavailable.\n", keyWord);
                counter++;
                break;
            }
        }
        if (counter == 0) {
            System.out.printf("This book \"%s\" is not available in the library.\n", keyWord);
        }

    }
}
