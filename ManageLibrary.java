package Library;

import java.util.Scanner;

/**
 * @version 1.0
 * @author IvánFernándezGarcía
 */
public class ManageLibrary {
    static String requestLibraryName()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre de la biblioteca:");
        String libraryName = scanner.nextLine();
        while (libraryName.isEmpty()) {
            System.out.println("Debes escribir el nombre");
            libraryName = scanner.nextLine();
        }
        return libraryName;
    }
    static Books requestBookData()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el ISBN del libro:");
        String isbn = scanner.nextLine();
        while (isbn.isEmpty()) {
            System.out.println("Debes escribir el ISBN");
            isbn = scanner.nextLine();
        }
        System.out.println("Introduce el título del libro:");
        String title = scanner.nextLine();
        while (title.isEmpty()) {
            System.out.println("Debes escribir el título");
            title = scanner.nextLine();
        }
        System.out.println("Introduce el autor del libro:");
        String author = scanner.nextLine();
        while (author.isEmpty()) {
            System.out.println("Debes escribir el autor");
            author = scanner.nextLine();
        }
        System.out.println("¿Cuántos géneros tiene el libro?");
        int arraySize = scanner.nextInt();
        while (arraySize < 1) {
            System.out.println("Debe de tener mínimo un género");
            arraySize = scanner.nextInt();
        }
        String[] arrayGenres = new String[arraySize];
        System.out.println("Introduce los géneros del libro:");
        for (int i = 0; i < arrayGenres.length; i++) {
            String genre = scanner.next();
            while (genre.isEmpty()) {
                System.out.println("Debes escribir el género");
                genre = scanner.nextLine();
            }
            arrayGenres[i] = genre;
        }
        return new Books(isbn, title, author, arrayGenres);
    }
    static Members requestMemberData()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el NIF del socio:");
        String nif = scanner.nextLine();
        while (nif.isEmpty()) {
            System.out.println("Debes escribir el NIF");
            nif = scanner.nextLine();
        }
        System.out.println("Introduce el nombre del socio:");
        String name = scanner.nextLine();
        while (name.isEmpty()) {
            System.out.println("Debes escribir el nombre");
            name = scanner.nextLine();
        }
        System.out.println("Introduce los apellidos del socio:");
        String surnames = scanner.nextLine();
        while (surnames.isEmpty()) {
            System.out.println("Debes escribir los apellidos");
            surnames = scanner.nextLine();
        }
        System.out.println("Introduce el número del socio:");
        int number = scanner.nextInt();
        while (number < 1) {
            System.out.println("Debes introducir el número");
            number = scanner.nextInt();
        }
        System.out.println("Introduce el código postal del socio:");
        int postal_cod = scanner.nextInt();
        while (postal_cod < 1) {
            System.out.println("Debes escribir el código postal");
            postal_cod = scanner.nextInt();
        }
        return new Members(nif, name, surnames, number, postal_cod);
    }
    static BookLends requestBookLendsData()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el ISBN del libro:");
        String isbn = scanner.nextLine();
        while (isbn.isEmpty()) {
            System.out.println("Debes escribir el ISBN");
            isbn = scanner.nextLine();
        }
        System.out.println("Introduce la fecha del préstamo:");
        String lendDate = scanner.nextLine();
        while (lendDate.isEmpty()) {
            System.out.println("Debes escribir la fecha del préstamo");
            lendDate = scanner.nextLine();
        }
        System.out.println("Introduce el NIF del socio:");
        String nif = scanner.nextLine();
        while (nif.isEmpty()) {
            System.out.println("Debes escribir el NIF");
            nif = scanner.nextLine();
        }
        System.out.println("Introduce la fecha de devolución:");
        String returnDate = scanner.nextLine();
        while (returnDate.isEmpty()) {
            System.out.println("Debes escribir la fecha de devolución");
            returnDate = scanner.nextLine();
        }
        return new BookLends(isbn, lendDate, nif, returnDate);
    }
    static int requestBooksSize()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuántos libros vas a introducir?");
        int arraySize = scanner.nextInt();
        while (arraySize < 1) {
            System.out.println("Debes introducir mínimo 1");
            arraySize = scanner.nextInt();
        }
        return arraySize;
    }
    static int requestMembersSize()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuántos socios vas a introducir?");
        int arraySize = scanner.nextInt();
        while (arraySize < 1) {
            System.out.println("Debes introducir mínimo 1");
            arraySize = scanner.nextInt();
        }
        return arraySize;
    }
    static int requestBookLendsSize()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuántos préstamos vas a introducir?");
        int arraySize = scanner.nextInt();
        while (arraySize < 1) {
            System.out.println("Debes introducir mínimo 1");
            arraySize = scanner.nextInt();
        }
        return arraySize;
    }
    static Books[] createArrayBooks(int booksSize)
    {
        Books[] arrayBooks = new Books[booksSize];
        for (int i = 0; i < arrayBooks.length; i++) {
            Books book = requestBookData();

            arrayBooks[i] = book;
        }
        return arrayBooks;
    }
    static Members[] createArrayMembers(int membersSize)
    {
        Members[] arrayMembers = new Members[membersSize];
        for (int i = 0; i < arrayMembers.length; i++) {
            Members member = requestMemberData();
            arrayMembers[i] = member;
        }
        return arrayMembers;
    }
    static BookLends[] createArrayBookLends(int bookLendsSize)
    {
        BookLends[] arrayBookLends = new BookLends[bookLendsSize];
        for (int i = 0; i < arrayBookLends.length; i++) {
            BookLends lentBook = requestBookLendsData();
            arrayBookLends[i] = lentBook;
        }
        return arrayBookLends;
    }
    static void printLibraryInfo(String libraryName)
    {
        Library library = new Library();
        library.setLibraryName(libraryName);

        int booksSize = requestBooksSize();
        Books[] arrayBooks = createArrayBooks(booksSize);
        library.setArrayBooks(arrayBooks);

        int membersSize = requestMembersSize();
        Members[] arrayMembers = createArrayMembers(membersSize);
        library.setArrayMembers(arrayMembers);

        int bookLendsSize = requestBookLendsSize();
        BookLends[] arrayBookLends = createArrayBookLends(bookLendsSize);
        library.setArrayBookLends(arrayBookLends);

        library.printLibraryInfo();
    }
    public void imprimirPrueba()
    {
        System.out.println();
    }
    public static void main(String[] args)
    {
        String libraryName = requestLibraryName();
        printLibraryInfo(libraryName);
    }
}