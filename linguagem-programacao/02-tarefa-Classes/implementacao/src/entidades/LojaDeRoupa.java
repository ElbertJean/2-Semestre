package entidades;

public class LojaDeRoupa {
  public String camiseta;
  public String tamanho;
  public String estoque;

  public String informacoesEstoque() {
    return "Camiseta: " + camiseta + ".\nTamanho: " + tamanho + ".\nEstoque: " + estoque;
  }

  public String editarCamiseta(String camiseta) {
    return this.camiseta = camiseta;
  }

  public String informarCamisetasVendidas(int qtdVendida) {
    if (qtdVendida >= 10) {
      return "Você vendeu mais de 10 camisetas, continue assim!";
    } else {
      return "Você precisa melhorar as suas vendas";
    }
  }


}
