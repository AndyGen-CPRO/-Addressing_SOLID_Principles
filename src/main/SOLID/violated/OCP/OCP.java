package main.SOLID.violated.OCP;

public class OCP {
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

    class CitationGenerator {
        public String generateBookAPA(BookRef book) {
            return book.author + " (" + book.year + "). " + book.title + ". " + book.city + ": " + book.publisher;
        }
        public String generateBookIEEE(BookRef book){
            return book.author + ", " + book.title + ", " + book.city + ": " + book.publisher + ", " + book.year;
        }
    }
}
