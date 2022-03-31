package Library;

public class BookLends {
    private String isbn;
    private String lendDate;
    private String nif;
    private String returnDate;

    public BookLends()
    {

    }

    public BookLends(String isbn, String lendDate, String nif, String refundDate)
    {
        this.isbn = isbn;
        this.lendDate = lendDate;
        this.nif = nif;
        this.returnDate = refundDate;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setLendDate(String lendDate) {
        this.lendDate = lendDate;
    }

    public String getLendDate() {
        return lendDate;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNif() {
        return nif;
    }

    public void setRefundDate(String refundDate) {
        this.returnDate = refundDate;
    }

    public String getRefundDate() {
        return returnDate;
    }

    public void printBookLendInfo()
    {
        System.out.println("ISBN: " + isbn + ". Fecha del préstamo: " + lendDate + ". NIF: " + nif + ". Fecha de devolución: " + returnDate + ".");
    }
}
