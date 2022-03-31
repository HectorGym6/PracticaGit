package Library;

public interface ILibrary {
    void printEveryBook();
    String printBooksWithTheSameGenre(String givenGenre);
    void printEveryMember();
    /**
     * Imprime el miembro con un código postal como parámetro.
     * @param givenPostalCode código postal dado.
     * @return devuelve un miembro.
     */
    Members printMembersWithAGivenPostalCode(int givenPostalCode);
    /**
     * Imprime un miembro con un NIF como parámetro y su lista de libros prestados.
     * @param givenNif NIF dado.
     */
    void printMemberWithAGivenNifAndPrintTheLentBooks(String givenNif);
    void printLentBooksWithAGivenMemberNumber(int givenMemberNumber);
    boolean returnTrueOrFalseWithAGivenMemberNumberAndIsbn(int givenMemberNumber, String givenIsbn);
    /**
     * Imprime los libros prestados de un miembro específico.
     * @param specificMember miembro espécifico.
     * @return devuelve una lista de libros.
     */
    BookLends[] printLentBooksFromASpecificMember(String specificMember);
}