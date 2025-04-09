import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    private static Scanner entrada;

    public static void main(String[] args) {
        long num = 0;
        entrada = new Scanner(System.in);

        do {
            System.out.print("Entre com um número inteiro ou \"-1\" para sair: ");
            try {
                num = lerEntrada(entrada);
            } catch (ErroValidacao erro) {
                System.out.println("Entrada inválida!");
                System.out.println("Causa: " + erro.getCause());
                erro.printStackTrace(System.out);
                System.exit(-1);
            }

            if (num == -1)
                System.exit(0);
            else {
                try {
                    long resultado = calcularFatorial(num);
                    System.out.println("O fatorial de " + num + " é: " + resultado);
                } catch (ErroValidacao erro) {
                    erro.printStackTrace(System.out);
                }
            }

        } while (num >= 0);
    }

    private static long lerEntrada(Scanner entrada) throws ErroValidacao {
        try {
            return entrada.nextLong();
        } catch (InputMismatchException erroEntrada) {
            entrada.next(); // consome o token inválido
            ErroValidacao erro = new ErroValidacao("A entrada não é um número inteiro!");
            erro.atribuirCausa(erroEntrada);
            throw erro;
        }
    }

    private static long calcularFatorial(long num) throws ErroValidacao {
        if (num > 0) {
            long res = calcularFatorial(num - 1);
            long fat = num * res;
            if ((fat / res) != num) {
                throw new ErroValidacao("Overflow!");
            }
            return fat;
        } else {
            return 1;
        }
    }
}
