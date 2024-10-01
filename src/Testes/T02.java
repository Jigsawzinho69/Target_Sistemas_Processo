package Testes;
/* 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores 
 * (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, 
 * ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido 
no código; */

import javax.swing.JOptionPane;

public class T02 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número:"));

        if (Fib(num)) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci!");
        } else {
            System.out.println("O número " + num + " NÃO pertence à sequência de Fibonacci!");
        }
    }

    public static boolean Fib(int num) {
    	int a = 0;
        int b = 1;
        int c = a + b;
        
        if (num == 0 || num == 1) {
            return true;
        }

        while (c <= num) {
            if (c == num) {
                return true;
            }
            a = b;
            b = c;
            c = a + b;
        }

        return false;
    }
}
