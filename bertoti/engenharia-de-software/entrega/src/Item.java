public class Item {
  private String nome;
  private String marca;
  private Detalhe detalhe;

  public Item(String nome, String marca, Detalhe detalhe) {
      this.nome = nome;
      this.marca = marca;
      this.detalhe = detalhe;
  }

  public String getNome() {
      return nome;
  }

  public void setNome(String nome) {
      this.nome = nome;
  }

  public String getMarca() {
      return marca;
  }

  public void setMarca(String marca) {
      this.marca = marca;
  }

  public Detalhe getDetalhe() {
      return detalhe;
  }

  public void setDetalhe(Detalhe detalhe) {
      this.detalhe = detalhe;
  }

  @Override
  public String toString() {
    return "\nItem {" + " nome: '" + nome + '\'' + ", marca: '" + marca + '\'' + ", detalhe: " + detalhe + '}'  + '\n';
  }
}