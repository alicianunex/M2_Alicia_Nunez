package clases;


public class AppIot extends AppSoftware{

    private boolean setGrafica;
    private boolean setWifi;
    private EProtocols e_Protcols;

   

    public AppIot(boolean setGrafica, boolean setWifi, EProtocols e_Protcols) {
        this.setGrafica = setGrafica;
        this.setWifi = setWifi;
        this.e_Protcols = e_Protcols;
    }
    // methods
    @Override
    public void tech() {
        
    }

    @Override
    public String toString() {
        return "ApploT{" + "setGrafica=" + setGrafica + ", setWifi=" + setWifi + ", e_Protcols=" + e_Protcols + '}';
    }
    
}
