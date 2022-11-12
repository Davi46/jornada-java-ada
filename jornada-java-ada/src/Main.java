import aula.interfaces.generics.Hotel;
import aula.interfaces.generics.RacaCachorro;
import aula.interfaces.generics.ViraLata;
import aula.interfaces.generics.Yorkshire;

import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        aula1_Interfaces_Generic();
    }

    public static void aula1_Interfaces_Generic(){
        Hotel<RacaCachorro> hotel = new Hotel<>();

        hotel.addHospedes(new Yorkshire("Tito"));
        hotel.addHospedes(new ViraLata("Caramelo"));
        hotel.addHospedes(new Yorkshire("Caco"));

        Collections.sort(hotel.getHospedes());

        hotel.imprimirListaHospedes();
    }
}