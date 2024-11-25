package main.SOLID.violated.ISP;

public class ISP {
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

    public class JournalRef {
        String title;
        String author;
        String journalName;
        int year;
        String pages;
        String volume;
        int issue;

        public JournalRef(String title, String author, String journalName, int year, String pages, String volume, int issue) {
            this.title = title;
            this.author = author;
            this.journalName = journalName;
            this.year = year;
            this.pages = pages;
            this.volume = volume;
            this.issue = issue;
        }
    }

    //doing the same thing but for a different model class would force the citation classes that implement it to...
    //... create dummy implementations of the other one.
    interface Citation {
        String generateCitation(BookRef book);
        String generateCitation(JournalRef journal);
    }

    class BookAPA implements Citation {
        @Override
        public String generateCitation(BookRef book){
            return book.author + " (" + book.year + "). " + book.title + ". " + book.city + ": " + book.publisher;
        }

        //the class is strictly for printing APA style citation for books, it cannot do the same for journals
        @Override
        public String generateCitation(JournalRef journal) {
            return null;
        }
    }

    class BookIEEE implements Citation {
        @Override
        public String generateCitation(BookRef book){
            return book.author + ", " + book.title + ", " + book.city + ": " + book.publisher + ", " + book.year;
        }

        @Override
        public String generateCitation(JournalRef journal) {
            return null;
        }
    }
}
