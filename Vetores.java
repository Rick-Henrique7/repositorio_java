/*
public class Vetores{
    public static void main(String[] args){
        int [] vetor1 = new int[] {200,40,120,160}; // criando vetores 
        int [] vetor2 = new int[] {10,5,30,20};

        for (int indice = 0; indice < 4; indice++){ // aplicação de um for iterando sobre duas listas
            int resultado = vetor1[indice]/vetor2[indice]; // o resultado é a divisão dos elementos acessados por cada indice que esta sendo obtido pela iteração do for 

            System.out.println("O resultado do: " + indice + " é " + resultado);
        }
    }
}
*/
public class Vetores{
    public static void main(String[] args) throws Exception{
        int [] vetor1 = new int[] {200,40,120,160}; // criando vetores 
        int [] vetor2 = new int[] {10,5,30};

        try{ // tente fazer isso
        for (int indice = 0; indice < 4; indice++){ // aplicação de um for iterando sobre duas listas
            int resultado = vetor1[indice]/vetor2[indice]; // o resultado é a divisão dos elementos acessados por cada indice que esta sendo obtido pela iteração do for 

            System.out.println("O resultado do: " + indice + " é " + resultado);
        }
        }catch(Exception erro){ // caso nao consiga faça isso 
            System.out.println("a lista tem comprimento diferente");
        }
        
    }
    }
