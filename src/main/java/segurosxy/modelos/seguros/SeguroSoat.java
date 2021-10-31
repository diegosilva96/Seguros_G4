package segurosxy.modelos.seguros;

import segurosxy.modelos.SeguroVehicular;
import segurosxy.modelos.interfaces.ISeguroSoat;

public class SeguroSoat extends SeguroVehicular implements ISeguroSoat {

    public SeguroSoat(String marca, String modelo) {
        super(marca, modelo);
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

        return "Seg. Vehicular Numero: " + this.getNumero() + " con riesgo: " + this.getNivelRiesgo();
    }

    public void CoberturaAccidenteTransito() {
        System.out.println("Seguro SOAT");
    }
}
