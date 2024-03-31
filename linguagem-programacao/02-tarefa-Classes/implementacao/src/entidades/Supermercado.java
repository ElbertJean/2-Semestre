package entidades;

public class Supermercado {

  public String produto;
  public String nomeSupermercado;
  public int quantidadeFuncionario;

  public String informacoesSupermercado() {
    return "Produtos: " + produto + ".\nNome do supermercado: " + nomeSupermercado + ".\nQuantidade de funcionários: " + quantidadeFuncionario;
  }

  public String editarProduto (String produto) {
    return this.produto = produto;
  }

  public int editarNumeroDeFuncionarios (int quantidadeFuncionario) {
    return this.quantidadeFuncionario = quantidadeFuncionario;
  }
}
