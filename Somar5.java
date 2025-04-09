public class Somar5 {
    // atributos
    public int extra;


    // construtor
    public Somar5 (int extra){ 
        this.extra = extra;
    }
    //metodo
    public int somar(int a, int b){
        return a + b + extra;
    }

    //classe principal
    public static void main(String[] args){
        Somar5 calc = new Somar5(5);
        int resultado = calc.somar(2,3);

        System.out.println("resultado: " + resultado);

    }
}
