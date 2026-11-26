package dades;

public abstract class Usuari {
    private String alias;
    private String nom;
    private String correu;

    public Usuari(String alias, String nom, String correu){
        this.alias = alias;
        this.nom = nom;
        this.correu = correu;
    }
    
    public String getAlias(){
        return alias;
    }

    public String getNom() {
        return nom;
    }

    public String getCorreu(){
        return correu;
    }

}


