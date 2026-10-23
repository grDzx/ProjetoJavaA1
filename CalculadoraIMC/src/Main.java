import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String classificarIMC(double imc) {
        if (imc < 18.5) return "Abaixo do peso";
        if (imc < 25) return "Peso normal";
        if (imc < 30) return "Sobrepeso";
        if (imc < 35) return "Obesidade grau I";
        if (imc < 40) return "Obesidade grau II";
        return "Obesidade grau III";
    }

    public static void exibirResultado(String nome, double imc) {
        System.out.println("\n===== RESULTADO DO IMC =====");
        System.out.println("Nome: " + nome);
        System.out.printf("Seu IMC: %.2f%n", imc);
        System.out.println("Classificacao: " + classificarIMC(imc));
        System.out.println("============================");
        System.out.println("Observacao: o IMC e uma medida de triagem para adultos, nao um diagnostico.");
    }

    private static double lerNumeroPositivo(Scanner scanner, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String entrada = scanner.nextLine().trim().replace(',', '.');
            try {
                double numero = Double.parseDouble(entrada);
                if (Double.isFinite(numero) && numero > 0) return numero;
            } catch (NumberFormatException e) {
                // A mensagem abaixo orienta o usuario a tentar novamente.
            }
            System.out.println("Digite um numero valido maior que zero.");
        }
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.forLanguageTag("pt-BR"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== CALCULADORA DE IMC =====");
        String continuar;
        do {
            System.out.print("\nDigite seu nome: ");
            String nome = scanner.nextLine().trim();
            double peso = lerNumeroPositivo(scanner, "Digite seu peso em kg (ex: 70,5): ");
            double altura = lerNumeroPositivo(scanner, "Digite sua altura em metros (ex: 1,75): ");
            double imc = calcularIMC(peso, altura);
            exibirResultado(nome, imc);
            System.out.print("\nDeseja calcular novamente? (s/n): ");
            continuar = scanner.nextLine().trim();
        } while (continuar.equalsIgnoreCase("s"));
        System.out.println("\nObrigado por usar a calculadora!");
        scanner.close();
    }
}
