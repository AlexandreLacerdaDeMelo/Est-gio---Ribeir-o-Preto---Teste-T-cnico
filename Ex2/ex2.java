import java.util.Scanner;

public class ex2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        int contador = 0;

        for (char c : input.toCharArray()) {
            if (c == 'a' || c == 'A') {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("A letra 'a' (maiúscula ou minúscula) aparece " + contador + " vez(es).");
        } else {
            System.out.println("A letra 'a' (maiúscula ou minúscula) não foi encontrada.");
        }
        
        scanner.close();
    }
}
