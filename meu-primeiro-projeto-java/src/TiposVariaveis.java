public class TiposVariaveis {
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        double salarioMedio = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; /*nesse caso seria necessário realizar um casting pois o int pode ser maior que o short no total*/

        /*esse número sempre pode receber um outro valor, só precisa declarar int no inicio*/
        int numero = 1;
        /*caso queira que seja uma variavel que nunca mude, escreva final antes da variavel*/
        numero = 2;

        
    }
}
