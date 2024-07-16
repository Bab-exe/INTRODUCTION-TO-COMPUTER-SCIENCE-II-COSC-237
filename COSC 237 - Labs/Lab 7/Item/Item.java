/**an abstract superclass called Item and define all common operations on this class
(constructors, getters, setters, equals, toString, print, checkIn, checkOut, addItem, etc).
Have private data for: identification number, title, and number of copies.
 */

package Item;
public abstract class Item{
    private long ID;
    private int copy_count;
    private String title;

    public Item(){
        ID = 0;
        copy_count = 0;
        title = null;
    }
    public Item(long ID, int copy_count, String title){
        this.ID = (ID > 0) ? ID : 0;
        this.copy_count = (copy_count > 0) ? copy_count : 0;
        this.title = title;
    }

    //** prints out string */
    public abstract void print();
    
    //TODO; check this
    public void checkIn(){
        copy_count++;
    }
    public void checkOut(){
        this.copy_count = copy_count > 0 ? (copy_count - 1) : 0;
    }
    public void addItem(){
        copy_count++;
    }


    //get
    public long getID(){
        return ID;
    }
    public int getCopies(){
        return copy_count;
    }
    public String getTitle(){
        return title;
    }
    //set
    public void setID(long ID){
        this.ID = (ID > 0) ? ID : 0;
    }
    public void setCopies(int numCopies){
        this.copy_count = (numCopies > 0) ? numCopies : 0;
    }
    public void setTitle(String title){
        this.title = title;
    }

    @Override 
    public boolean equals(Object obj){
        if (obj instanceof Item == false) return false;

        final Item other = (Item) obj;

        return (
            other.ID == this.ID &&
            other.copy_count == this.copy_count &&
            other.title.equals(this.title)
        );
    }

    @Override
    public String toString(){
        return String.format(
            "ID: %d\n" +
            "TITLE: %s\n" ,
            this.ID, 
            this.title
        );
    }
    
}
