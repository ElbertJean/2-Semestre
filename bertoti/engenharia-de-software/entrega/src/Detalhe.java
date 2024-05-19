public class Detalhe {
  private String descricaoProduto;
  private String tamanho;
  private boolean produtoNovo;

  public Detalhe(String descricaoProduto, String tamanho, boolean produtoNovo) {
    this.descricaoProduto = descricaoProduto;
    this.tamanho = tamanho;
    this.produtoNovo = produtoNovo;
  }

  public String getDescricaoProduto() {
      return descricaoProduto;
  }

  public void setDescricaoProduto(String descricaoProduto) {
      this.descricaoProduto = descricaoProduto;
  }

  public String getTamanho() {
      return tamanho;
  }

  public void setTamanho(String tamanho) {
      this.tamanho = tamanho;
  }

  public boolean getProdutoNovo() {
      return produtoNovo;
  }

  public void setProdutoNovo(boolean produtoNovo) {
      this.produtoNovo = produtoNovo;
  }

  public boolean comparar(Detalhe detalhe) {
      return this.descricaoProduto.equalsIgnoreCase(detalhe.getDescricaoProduto()) &&
             this.tamanho.equalsIgnoreCase(detalhe.getTamanho()) &&
             this.produtoNovo == detalhe.getProdutoNovo();
  }

  @Override
    public String toString() {
      return "descricaoProduto: '" + descricaoProduto + '\'' +", tamanho: '" + tamanho + '\'' +", produtoNovo: " + produtoNovo +'}';
    }
}