import java.util.Scanner;
public class planotelefone{
    public static void main(String [] args){
        //when min > 100, preço total: min - 100 * 2.
        int valorPlano;
        int minExtra;
        int minTotal;
        int valorExtra;
        int valorTotal;
        valorPlano = 50;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de minutos consumidos: ");
        minTotal = sc.nextInt();
        if (minTotal < 0){
            System.out.println("Número de minutos inválido.");
            return;
        }
        if (minTotal > 100){
            minExtra = minTotal - 100;
            valorExtra = minExtra*2;
            valorTotal = valorPlano + valorExtra;
            System.out.println("O valor total da conta é: " + valorTotal);
            System.out.printf("%d reais foram cobrados a mais por conta dos minutos extras.\n", valorExtra);
            System.out.println(minExtra + " minutos foram cobrados a mais por conta dos minutos extras.");
        } else {
            valorTotal = valorPlano;
            System.out.println("O valor total da conta é: " + valorTotal);
        }
        sc.close();
    }
}