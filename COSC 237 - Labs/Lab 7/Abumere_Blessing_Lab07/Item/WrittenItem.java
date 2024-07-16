package Item;

public abstract class WrittenItem extends Item{
    private String author;
    public String getAuthor(){
        return author;
    }

    public WrittenItem(){
        super();
        author = null;
    }

    public WrittenItem(long ID, int copy_count, String title, String author){
        super(ID, copy_count, title);
        this.author = author;
    }

    @Override
    public String toString(){
        return (
            super.toString() + 
            "AUTHOR: " + author + "\n" +
            "NUMBER OF COPIES: " + getCopies() + "\n"
        );
    } 

    @Override
    public boolean equals(Object obj){
        if (obj instanceof WrittenItem == false) return false;

        final WrittenItem other = (WrittenItem) obj;

        return author.equals(other.author) && super.equals(other) ;
    }



}
