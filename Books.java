package Library;

import java.util.Arrays;

public class Books {
    private String isbn;
    private String title;
    private String author;
    private String[] arrayGenres;

    public Books()
    {

    }
    public Books(String isbn, String title, String author, String[] arrayGenres)
    {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.arrayGenres = arrayGenres;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setArrayGenres(String[] arrayGenres) {
        this.arrayGenres = arrayGenres;
    }

    public String[] getArrayGenres() {
        return arrayGenres;
    }

    public void printBookInfo()
    {
        System.out.println("ISBN: " + isbn + ". Título: " + title + ". Autor: " + author + ". Género/s: " + Arrays.toString(arrayGenres));
    }
}
