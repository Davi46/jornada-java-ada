package aula.interfaces.generics;

import java.util.ArrayList;
import java.util.List;

public class Hotel<T>{
    private List<T> hospedes = new ArrayList<>();

    public List<T> getHospedes() {
        return hospedes;
    }

    public void addHospedes(T t){hospedes.add(t);}

    public void imprimirListaHospedes(){
        for (T t: hospedes) {
            System.out.println(t.toString());
        }
    }
}