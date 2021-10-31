package segurosxy.modelos.seguros;

import segurosxy.modelos.SeguroVehicular;
import segurosxy.modelos.interfaces.ISeguroIntegro;

public class Segurointegro extends SeguroVehicular implements ISeguroIntegro {

    public Segurointegro(String marca, String modelo) {
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

    public void CoberturaCompleta() {
        System.out.println("Su Seguro cubre todo tipo de daños");
    }

    public void CoberturaChoque() {
        System.out.println("Su Seguro cubre choques");
    }

    public void CoberturaRobo() {
        System.out.println("Su Seguro cubre robos");
    }

    public void CoberturaAccidenteTransito() {
        System.out.println("Su Seguro cubre todo tipo de accidentes de tránsito");
    }

}
