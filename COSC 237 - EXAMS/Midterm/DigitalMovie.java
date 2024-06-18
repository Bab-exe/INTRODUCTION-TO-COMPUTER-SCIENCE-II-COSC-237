public class DigitalMovie extends DigitalItems {
    private String title;
    private String authors;
    private double playTime;
    private String dueDate;
    public DigitalMovie(){
        super();
        this.title = null;
        this.authors = null;
        this.playTime = 0;
        this.dueDate = null;
    }

    public DigitalMovie
    (
        int diID,
        String serial,
        String title,
        String authors,
        double playTime,
        String dueDate
    )
    {
        super(diID, serial);
        this.title = title;
        this.authors = authors;
        this.playTime = (playTime > 0) ? playTime : 0;
        this.dueDate = dueDate;
    }

    //get

    public String getTitle() {
        return this.title;
    }

    public String getAuthors() {
        return this.authors;
    }

    public double getPlayTime() {
        return this.playTime;
    }

    public String getDueDate() {
        return this.dueDate;
    }

    //set

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public void setPlayTime(double playTime) {
        this.playTime = (playTime > 0) ? playTime : 0;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(
            ", title = %s, " +
            "authors = %s, " +
            "playTime = " + this.playTime +
            ", dueDate = %s",

            this.title,
            this.authors,
            this.dueDate
        );
    }

    
    public boolean equals(Object obj) {
        if (!(obj instanceof DigitalMovie)) return false;

        DigitalMovie other = (DigitalMovie) obj;
        return (
            super.equals(other) &&
            this.title.equals(other.title) &&
            this.authors.equals(other.authors) &&
            this.playTime == other.playTime &&
            this.dueDate.equals(other.dueDate)
        );
    }

    //Online Rentals
    
    public boolean checkOnlineAvailability(int id) {
        System.out.println("Checking online availability for DigitalMovie with ID = " + id);
        return true;
    }

    
    public void printOnlineReceipt(int id) {
        System.out.println("Receipt for DigitalMovie with ID = " + id);    
    }

    //digital Items
    
    public void printDueDate() {
        System.out.println("DigitalMovie with " + super.toString() + " is due by: " + this.dueDate);     
    }

    
    public void printDueDateReminder() {
        System.out.println("Reminder: DigitalMovie with " + super.toString() + " will be due by: " + this.dueDate);    
    }
    
    
}