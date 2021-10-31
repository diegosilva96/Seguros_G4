package segurosxy;

import segurosxy.modelos.SeguroChoque;
import segurosxy.modelos.Certificado;
import segurosxy.modelos.Cliente;
import segurosxy.modelos.Poliza;
import segurosxy.modelos.SeguroTarjeta;
import segurosxy.modelos.SeguroVehicular;
import segurosxy.modelos.interfaces.ICertificado;
import segurosxy.modelos.interfaces.IPoliza;

public class App {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Juan Perez");
        
        // Generando el certificado a partir de la interfaz ICertificado
        ICertificado certificado = new Certificado();
        certificado.setNumero(12345);
        
        // Generando la poliza a partir de la interfaz IPoliza
        IPoliza poliza = new Poliza();
        poliza.setNumero(54321);

        SeguroVehicular seguro = new SeguroVehicular("Toyota", "Yaris", certificado, poliza);
        //AÑADIENDO POLIZA AL SEGURO
        seguro.setPoliza(poliza);
        //AÑADIENDO CERTIFICADO AL SEGURO
        seguro.setCertificado(certificado);
        seguro.calcularRiesgo();
        cliente.setCompraSeguro(seguro);

        SeguroTarjeta seguro2 = new SeguroTarjeta("BCP", certificado, poliza);
        //AÑADIENDO POLIZA AL SEGURO
        seguro2.setPoliza(poliza);
        //AÑADIENDO CERTIFICADO AL SEGURO
        seguro2.setCertificado(certificado);
        seguro2.calcularRiesgo();
        cliente.setCompraSeguro(seguro2); 
        
        SeguroChoque seguro3 = new SeguroChoque("MercedesBenz", "EQC", certificado, poliza);
        //AÑADIENDO POLIZA AL SEGURO
        seguro3.setPoliza(poliza);
        //AÑADIENDO CERTIFICADO AL SEGURO
        seguro3.setCertificado(certificado);
        seguro3.calcularRiesgo();
        seguro3.CoberturaChoque();
        
        cliente.setCompraSeguro(seguro3); 
        
        cliente.getListaSeguroCliente();

    }

}
