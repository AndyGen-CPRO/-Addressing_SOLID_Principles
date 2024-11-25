package main.SOLID.solved.OCP;

public class OCP {
    public class BookRef {
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

    interface Citation { //now this keeps it closed for modifications
        String generateCitation(BookRef book);
    }

    class APA implements Citation{ //the styles of citation are now on their own classes
        @Override
        public String generateCitation(BookRef book){
            return book.author + " (" + book.year + "). " + book.title + ". " + book.city + ": " + book.publisher;
        }
    }

    class IEEE implements Citation{
        @Override
        public String generateCitation(BookRef book){
            return book.author + ", " + book.title + ", " + book.city + ": " + book.publisher + ", " + book.year;
        }
    }
}
