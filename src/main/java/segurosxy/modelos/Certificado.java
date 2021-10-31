package segurosxy.modelos;

import segurosxy.modelos.interfaces.ICertificado;

public class Certificado implements ICertificado{
    private Integer numero;
    
    @Override
    public Integer getNumero() {
        return numero;
    }
    
    @Override
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

}
