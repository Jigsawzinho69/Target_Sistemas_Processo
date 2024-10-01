package Testes;
/* 3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, 
 * que calcule e retorne:
 * 
• O menor valor de faturamento ocorrido em um dia do mês;
• O maior valor de faturamento ocorrido em um dia do mês;
• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

IMPORTANTE:
a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média; */

public class T03 {
    public static void main(String[] args) {
        int[] fat = {135, 110, 94, 102, 122, 119, 130, 107, 104, 131, 103, 114, 117, 139, 126, 121};
        
        int menorValor = Integer.MAX_VALUE;
        int maiorValor = Integer.MIN_VALUE;
        int somaFaturamento = 0;
        int diasComFaturamento = 0;
        
        for (int i = 0; i < fat.length; i++) {
            if (fat[i] > 0) { 
                if (fat[i] < menorValor) {
                    menorValor = fat[i];
                }
                if (fat[i] > maiorValor) {
                    maiorValor = fat[i];
                }
                
                somaFaturamento += fat[i];
                diasComFaturamento++;
            }
        }
        
        double mediaMensal = (double) somaFaturamento / diasComFaturamento;
        
        int diasAcimaDaMedia = 0;
        for (int i = 0; i < fat.length; i++) {
            if (fat[i] > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }
        
        System.out.println("Menor valor de faturamento em um dia do mês: " + menorValor);
        System.out.println("Maior valor de faturamento em um dia do mês: " + maiorValor);
        System.out.println("Número de dias com faturamento acima da média mensal: " + diasAcimaDaMedia);
    }
}
