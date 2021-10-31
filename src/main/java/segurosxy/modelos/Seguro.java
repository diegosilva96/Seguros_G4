package segurosxy.modelos;

import java.util.Random;
import segurosxy.modelos.interfaces.ICertificado;
import segurosxy.modelos.interfaces.IPoliza;
public abstract class Seguro{

    protected Integer numero;
    protected ICertificado certificado;
    protected IPoliza poliza;
    protected String nivelRiesgo ="NINGUNO";
        
    public Seguro(ICertificado certificado, IPoliza poliza) {
        this.certificado = certificado;
        this.poliza = poliza;
        this.numero = new Random().nextInt();
    }

    public ICertificado getCertificado() {
        return certificado;
    }

    public void setCertificado(ICertificado certificado) {
        this.certificado = certificado;
    }

    public IPoliza getPoliza() {
        return poliza;
    }

    public void setPoliza(IPoliza poliza) {
        this.poliza = poliza;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNivelRiesgo() {
        return this.nivelRiesgo;
    }

    public abstract String getDetalleSeguro();

    
}
