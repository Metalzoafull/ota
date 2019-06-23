package ar.edu.unahur.obj2.proveedores;

import ar.edu.unahur.obj2.Boleto;
import ar.edu.unahur.obj2.Pasajero;
import ar.edu.unahur.obj2.Vuelo;
import org.joda.time.DateTime;

import java.util.List;
import java.util.Set;

public class SabreAdapter implements Adaptador{
    private Sabre sabre;

    public SabreAdapter(Sabre sabre) {
        this.sabre = sabre;
    }

    @Override
    public List<Vuelo> buscarVuelos(DateTime fecha, String origen, String destino) {
        return sabre.buscar(fecha, origen, destino);
    }

    @Override
    public Boleto reserva(Vuelo vuelo, Set<Pasajero> pasajeros) {
        return sabre.comprar(vuelo, pasajeros);
    }
}
