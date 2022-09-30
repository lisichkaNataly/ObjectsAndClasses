public class Main {
    public static void main(String[] args) {
        Author authorEn = new Author("Donald","Trump");
        Author authorRu = new Author("Dmitry","Hara");
        Book bookEn = new Book("The Way to the Top",2004,authorEn);
        Book bookRu = new Book("P.Sh.", 2017, authorRu);
        printBook(bookEn);
        bookEn.setYear(2022);
        System.out.println("New book year: " + bookEn.getYear());

    }

    private static void printBook(Book book){
        System.out.println("Book: " + book.getName());
        System.out.println("Author: " + book.getAuthor().getSurname() + " " + book.getAuthor().getName());
        System.out.println("Year Publication: " + book.getYear());
    }

}