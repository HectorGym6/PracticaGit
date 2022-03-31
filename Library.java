package Library;

public class Library implements ILibrary {
    /**
     * Nombre de la libreria
     */
    private String libraryName;
    /**
     * Listado de libros
     */
    private Books[] arrayBooks;
    /**
     * Listado de socios
     */
    private Members[] arrayMembers;
    /**
     * Listado de préstamos
     */
    private BookLends[] arrayBookLends;

    public Library()
    {

    }

    /**
     *
     * @param libraryName nombre de la biblioteca.
     * @param arrayBooks listado de todos los libros de la biblioteca.
     * @param arrayMembers listado de todos los miembros de la biblioteca.
     * @param arrayBookLends listado de todos los préstamos.
     */
    public Library(String libraryName, Books[] arrayBooks, Members[] arrayMembers, BookLends[] arrayBookLends)
    {
        this.libraryName = libraryName;
        this.arrayBooks = arrayBooks;
        this.arrayMembers = arrayMembers;
        this.arrayBookLends = arrayBookLends;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setArrayBooks(Books[] arrayBooks) {
        this.arrayBooks = arrayBooks;
    }

    public Books[] getArrayBooks() {
        return arrayBooks;
    }

    public void setArrayMembers(Members[] arrayMembers) {
        this.arrayMembers = arrayMembers;
    }

    public Members[] getArrayMembers() {
        return arrayMembers;
    }

    public void setArrayBookLends(BookLends[] arrayBookLends) {
        this.arrayBookLends = arrayBookLends;
    }

    public BookLends[] getArrayBookLends() {
        return arrayBookLends;
    }

    /**
     * Imprime el nombre de la biblioteca,
     * un listado de libros,
     * un listado de socios,
     * y un listado de préstamos.
     */
    public void printLibraryInfo()
    {
        System.out.println("Nombre de la biblioteca: ");
        System.out.println(libraryName);
        System.out.println();
        System.out.println("Listado de libros");
        for (Books book : arrayBooks) {
            book.printBookInfo();
        }
        System.out.println();
        System.out.println("Listado de socios");
        for (Members member : arrayMembers) {
            member.printMemberInfo();
        }
        System.out.println();
        System.out.println("Listado de préstamos");
        for (BookLends lentBook : arrayBookLends) {
            lentBook.printBookLendInfo();
        }
    }

    @Override
    public void printEveryBook()
    {
        for (Books book : arrayBooks) {
            book.printBookInfo();
        }
    }

    @Override
    public String printBooksWithTheSameGenre(String givenGenre)
    {
        String arrayGenres = null;
        for (int i = 0; i < arrayBooks.length; i++)
        {
            for (int a = 0; a < arrayBooks[i].getArrayGenres().length; a++)
            {
                if (arrayGenres.equalsIgnoreCase(givenGenre))
                {
                    arrayGenres = arrayBooks[i].getArrayGenres()[a];
                }
            }
        }
        return arrayGenres;
    }

    @Override
    public void printEveryMember()
    {
        for (Members member : arrayMembers) {
            member.printMemberInfo();
        }
    }

    @Override
    public Members printMembersWithAGivenPostalCode(int givenPostalCode)
    {
        Members member = null;
        for (int i = 0; i < arrayMembers.length; i++)
        {
            if (arrayMembers[i].getPostal_cod() == givenPostalCode)
            {
                member = arrayMembers[i];
            }
        }
        return member;
    }

    @Override
    public void printMemberWithAGivenNifAndPrintTheLentBooks(String givenNif)
    {
        Members member = null;
        for (int i = 0; i < arrayMembers.length; i++)
        {
            if (arrayMembers[i].getNif().equalsIgnoreCase(givenNif))
            {
                member.printMemberInfo();
                BookLends lentBook = null;
                for (int j = 0; j < arrayBookLends.length; j++)
                {
                    if (arrayBookLends[j].getNif().equalsIgnoreCase(givenNif))
                    {
                        lentBook.printBookLendInfo();
                    }
                }
            }
        }
    }

    @Override
    public void printLentBooksWithAGivenMemberNumber(int givenMemberNumber)
    {
        for (int i = 0; i < arrayMembers.length; i++)
        {
            if (arrayMembers[i].getNumber() == givenMemberNumber)
            {
                BookLends lentBook = null;
                for (int j = 0; j < arrayBookLends.length; j++)
                {
                    if (arrayBookLends[j].getNif().equalsIgnoreCase(arrayMembers[i].getNif()))
                    {
                        lentBook.printBookLendInfo();
                    }
                }
            }
        }
    }

    @Override
    public boolean returnTrueOrFalseWithAGivenMemberNumberAndIsbn(int givenMemberNumber, String givenIsbn)
    {
        boolean comp = false;
        for (int i = 0; i < arrayMembers.length; i++)
        {
            if (arrayMembers[i].getNumber() == givenMemberNumber)
            {
                for (int j = 0; j < arrayBookLends.length; j++)
                {
                    if (arrayBookLends[j].getIsbn().equalsIgnoreCase(givenIsbn))
                    {
                        comp = true;
                    }
                }
            }
        }
        return comp;
    }

    @Override
    public BookLends[] printLentBooksFromASpecificMember(String specificMember)
    {
        BookLends[] lentBooks = null;
        for (int i = 0; i < arrayMembers.length; i++)
        {
            if (arrayMembers[i].getName().equalsIgnoreCase(specificMember))
            {
                for (int j = 0; j < arrayBookLends.length; j++)
                {
                    if (arrayBookLends[j].getNif().equalsIgnoreCase(arrayMembers[i].getName()))
                    {
                        lentBooks[i] = arrayBookLends[j];
                    }
                }
            }
        }
        return lentBooks;
    }
}