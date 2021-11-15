package com.github.inposa.fichier;

public class Ville {
    private int codeRegion;
    private String nomRegion;

    private String codeDepartement;
    private String nomDepartement;

    private int codeCanton;

    private int codeCommune;
    private String nomCommune;

    private long populationMunicipale;
    private long populationAPart;
    private long populationTotale;

    public Ville(int codeRegion, String nomRegion, String codeDepartement, String nomDepartement, int codeCanton, int codeCommune, String nomCommune, long populationMunicipale, long populationAPart, long populationTotale) {
        this.codeRegion = codeRegion;
        this.nomRegion = nomRegion;
        this.codeDepartement = codeDepartement;
        this.nomDepartement = nomDepartement;
        this.codeCanton = codeCanton;
        this.codeCommune = codeCommune;
        this.nomCommune = nomCommune;
        this.populationMunicipale = populationMunicipale;
        this.populationAPart = populationAPart;
        this.populationTotale = populationTotale;
    }

    public int getCodeRegion() {
        return codeRegion;
    }

    public void setCodeRegion(int codeRegion) {
        this.codeRegion = codeRegion;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public void setCodeDepartement(String codeDepartement) {
        this.codeDepartement = codeDepartement;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public int getCodeCanton() {
        return codeCanton;
    }

    public void setCodeCanton(int codeCanton) {
        this.codeCanton = codeCanton;
    }

    public int getCodeCommune() {
        return codeCommune;
    }

    public void setCodeCommune(int codeCommune) {
        this.codeCommune = codeCommune;
    }

    public String getNomCommune() {
        return nomCommune;
    }

    public void setNomCommune(String nomCommune) {
        this.nomCommune = nomCommune;
    }

    public long getPopulationMunicipale() {
        return populationMunicipale;
    }

    public void setPopulationMunicipale(long populationMunicipale) {
        this.populationMunicipale = populationMunicipale;
    }

    public long getPopulationAPart() {
        return populationAPart;
    }

    public void setPopulationAPart(long populationAPart) {
        this.populationAPart = populationAPart;
    }

    public long getPopulationTotale() {
        return populationTotale;
    }

    public void setPopulationTotale(long populationTotale) {
        this.populationTotale = populationTotale;
    }

    public String getSimpleFormat() {
        return this.nomCommune + ";" + this.nomDepartement + ";" + this.populationTotale;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "codeRegion=" + codeRegion +
                ", nomRegion='" + nomRegion + '\'' +
                ", codeDepartement=" + codeDepartement +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", codeCanton=" + codeCanton +
                ", codeCommune=" + codeCommune +
                ", nomCommune='" + nomCommune + '\'' +
                ", populationMunicipale=" + populationMunicipale +
                ", populationAPart=" + populationAPart +
                ", populationTotale=" + populationTotale +
                '}';
    }
}
