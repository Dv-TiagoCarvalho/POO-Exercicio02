public class Main {
    public static void main(String[] args) {

         Fatura c1 = new Fatura(5,"memoria", 10, 300);

        System.out.println("Numero do item: " + c1.numeroFaturado);
        System.out.println("Descrição do item: " + c1.descriçao);
        System.out.println("Quantidade Compra: " + c1.quantidadeCompra);
        System.out.println("Preço: " + c1.preço);
        System.out.println("Valor Fatura: " + c1.calcularValorFatura());
        








        
    }   
}
