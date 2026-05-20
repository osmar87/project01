import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class App {
    private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) throws Exception {
        aboutMe();
    }

    public static void aboutMe() {
        try {
            System.out.println("Digite seu nome:");
            String nome = sc.next();

            System.out.println("Informe seu sobrenome:");
            String sobreNome = sc.next();

            System.out.println("Qual é sua idade");
            int idade = sc.nextInt();

            System.out.println("Qual é sua altura");
            double altura = sc.nextDouble();

            System.err.println("ola " + nome + sobreNome + " Tenho " + idade + "  Altura " + altura);
        } catch (InputMismatchException e) {
            System.err.println("Dados invalidos , os campos idade e altura devem ser numericos");
        }

    }
}
