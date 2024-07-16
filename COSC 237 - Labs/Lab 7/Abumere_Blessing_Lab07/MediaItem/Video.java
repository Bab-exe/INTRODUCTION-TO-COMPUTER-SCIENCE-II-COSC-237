package MediaItem;

public class Video extends Item.MediaItem {
    private String director,genre;
    private short year;

    public Video(){
        super();
        director = null;
        genre = null;
        year = 0;
    }

    public Video(long ID, int copy_count, String title, int runtime, String director, String genre, short year){
        super(ID, copy_count, title, runtime);
        this.director = director;
        this.genre = genre;
        this.year = (year > 0) ? year : 0;
    }

    public void print(){
        System.out.println(toString());
    }

    //get
    public String getDirector(){
        return director;
    }
    public String getGenre(){
        return genre;
    }
    public short getYear(){
        return year;
    }

    //set
    public void setDirector(String director){
        this.director = director;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public void setYear(short year){
        this.year = (year > 0) ? year : 0;
    }

    @Override
    public String toString(){
        return (
            super.toString() + 
            "DIRECTOR: " + director + "\n" + 
            "GENRE: " + genre + "\n" +
            "YEAR RELEASED: " + year + "\n"
        );
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof Video == false) return false;

        final Video other = (Video) obj;

        return (
            year == other.year &&
            director.equals(other.director) &&
            genre.equals(other.genre) &&
            super.equals(other)
        );
    }
}
