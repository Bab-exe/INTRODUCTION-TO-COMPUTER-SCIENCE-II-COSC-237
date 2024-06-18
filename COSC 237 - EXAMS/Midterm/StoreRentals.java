public interface StoreRentals {
    /**Prints out “Checking store availability for <Object> with ID = <id>”
    e.g., “Checking store availability for Book/DVD with ID = 30”. Always returns TRUE.*/
    public boolean checkStoreAvailability(int id);
    /**This function prints out “Receipt for <Object> with ID = <id>”
    e.g., “Receipt for Book/DVD with ID = 30” */
    public void printStoreReceipt(int id);
    @Override
    public boolean equals(Object obj);
    @Override
    public String toString();
    }