package segurosxy.modelos;

import segurosxy.modelos.interfaces.IRiesgo;
import segurosxy.modelos.interfaces.ISeguroporRobo;

public class SeguroTarjeta extends Seguro implements IRiesgo,ISeguroporRobo {

    private Tarjeta tarjeta;

    public SeguroTarjeta(String bancoTarjeta) {

        super();
        this.tarjeta = new Tarjeta(bancoTarjeta);
    }

    
    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta=tarjeta;
    }

    public void calcularRiesgo() {

        if (this.getTarjeta().getBancoTarjeta().equals("AZTECA")) {
            this.nivelRiesgo = "ALTO";
        } else {
            this.nivelRiesgo = "BAJO";
        }
    }

    @Override
    public String getDetalleSeguro() {

        return "Seg. Tarjeta Numero: " + this.getNumero() + " con riesgo: " + this.getNivelRiesgo();
    }

    public void CoberturaRobo() {
        System.out.println("Su seguro cubre robos");
    }

}
