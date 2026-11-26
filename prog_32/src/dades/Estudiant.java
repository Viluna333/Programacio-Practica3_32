package dades;

public class Estudiant extends Usuari{
    private String ensenyament;
    private int anyInici;

    public Estudiant(String alias, String nom, String correu, String ensenyament, int anyInici) {
        super(alias, nom, correu);
        this.ensenyament = ensenyament;
        this.anyInici = anyInici;
    }

    

}