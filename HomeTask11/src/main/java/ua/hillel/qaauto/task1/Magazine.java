package ua.hillel.qaauto.task1;

public class Magazine extends ItemInLibrary {
    int issueNumber, yearOfIssue;

    public Magazine(String type, String name, int issueNumber, int yearOfIssue, boolean available) {
        super(type, name, available);
        this.issueNumber = issueNumber;
        this.yearOfIssue = yearOfIssue;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    @Override
    public void addItemToLibrary(Library library) {
        library.itemInLibraryList.add(this);
        System.out.printf("The magazine \"%s\" number %d added to the library.\n", this.getName(), this.getIssueNumber());
    }

    @Override
    public String toString() {
        return "Magazine\n" +
                "type: " + type + "\n" +
                "name: " + name + "\n" +
                "issueNumber: " + issueNumber + "\n" +
                "yearOfIssue: " + yearOfIssue + "\n" +
                "available: " + available;
    }
}
