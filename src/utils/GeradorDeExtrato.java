package utils;

public class GeradorDeExtrato {
    public static void extratoDeTransferencia(String titular, int data, double valor, String recebedor ){
        System.out.println("===== EXTRATO DA TRANSFERENCIA =====");
        System.out.println("TITULAR : ");
        System.out.println("DATA DA TRANSFERENCIA : ");
        System.out.println("VALOR TRANSFERIDO : ");
        System.out.println("PARA : ");
    }
    public static void dadosDaConta(String titular, int data, double valor, String recebedor){
        System.out.println("===== EXTRATO DA CONTA =====");
        System.out.println("TITULAR : ");
        System.out.println("DATA : ");
        System.out.println("SALDO ATUAL : ");
        System.out.println("==== HISTORICO DA CONTA =====");
        System.out.println("-----------Em breve----------");
    }
}
