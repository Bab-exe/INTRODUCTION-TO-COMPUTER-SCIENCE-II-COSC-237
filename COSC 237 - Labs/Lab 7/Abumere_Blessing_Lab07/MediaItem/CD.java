package MediaItem;

public class CD extends Item.MediaItem{
    private String artist,genre;
    
    public CD(){
        super();
    }
    public CD(long ID, int copy_count, String title, int runtime, String artist, String genre){
        super(ID, copy_count, title, runtime);
        this.artist = artist;
        this.genre = genre;
    }

    public void print(){
        System.out.println(toString());
    }

    //get
    public String getArtist(){
        return artist;
    }
    public String getGenre(){
        return genre;
    }
    
    //set
    public void setArtist(String artist){
        this.artist = artist;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }

    @Override
    public String toString(){
        return (
            super.toString() + 
            "ARTIST: " + artist + "\n" + 
            "GENRE: " + genre + "\n"
        );
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof CD == false) return false;

        final CD other = (CD) obj;

        return (
            artist.equals(other.artist) &&
            genre.equals(other.genre) &&
            super.equals(other)
        );
    }

    
}
