public class Fatura {
    
public int numeroFaturado;
public String descriçao;
public int quantidadeCompra;
public double preço;
  

public Fatura (int numeroFaturado, String descriçao, int quantidadeCompra, double preço){ 

 this.numeroFaturado = numeroFaturado;
 this.descriçao = descriçao;
 this.quantidadeCompra = quantidadeCompra <= 0 ? 0: quantidadeCompra;
 this.preço = preço <= 0 ? 0.0 : preço;

}
public double calcularValorFatura(){
return(double)quantidadeCompra*preço;

}
   
public int numeroFaturado(){
return numeroFaturado();

}

public  String descriçao(){
return descriçao();

}

public int quantidadeCompra(){
return quantidadeCompra();

}

public double preço(){
return preço();

}
}
