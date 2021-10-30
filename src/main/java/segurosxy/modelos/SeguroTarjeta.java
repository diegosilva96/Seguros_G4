package segurosxy.modelos;

import segurosxy.modelos.interfaces.ISeguroIntegro;
import segurosxy.modelos.interfaces.ISeguroporRobo;

public class SeguroTarjeta extends Seguro implements ISeguroporRobo, ISeguroIntegro {

    public SeguroTarjeta(String bancoTarjeta) {

        super();
        this.bancoTarjeta = bancoTarjeta;
    }

    @Override
    public void cacularRiesgo() {

        if (this.bancoTarjeta.equals("AZTECA")) {
            this.nivelRiesgo = "ALTO";
        } else {
            this.nivelRiesgo = "BAJO";
        }
    }

    @Override
    public String getDetalleSeguro() {

        return "Seg. Tarjeta Numero: " + this.numero + " con riesgo: " + this.nivelRiesgo;
    }

    public void CoberturaRobo() {
        System.out.println("Su seguro cubre robos");
    }

    public void CoberturaCompleta() {
        System.out.println("Su seguro cubre todo tipo de daños");
    }
}
