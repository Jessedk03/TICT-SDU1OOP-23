public class Zwembad {
    
    private double breedte;
    private double lengte;
    private double diepte;

    public Zwembad() {}
    
    public Zwembad(double brd, double lng, double dip) {
        breedte = brd;
        lengte = lng;
        diepte = dip;
    }
    
    public double getBreedte() {
        return breedte;
    }

    public double getLengte() {
        return lengte;
    }

    public double getDiepte() {
        return diepte;
    }

    public void setBreedte(double breedte) {
        this.breedte = breedte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public void setDiepte(double diepte) {
        this.diepte = diepte;
    }

    public double inhoud(){
        return lengte * breedte * diepte;
    }

    @Override
    public String toString(){
        return "Dit zwembad is " + breedte + " meter breed, " + lengte + " meter lang, en " + diepte + " meter diep";
    }
    
}
