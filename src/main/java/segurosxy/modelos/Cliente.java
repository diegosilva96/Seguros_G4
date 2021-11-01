package segurosxy.modelos;

import java.util.ArrayList;
import java.util.List;
import segurosxy.modelos.interfaces.ISeguro;

public class Cliente {

    private String nombre;
    private List<ISeguro> seguros;

    public Cliente(String nombre)   {

        this.nombre = nombre;
        this.seguros = new ArrayList<ISeguro>();
    }

    public void setCompraSeguro(ISeguro seguro) {

        this.seguros.add( seguro );
    }

    public void getListaSeguroCliente()    {

        System.out.println("Nombre: " + this.nombre );
        for (ISeguro seguro : seguros )  {

            System.out.println( "Seguro: " + seguro.getDetalleSeguro());
        }

    }

}
