package segurosxy.modelos;

import segurosxy.modelos.interfaces.ISeguroIntegro;
import segurosxy.modelos.interfaces.ISeguroSoat;
import segurosxy.modelos.interfaces.ISeguroporChoque;
import segurosxy.modelos.interfaces.ISeguroporRobo;

public class SeguroVehicular extends Seguro implements ISeguroIntegro, ISeguroSoat, ISeguroporChoque, ISeguroporRobo {

    public SeguroVehicular(String marca, String modelo) {

        super();
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public void cacularRiesgo() {

        if (this.marca.equals("Toyota") && this.modelo.equals("Yaris")) {
            this.nivelRiesgo = "ALTO";
        } else {
            this.nivelRiesgo = "BAJO";
        }
    }

    @Override
    public String getDetalleSeguro() {

        return "Seg. Vehicular Numero: " + this.numero + " con riesgo: " + this.nivelRiesgo;
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
