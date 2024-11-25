package main.SOLID.violated.SRP;

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

        public String citation() {
            return author + " (" + year + "). " + title + ". " + city + ": " + publisher;
        }
    }
}
