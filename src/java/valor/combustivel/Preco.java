package valor.combustivel;

import gasolina.alcool.Alcool;
import gasolina.alcool.Gasolina;
import java.text.DecimalFormat;


public class Preco {
    
    private double volumeDoCombustivel;
    private String tipoDoCombustivel;
    
    DecimalFormat df = new DecimalFormat();

    public double getVolumeDoCombustivel() {
        return volumeDoCombustivel;
    }

    public void setVolumeDoCombustivel(double volumeDoCombustivel) {
        this.volumeDoCombustivel = volumeDoCombustivel;
    }

    public String getTipoDoCombustivel() {
        return tipoDoCombustivel;
    }

    public void setTipoDoCombustivel(String tipoDoCombustivel) {
        this.tipoDoCombustivel = tipoDoCombustivel;
    }
    
    public String doCombustivel(){
        
        String msg = "";
        double precoDoAlcool = 1.9;
        double precoDaGasolina = 2.5;
        
        if(this.getTipoDoCombustivel().equals("Alcool")){
            if(this.getVolumeDoCombustivel() <= 20){
                msg += "<p>" + this.getVolumeDoCombustivel() + " l de <em>alcool</em> custará <strong>R$ " + df.format(Alcool.volumeAbaixoOuIgualA20L(this.getVolumeDoCombustivel(), precoDoAlcool)) + " reais</strong>.</p>";
            }
            else{
                if(this.getVolumeDoCombustivel() > 20){
                    msg += "<p>" + this.getVolumeDoCombustivel() + " l de <em>alcool</em> custará <strong>R$ " + df.format(Alcool.volumeAcimaDe20L(this.getVolumeDoCombustivel(), precoDoAlcool)) + " reais</strong>.</p>";
                }
            }
        }
        else{
            if(this.getTipoDoCombustivel().equals("Gasolina")){
                if(this.getVolumeDoCombustivel() <= 20){
                    msg += "<p>" + this.getVolumeDoCombustivel() + " l de <em>gasolina</em> custará <strong>R$ " + df.format(Gasolina.volumeAbaixoOuIgualA20L(this.getVolumeDoCombustivel(), precoDaGasolina)) + " reais</strong>.</p>";
                }
                else{
                    if(this.getVolumeDoCombustivel() > 20){
                        msg += "<p>" + this.getVolumeDoCombustivel() + " l de <em>gasolina</em> custará <strong>R$ " + df.format(Gasolina.volumeAcimaDe20L(this.getVolumeDoCombustivel(), precoDaGasolina)) + " reais</strong>.</p>";
                    }
                }
            }
        }
        
        return msg;
    }
}
