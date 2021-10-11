package gasolina.alcool;


public class Alcool {
    
    public static double volumeAbaixoOuIgualA20L(double a, double A){
        
        return (((a * A) * 97) / 100);
    }
    
    public static double volumeAcimaDe20L(double a, double A){
        
        return (((a * A) * 95) / 100);
    }
}
