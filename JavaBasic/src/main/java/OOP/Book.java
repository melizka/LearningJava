package OOP;

public class Book {

    String title;
    String author;
    int year;

    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    void printInfo() {
        System.out.println(title + ": Harry Potter" + author + ":J.K. Rowling" + year + ": 1997.");
    }
}

    class Ebook extends Book {
        double filesize;

        Ebook(String title, String author, int year, double filesize) {
            super(title, author, year);
            this.filesize = filesize;
        }

        @Override
        void printInfo() {
            super.printInfo();
            System.out.println("File size:" + filesize + "MB");
        }
    }

     class main {

        public static void main(String[] args){
            Book book1 = new Book ("Harry Potter", "J.K. Rowling", 1997);
            Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", 1937);
            Ebook ebook1 = new Ebook("Java Basics", "John Doe", 2022, 1.5);

            book1.printInfo();
            book2.printInfo();
            ebook1.printInfo();
        }
    }