public interface OnlineRentals {
    /**Prints out “Checking online availability for <Object> with ID = <id>”
    e.g., “Checking online availability for Book/DVD with ID = 30”. Always returns TRUE.
    */
    public boolean checkOnlineAvailability(int id);
    /**Prints out “Receipt for <Object> with ID = <id>”
     e.g., “Receipt for Book/DVD with ID = 30”
    */public void printOnlineReceipt(int id);
    public boolean equals(Object obj);
    public String toString();
    }