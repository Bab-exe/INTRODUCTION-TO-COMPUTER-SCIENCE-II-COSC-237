package WrittenItem;

public class Book extends Item.WrittenItem{
    
    public Book(){
        super();
    }

    public Book(long ID, int copy_count, String title, String author){
        super(ID, copy_count, title, author);
    }

    public void print(){
        System.out.println(toString());
    }

    //book is same as written item

}
