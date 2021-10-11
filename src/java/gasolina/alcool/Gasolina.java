package gasolina.alcool;


public class Gasolina {
    
    public static double volumeAbaixoOuIgualA20L(double a, double A){
        
        return (((a * A) * 96) / 100);
    }
    
    public static double volumeAcimaDe20L(double a, double A){
        
        return (((a * A) * 94) / 100);
    }
}
