package ar.edu.unahur.obj2;

import ar.edu.unahur.obj2.proveedores.Adaptador;
import org.joda.time.DateTime;

import java.util.List;
import java.util.Set;

public class Ota {

    private DistribuidorDeTrafico distribuidorDeTrafico;
    /*private List<Adaptador> adaptadors;*/

    public Ota(DistribuidorDeTrafico distribuidorDeTrafico) {
        this.distribuidorDeTrafico = distribuidorDeTrafico;
        /*this.adaptadors.add(new AmadeusAdapter());
        this.adaptadors.add(new SabreAdapter());
        this.adaptadors.add(new WorldspanAdapter());*/
    }
    /*public void setAdaptadors(Adaptador adaptadors){
        this.adaptadors.add(adaptadors);
    }*/

    public List<Vuelo> buscarVuelos(DateTime fecha, String origen, String destino) {
        Adaptador codigoProveedor = distribuidorDeTrafico.proveedor();
        // TODO Implementar
        return codigoProveedor.buscarVuelos(fecha, origen, destino);
                //*Collections.emptyList();
    }

    public Boleto reservar(Vuelo vuelo, Set<Pasajero> pasajeros) {
        Adaptador codigoProveedor = distribuidorDeTrafico.proveedor();
        // TODO Implementar
        return codigoProveedor.reserva(vuelo, pasajeros);
    }


}
