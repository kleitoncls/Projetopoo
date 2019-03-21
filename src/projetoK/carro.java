package projetoK;

public class carro {
    String modelo,cor,marca,chassi;
  int ano, numeroDePortas,nMarchaAtual,reduzMarcha;
  double velocidadeMaxima, velocidadeAtual, volumeDoCombostuvel;
  boolean tetoSolar, cambioAutomatico;
  proprietario proprietario;

  void acelera(){
      velocidadeAtual= velocidadeAtual +1;
  }
  void freia(){
      velocidadeAtual = 0;

  }
  void trocaMacha (int marchaDesejada){
      nMarchaAtual = marchaDesejada;

  }
  void reduzMarcha (){
      nMarchaAtual=nMarchaAtual-1;
      

  }

    public void trocaMarcha(int i) {
    }
}
