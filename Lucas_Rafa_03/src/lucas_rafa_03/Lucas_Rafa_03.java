package lucas_rafa_03;

import java.util.Scanner;


public class Lucas_Rafa_03 {

    
    public static void main(String[] args) {
        System.out.print("Digite um número N inteiro e positivo: ");
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        int resultado = ((1 + num)*num)/2;
        System.out.print("A soma dos N primeiros números é: " + resultado);
    }
}
