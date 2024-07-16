import WrittenItem.*;
import MediaItem.*;

public class test {
    public static void main(String[] args) {
        long ID = 123456;
        String title = "To kill a mocking bird";
        String author = "Harper Lee";
        int copy_count = 5;

        
        short year = 1981;
        int runtime = 215;
        
        

        Book book = new Book(ID, copy_count, title, author);
        JournalPaper journalPaper = new JournalPaper(ID, copy_count, title, author, year);


        String genre = "drama",
            director = "Francis Ford Coppola",
            artist = "An Artist";
        
        title = "The Godfather";
        copy_count = 3;
        ID = 1111;


        Video video = new Video(ID, copy_count, title, runtime, director, genre, year);
        CD cd = new CD(ID, copy_count, title, runtime, artist, genre);

        WrittenTest(book, journalPaper);
        MediaTest(cd, video);
        
    }

    static void MediaTest(CD cd,Video video){
        System.out.println("\nDisplay info about a video");
            video.print();

        System.out.println("After the video was checked-in, the number of copies changed. The new info is:");
            video.checkIn();
            video.print();

        System.out.println("After the video was checked-out, the number of copies changed. The new info is:");
            video.checkOut();
            video.print();

        System.out.println("Display info about a CD");
            cd.print();

    }

    static void WrittenTest(Book book,JournalPaper journalPaper){
        System.out.println("\nDisplay info about a book");
            book.print();
            book.checkOut();
        System.out.println("After the book was checked-out, the number of copies changed. The new info is:");
            book.print();
            book.checkIn();
        System.out.println("After a new copy of this book was added, the number of copies changed. The new info is:");
            book.print();

        System.out.println("Display info about a journal paper");
            journalPaper.print();
    }
}
