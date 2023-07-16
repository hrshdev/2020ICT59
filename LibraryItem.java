abstract class LibraryItem {
    private String title;
    private String itemID;
    private boolean isCheckedOut;

    public LibraryItem(String title, String itemID) {
        this.title = title;
        this.itemID = itemID;
        this.isCheckedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public String getItemID() {
        return itemID;
    }

    public void checkOut() {
        isCheckedOut = true;
		System.out.println(title + " is Checked Out");
    }

    public void checkIn() {
        isCheckedOut = false;
		System.out.println(title + " is Checked In");
    }

    public void displayItemDetails() {
        System.out.println("Item Tiltle : " + title);
        System.out.println("Item ID : " + itemID);
        System.out.println("Checked out: " + (isCheckedOut ? "Yes" : "No"));
    }
}