import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numUsuario = num.nextInt();

        if (numUsuario > 0 ){
            System.out.println("Número positivo!");
        } else {
            System.out.println("Número negativo");
        }

        num.close();
    }
}