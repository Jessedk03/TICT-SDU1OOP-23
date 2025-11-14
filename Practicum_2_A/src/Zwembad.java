public class Zwembad {

    /**
     * class_diagram.png for the class diagram.
     */

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

    public void setBreedte(double brd) {
        breedte = brd;
    }

    public void setLengte(double lng) {
        lengte = lng;
    }

    public void setDiepte(double dip) {
        diepte = dip;
    }

    public double inhoud(){
        return lengte * breedte * diepte;
    }

    @Override
    public String toString(){
        return "Dit zwembad is " + breedte + " meter breed, " + lengte + " meter lang, en " + diepte + " meter diep";
    }
    
}
