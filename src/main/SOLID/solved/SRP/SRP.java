package main.SOLID.solved.SRP;

public class SRP {
    class BookRef {
        String title;
        String author;
        int year;
        String city;
        String publisher;

        public BookRef(String title, String author, int year, String city, String publisher){
            this.title = title;
            this.author = author;
            this.year = year;
            this.city = city;
            this.publisher = publisher;
        }
    }

    class CitationGenerator { //generating citation is now on its own class, BookRef now has a single responsibility
        public String generateBookAPA(BookRef book) {
            return book.author + " (" + book.year + "). " + book.title + ". " + book.city + ": " + book.publisher;
        }
    }
}
