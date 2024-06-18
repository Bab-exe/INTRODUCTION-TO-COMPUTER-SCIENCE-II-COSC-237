

public class Book extends PhysicalItems {

    private String isbn;
    private String authors;
    private String title;
    private int numCopies;
    private String dueDate;

    public Book(){
        super();
        this.isbn = null;
        this.authors = null;
        this.title = null;
        this.numCopies = 0;
        this.dueDate = null;
    }

    public Book
    (
        int phyID,
        int storeID,
        String isbn, 
        String authors, 
        String title, 
        int numCopies, 
        String dueDate
    )
    {
        super(phyID, storeID);
        this.isbn = isbn;
        this.authors = authors;
        this.title = title;
        this.numCopies = (numCopies > 0) ? numCopies : 0;
        this.dueDate = dueDate;
    }

    //get
    public String getISBN(){
        return this.isbn;
    }

    public String getAuthors(){
        return this.authors;
    }

    public String getTitle(){
        return this.title;
    }

    public int getNumCopies(){
        return this.numCopies;
    }

    public String getDueDate(){
        return this.dueDate;
    }

    //set
    public void setISBN(String isbn){
        this.isbn = isbn;
    }

    public void setAuthors(String authors){
        this.authors = authors;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setNumCopies(int numCopies){
        this.numCopies = (numCopies > 0) ? numCopies : 0;
    }

    public void setDueDate(String dueDate){
        this.dueDate = dueDate;
    }

    //override
    @Override
    /**. Note: function toString() in any class should print out all variables in that class separated by a comma, e.g.,
“phyID = <phyID>, storeID = <storeID>, ...” */
    public String toString(){
        return String.format(
            "isbn = %s, " +
            "authors = %s, " +
            "title = %s, " +
            "numCopies = %d, " +
            "dueDate = %s" ,

            this.isbn,
            this.authors,
            this.title,
            this.numCopies,
            this.dueDate
        );
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Book)) return false;

        Book other = (Book) obj;

        return (
            super.equals(other) &&
            this.isbn.equals(other.isbn) &&
            this.authors.equals(other.authors) &&
            this.title.equals(other.title) &&
            this.numCopies == other.numCopies &&
            this.dueDate.equals(other.dueDate)
        );
    }


    //abstract required
   
    ///Physical Items
    /** // Prints out “<Object> with phyID=<phyID>, storeID=<storeID> is due by: <dueDate>” where dueDate is the sub-class’s variable */
    public void printDueDate() {
        System.out.printf(
            "Book with phyID = %d, storeID = %d, is due by: %s",

            super.getPhyID(),
            super.getStoreID(),
            this.dueDate
        );
        System.out.println();
    }
    
    public void printDueDateReminder() {
        System.out.println(
            "Reminder: Book with " + super.toString() + " will be due by: " + this.dueDate
        );
        
    }

    
    ///OnlineRentals
    public void printOnlineReceipt(int id) {
        System.out.println("Receipt for Book with ID = " + id);
    }
    public boolean checkOnlineAvailability(int id) {
        System.out.println("Checking online availability for Book with ID = " + id);
        return true;
    }


    ///StoreRentals
    public boolean checkStoreAvailability(int id) {
        System.out.println("Checking store availability for Book with ID = " + id);
        return true;
    }
    
    public void printStoreReceipt(int id) {
        System.out.println("Receipt for Book with ID = " + id);
    }
    
        
}
