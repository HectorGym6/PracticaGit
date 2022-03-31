package Library;

public class Members {
    private String nif;
    private String name;
    private String surnames;
    private int number;
    private int postal_cod;

    public Members()
    {

    }

    public Members(String nif, String name, String surnames, int number, int postal_cod)
    {
        this.nif = nif;
        this.name = name;
        this.surnames = surnames;
        this.number = number;
        this.postal_cod = postal_cod;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNif() {
        return nif;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setPostal_cod(int postal_cod) {
        this.postal_cod = postal_cod;
    }

    public int getPostal_cod() {
        return postal_cod;
    }

    public void printMemberInfo()
    {
        System.out.println("NIF: " + nif + ". Name: " + name + ". Surnames: " + surnames + ". Number: " + number + ". Postal Code: " + postal_cod + ".");
    }
}
