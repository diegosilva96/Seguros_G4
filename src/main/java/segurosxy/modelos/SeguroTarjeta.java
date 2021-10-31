package segurosxy.modelos;

import segurosxy.modelos.interfaces.ICertificado;
import segurosxy.modelos.interfaces.IPoliza;
import segurosxy.modelos.interfaces.IRiesgo;
import segurosxy.modelos.interfaces.ISeguroporRobo;

public class SeguroTarjeta extends Seguro implements IRiesgo, ISeguroporRobo {

    private Tarjeta tarjeta;

    public SeguroTarjeta(String bancoTarjeta, ICertificado certificado, IPoliza poliza) {

        super(certificado, poliza);
        this.tarjeta = new Tarjeta(bancoTarjeta);
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
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

        return "Seg. Tarjeta Numero: " + 
                this.getNumero() + 
                " con riesgo: " +
                this.getNivelRiesgo() + 
                " con certificado: " + this.certificado.getNumero() + 
                " con poliza: " + this.poliza.getNumero();
    }

    public void CoberturaRobo() {
        System.out.println("Su seguro cubre robos");
    }

}
