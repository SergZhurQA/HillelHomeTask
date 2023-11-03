package ua.hillel.qaauto.task1;


abstract class ItemInLibrary implements ReturnableAndIssued {
    String type, name;
    boolean available;

    public ItemInLibrary(String type, String name, boolean available) {
        this.type = type;
        this.name = name;
        this.available = available;
    }

    public abstract void addItemToLibrary(Library library);

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public void returningItem(Library library) {
        library.itemInLibraryList.get(library.itemInLibraryList.indexOf(this)).setAvailable(true);
        System.out.printf("The %s \"%s\" has been returned to the library.\n", this.getType(), this.getName());
    }

    @Override
    public void issuanceItem(Library library) {
        if (this.isAvailable()) {
            library.itemInLibraryList.get(library.itemInLibraryList.indexOf(this)).setAvailable(false);
            System.out.printf("The %s \"%s\" was issued.\n", this.getType(), this.getName());
        } else {
            System.out.printf("The %s is out \"%s\" of stock. Need to wait until it is returned.\n", this.getType(), this.getName());
        }
    }

    @Override
    public String toString() {
        return "ItemInLibrary\n" +
                "type: " + type +
                "name: " + name +
                "available: " + available;
    }
}
