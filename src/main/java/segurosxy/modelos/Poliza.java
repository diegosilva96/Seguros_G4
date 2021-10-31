package segurosxy.modelos;

import segurosxy.modelos.interfaces.IPoliza;

public class Poliza implements IPoliza{

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
