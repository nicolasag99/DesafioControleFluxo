import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo número");
        int parametroDois = scanner.nextInt();

        if (parametroUm > parametroDois) {
            try {
                throw new ParametrosInvalidosException("O primeiro número não pode ser maior do que o segundo número");
            } catch (ParametrosInvalidosException e) {
                System.out.println(e.getMessage());
            }

        }

        int diferenca = parametroDois - parametroUm;

        for (int i = 1; i <= diferenca; i++) {
            System.out.println("Imprimindo número " + i);
        }

    }
}
