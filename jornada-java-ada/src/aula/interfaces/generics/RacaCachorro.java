package aula.interfaces.generics;

public class RacaCachorro  implements  Cachorro{
    public String nome;

    public RacaCachorro(String nome){
        this.nome = nome;
    }

    @Override
    public String latir() {
        return "Latido do:" + this.nome;
    }

    @Override
    public int compareTo(RacaCachorro o) {
        return this.nome.compareTo(o.nome);
    }

    @Override
    public String toString() {
        return "RacaCachorro{" +
                "nome='" + nome + '\'' + ','+
                "latido='" + latir() + '\'' +
                '}';
    }
}
