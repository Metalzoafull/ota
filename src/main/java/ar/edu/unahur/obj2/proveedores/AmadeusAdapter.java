package ar.edu.unahur.obj2.proveedores;

import ar.edu.unahur.obj2.Boleto;
import ar.edu.unahur.obj2.Pasajero;
import ar.edu.unahur.obj2.Vuelo;
import org.joda.time.DateTime;

import java.util.List;
import java.util.Set;

public class AmadeusAdapter implements Adaptador{
    private Amadeus amadeus;


    public AmadeusAdapter(Amadeus amadeus) {
        this.amadeus = amadeus;
    }

    @Override
    public List<Vuelo> buscarVuelos(DateTime fecha, String origen, String destino) {
        return amadeus.executeSearch(fecha, origen, destino);
    }

    @Override
    public Boleto reserva(Vuelo vuelo, Set<Pasajero> pasajeros) {
        return amadeus.executeBook(vuelo, pasajeros);
    }
}
