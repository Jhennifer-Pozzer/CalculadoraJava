package Calculadora;

import java.util.Scanner;

public class CalculadoraJava {
    public static void main (String[] agrs) {

        // entrada do usuário

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("Informe a operação desejada:");
        String op = scanner.next();

        // lógica

        double resultado = "+" .equals(op) ?  num1 + num2 : 0;
        resultado = "-" .equals(op) ? num1 - num2 : resultado;
        resultado = "*" .equals(op) ? num1 * num2 : resultado;
        resultado = "/" .equals(op) ? num1 / num2 : resultado;
        resultado = "%" .equals(op) ? num1 % num2 : resultado;




        System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);

        scanner.close();
    }

}
