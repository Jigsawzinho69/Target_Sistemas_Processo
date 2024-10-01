package Testes;
/* 5) Escreva um programa que inverta os caracteres de um string.

IMPORTANTE:
a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
b) Evite usar funções prontas, como, por exemplo, reverse;
*/

public class T05 {
    public static void main(String[] args) {
        String txt = "Target Sistemas";

        String invertedString = invertString(txt);

        System.out.println("String ORIGINAL: " + txt);
        System.out.println("String INVERTIDA: " + invertedString);
    }

    public static String invertString(String str) {
        StringBuilder inverter = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            inverter.append(str.charAt(i)); 
        }

        return inverter.toString();
    }
}
