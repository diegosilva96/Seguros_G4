package segurosxy.modelos;

import segurosxy.modelos.SeguroVehicular;
import segurosxy.modelos.interfaces.ICertificado;
import segurosxy.modelos.interfaces.IPoliza;
import segurosxy.modelos.interfaces.ISeguroporRobo;

public class SeguroRobo extends SeguroVehicular implements ISeguroporRobo {

    public SeguroRobo(String marca, String modelo, ICertificado certificado, IPoliza poliza) {
        super(marca, modelo, certificado, poliza);
    }

    @Override
    public void calcularRiesgo() {

        if (this.getVehiculo().getMarca().equals("Toyota") && this.getVehiculo().getModelo().equals("Yaris")) {
            this.nivelRiesgo = "ALTO";
        } else {
            this.nivelRiesgo = "BAJO";
        }
    }

    @Override
    public String getDetalleSeguro() {

        return "Seg. Vehicular Numero: " +
                this.getNumero() +
                " con riesgo: " +
                this.getNivelRiesgo() +
                " con certificado: " + this.certificado.getNumero() + 
                " con poliza: " + this.poliza.getNumero();
    }

    public void CoberturaRobo() {
        System.out.println("Seguro de robos");
    }
}
