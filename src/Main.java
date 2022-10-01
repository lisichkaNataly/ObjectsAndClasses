public class Main {
    public static void main(String[] args) {
        Author authorEn = new Author("Donald","Trump");
        Author authorRu = new Author("Dmitry","Hara");
        Book bookEn = new Book("The Way to the Top",2004,authorEn);
        Book bookRu = new Book("P.Sh.", 2017, authorRu);
        printBook(bookEn);
        bookEn.setYear(2022);
        System.out.println("New year book: " + bookEn.getYear());

        System.out.println("Методы. Домашнее задание");
        Author authorEnCopy = new Author("Donald", "Trump");
        Book bookEnCopy = new Book("The Way to the Top", 2020, authorEn);
        System.out.println("Проверка метода toString: ");
        System.out.println(authorEnCopy);
        System.out.println(bookEnCopy);
        System.out.println("Проверка метода equals: ");
        System.out.println(bookEnCopy.equals(bookEn));
        System.out.println(authorEnCopy.equals(authorEn));
        System.out.println("Проверка метода hashCode: ");
        System.out.println(bookEn.hashCode());
        System.out.println(bookEnCopy.hashCode());


    }

    private static void printBook(Book book){
        System.out.println("Book: " + book.getName());
        System.out.println("Author: " + book.getAuthor().getSurname() + " " + book.getAuthor().getName());
        System.out.println("Year Publication: " + book.getYear());
    }

}