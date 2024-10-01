package Testes;

/* ) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
• SP – R$67.836,43
• RJ – R$36.678,66
• MG – R$29.229,88
• ES – R$27.165,48
• Outros – R$19.849,53

Escreva um programa na linguagem que desejar onde calcule o percentual de representação 
que cada estado teve dentro do valor total mensal da distribuidora.  */

import javax.swing.JOptionPane;

public class T04 {
    public static void main(String[] args) {
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double totalFaturamento = sp + rj + mg + es + outros;

        double percSP = (sp / totalFaturamento) * 100;
        double percRJ = (rj / totalFaturamento) * 100;
        double percMG = (mg / totalFaturamento) * 100;
        double percES = (es / totalFaturamento) * 100;
        double percOutros = (outros / totalFaturamento) * 100;

        String mensagem = "";
        int opcao;

        do {
            String opcoes = "Escolha um estado para ver o percentual de faturamento:\n"
                    + "0 - SP\n"
                    + "1 - RJ\n"
                    + "2 - MG\n"
                    + "3 - ES\n"
                    + "4 - Outros\n"
                    + "9 - Sair";

            String entrada = JOptionPane.showInputDialog(opcoes);
            opcao = Integer.parseInt(entrada); // Convertendo a entrada para inteiro

            switch (opcao) {
                case 0:
                    mensagem = "Estado: SP\nPercentual de representação: " + String.format("%.2f", percSP) + "%";
                    break;
                case 1:
                    mensagem = "Estado: RJ\nPercentual de representação: " + String.format("%.2f", percRJ) + "%";
                    break;
                case 2:
                    mensagem = "Estado: MG\nPercentual de representação: " + String.format("%.2f", percMG) + "%";
                    break;
                case 3:
                    mensagem = "Estado: ES\nPercentual de representação: " + String.format("%.2f", percES) + "%";
                    break;
                case 4:
                    mensagem = "Outros Estados\nPercentual de representação: " + String.format("%.2f", percOutros) + "%";
                    break;
                case 9:
                    mensagem = "Saindo...";
                    break;
                default:
                    mensagem = "Opção inválida. Escolha um número de 0 a 4 ou 9 para sair.";
            }

            if (opcao != 9) {
                JOptionPane.showMessageDialog(null, mensagem);
            }

        } while (opcao != 9);
    }
}

