abstract class Voar{
    public abstract void Voar();
}
class Helicoptero extends Voar{
    public void Voar(){ System.out.println("helicptero voando"); }
}
class Aviao extends Voar{
    public void Voar(){ System.out.println("Aviao voando"); }
}

public class Poliformismo1{
    public static void main(String[] args){
        Helicoptero h = new Helicoptero();
        Aviao a = new Aviao();

        Voar g = new Voar(){
            @Override
            public void Voar(){
                System.out.println("generico voando");
            }
        };

        a.Voar();
        h.Voar();
        g.Voar();
    }
}