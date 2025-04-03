interface correr{
    void correr();
    void correr_rapido();
}
interface andar{
    void andar();
}
class Pessoa implements correr, andar{
    String nome;
    int idade;

    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    @Override
    public void correr(){
        System.out.println("O " + nome + "de " + idade + " esta correndo" );
    }
    @Override
    public void correr_rapido(){
        System.out.println("O " + nome + "de " + idade + " esta correndo muito mais rapido" );
    }
    @Override
    public void andar(){
        System.out.println("O " + nome + " cansou e está andando agora");
    }
}
class Gato implements andar{
    String nome;

    Gato(String nome){
        this.nome = nome;
    }
    @Override
    public void andar(){
        System.out.println("O " + nome + " está andando");
    }
}

class Interface{
    public static void main(String[] args){
        Pessoa usuario = new Pessoa("henrique",22); //definindo objeto
        Gato novo_gato = new Gato("chico");
    

        usuario.correr();
        usuario.correr_rapido();
        usuario.andar();
        novo_gato.andar();
    }
}