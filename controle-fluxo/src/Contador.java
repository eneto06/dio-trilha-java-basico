import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro número inteiro: ");
        int num1 = sc.nextInt();

        System.out.println("Informe o segundo número inteiro: ");
        int num2 = sc.nextInt();

        sc.close();


        try {
            contar(num1, num2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("exceção detectada: " + e.getMessage());
        }
    }

    public static void contar(int num1, int num2) throws ParametrosInvalidosException {
        if (num1 > num2) {
            throw new ParametrosInvalidosException("Algo deu errado!");
        }

        for (int i = num1; i <= num2; i++) {
            System.out.println("imprimindo o número: " + i);
        }
    }

}
