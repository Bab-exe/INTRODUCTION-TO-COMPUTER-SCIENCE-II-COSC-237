package WrittenItem;

public class JournalPaper extends Item.WrittenItem{
    private short YEAR;
    public short getYear(){
        return YEAR;
    }
    public void setYear(short YEAR){
        this.YEAR = (YEAR > 0) ? YEAR : 0;
    }
    
    public JournalPaper(){
        super();
        YEAR = 0;
    }   
    public JournalPaper(long ID, int copy_count, String title, String author, short YEAR){
        super(ID, copy_count, title, author);
        this.YEAR = (YEAR > 0) ? YEAR : 0;
    }

    public void print(){
        System.out.println(toString());
    }

    @Override
    public String toString(){
        return (
            super.toString() + "YEAR PUBLISHED: " + YEAR + "\n"
        );
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof JournalPaper == false) return false;

        final JournalPaper other = (JournalPaper) obj;

        return super.equals(other) && YEAR == other.YEAR;
    }

    

}
