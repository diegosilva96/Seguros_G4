package segurosxy.modelos.seguros;

import segurosxy.modelos.SeguroVehicular;
import segurosxy.modelos.interfaces.ISeguroporChoque;

public class SeguroChoque extends SeguroVehicular implements ISeguroporChoque {

    public SeguroChoque(String marca, String modelo) {
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

    public void CoberturaChoque() {
        System.out.println("Su Seguro cubre choques");
    }

}
