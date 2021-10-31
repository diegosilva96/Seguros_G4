package segurosxy;

import segurosxy.modelos.Cliente;
import segurosxy.modelos.SeguroTarjeta;
import segurosxy.modelos.SeguroVehicular;
import segurosxy.modelos.seguros.*;

public class App {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Juan Perez");

        SeguroVehicular seguro = new SeguroVehicular("Toyota", "Yaris");
        seguro.calcularRiesgo();
        cliente.setCompraSeguro(seguro);

        SeguroTarjeta seguro2 = new SeguroTarjeta("BCP");
        seguro2.calcularRiesgo();
        cliente.setCompraSeguro(seguro2);

        SeguroChoque seguro3 = new SeguroChoque("MercedesBenz", "EQC");
        seguro3.calcularRiesgo();
        seguro3.CoberturaChoque();
        cliente.setCompraSeguro(seguro3); 


        cliente.getListaSeguroCliente();

    }

}
