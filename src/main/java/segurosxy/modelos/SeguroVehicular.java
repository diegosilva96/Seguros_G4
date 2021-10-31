package segurosxy.modelos;

import segurosxy.modelos.interfaces.IRiesgo;

public class SeguroVehicular extends Seguro implements IRiesgo{

    private Vehiculo vehiculo;

    public SeguroVehicular(String marca, String modelo) {
       super();
       this.vehiculo=new Vehiculo(marca,modelo);
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

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
  
    
}
