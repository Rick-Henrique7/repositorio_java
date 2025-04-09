class Calculadora{
    public int fatorExtra;

    public Calculadora(int fatorExtra){
        this.fatorExtra = fatorExtra;
    }
    public int somar(int a, int b){
        return a + b + fatorExtra;
    }
    
}
public class Fator{
    public static void main(String[] args){
        Calculadora calc = new Calculadora(10);
        int resultado = calc.somar(5,3);
        System.out.println("O resultado é: " + resultado);
        }
    }