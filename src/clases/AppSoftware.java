package clases;

public class AppSoftware {

	// 1. Atributos o propiedades
		private String Language;
		private boolean Persistente;
		private double Complejidad = 100.00;
		private int CodigoLineas;
		private int CasosTest;
		


// 2. Constructor 

public AppSoftware() {
}
public AppSoftware(String Language, boolean Persistente, double Complejidad, int CodigoLineas, int CasosTest) {
	this.Language = Language;
	this.Persistente = Persistente;
	this.Complejidad = Complejidad;
	this.CodigoLineas = CodigoLineas;
	this.CasosTest = CasosTest;
}
// 3. Métodos (comportamiento)

public String getLanguage() {
	return Language;
}
public void setLanguage(String language) {
	this.Language = language;
}
public boolean isPersistente() {
	return Persistente;
}
public void setPersistente(boolean persistente) {
	this.Persistente = persistente;
}
public double getComplejidad() {
	return Complejidad;
}
public void setComplejidad(double complejidad) {
	this.Complejidad = complejidad;
	
}
public int getCodigoLineas() {
	return CodigoLineas;
}
public void setCodigoLineas(int codigoLineas) {
	this.CodigoLineas = codigoLineas;
}
public int getCasosTest() {
	return CasosTest;
}
public void setCasosTest(int casosTest) {
	this.CasosTest = casosTest;
}

public static void main(String[]args) {
	//métodos
    public double calcularCalidad() {
        double calidad = 100.00;
        if (complejidad > 11 && complejidad < 21) {
            calidad = complejidad - 10;
            System.out.printIn();
        } else if (complejidad > 21 && complejidad < 50) {
            calidad = complejidad - 30;
            System.out.printIn();
        } else if (complejidad >= 50) {
            calidad = complejidad - 50;
            System.out.printIn();
        }
        if (codigoLineas > 5000 && casosTest < 3000) {
            calidad = complejidad - 20;
            System.out.printIn();
        }
        return calidad;
    }
    
      @Override
    public String toString() {
        return "AppSoftware{" + "Language=" + language + ", Persistente=" + persistente + ", Complejidad=" + complejidad + ", CodigoLineas=" + CodigoLineas + ", CasosTest=" + CasosTest + '}';
    }
    
}