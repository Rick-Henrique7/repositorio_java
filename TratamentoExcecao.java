public class TratamentoExcecao{
    public static void main(String[] args){
        int quociente, divisor = 0, dividendo = 10;

        try{
            if(divisor == 0){
                throw new ArithmeticException ("Divisão por zero é invalida");
            }
            quociente = dividendo / divisor;
        } catch (Exception e){
            System.out.println("Erro : " + e.getMessage());
        }
    }
}
