package projetoK;

public class MAIN {
    public static void main(String args[]) {
        proprietario proprietario = new proprietario();
        proprietario.Nome = "kleiton";
        proprietario.Bairro = "marambaia";
        proprietario.Cep= "66615860";
        proprietario.cidade="belem";
        proprietario.cpf="52551451478";
        proprietario.datadenascimento="18/05/1999";
        proprietario.Estado="Pará";
        proprietario.rg="6680404";
        proprietario.Complemento= "casa2";

        carro carro=new carro();
        carro.nMarchaAtual = 5;
        carro.proprietario= proprietario;
        carro.nMarchaAtual= 10 ;
        System.out.println(carro.velocidadeAtual);
        carro.acelera();
        carro.freia();
        System.out.println(carro.velocidadeAtual);

        System.out.println(carro.nMarchaAtual);
        carro.trocaMarcha(3);
        System.out.println(carro.nMarchaAtual);

    }

}
