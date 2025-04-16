class Animal {
    String nome;

    void fazerSom(){
        System.out.println("emitindo som");
    }
}
class Cachorro extends Animal{
    void Latir(){
        System.out.println(nome + " está latindo");
    }
}

public class CachorroDemo{
    public static void main(String[] args){
        Cachorro meuCachorro = new Cachorro();
        meuCachorro.nome = "Rex";

        meuCachorro.fazerSom();
        meuCachorro.Latir();
    }
}