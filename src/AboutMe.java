import java.util.Locale;
import java.util.Scanner;;

public class AboutMe {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Nome
        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        String informacoesUsuario = imprimirDados(nome, idade);

        System.out.println(informacoesUsuario);
    }


    public static String imprimirDados(String nome, int idade) {
        return "Olá meu nome é " + nome + " e minha idade é " + idade + " anos.";
    }
}