package Item;

public abstract class MediaItem extends Item {
    private int runtime;
    public int getRuntime(){
        return runtime;
    }
    public void setRuntime(int runtime){
        this.runtime = (runtime > 0) ? runtime : 0;
    }
    
    public MediaItem(){
        super();
        runtime = 0;
    }
    public MediaItem(long ID, int copy_count, String title, int runtime){
        super(ID, copy_count, title);
        this.runtime = (runtime > 0) ? runtime : 0;
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof MediaItem == false) return false;

        final MediaItem other = (MediaItem) obj;

        return runtime == other.runtime && super.equals(other);
    }

    @Override
    public String toString(){
        return (
            super.toString() + 
            "RUNTIME: " + runtime + "\n" +
            "NUMBER OF COPIES: " + super.getCopies() + "\n"
        );
    }
}
