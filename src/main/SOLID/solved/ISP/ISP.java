package main.SOLID.solved.ISP;

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

    interface BookCitation {
        String generateCitation(BookRef book);
    }

    interface JournalCitation {
        String generateCitation(JournalRef journal);
    }

    class BookAPA implements BookCitation {
        @Override
        public String generateCitation(BookRef book){
            return book.author + " (" + book.year + "). " + book.title + ". " + book.city + ": " + book.publisher;
        }
    }

    class BookIEEE implements BookCitation {
        @Override
        public String generateCitation(BookRef book){
            return book.author + ", " + book.title + ", " + book.city + ": " + book.publisher + ", " + book.year;
        }
    }

    class JournalAPA implements JournalCitation {
        @Override
        public String generateCitation(JournalRef journal){
            return journal.author + " (" + journal.year + "). " + journal.title + ". " + journal.journalName + ", " +
                    journal.volume + "(" + journal.issue + ")," + journal.pages;
        }
    }

    class JournalIEEE implements JournalCitation {
        @Override
        public String generateCitation(JournalRef journal){
            return journal.author + ", \"" + journal.title + "\" " + journal.journalName + ", vol. " + journal.volume
                    + ", no. " + journal.issue + ", p. " + journal.pages + ", " + journal.year;
        }
    }
}
