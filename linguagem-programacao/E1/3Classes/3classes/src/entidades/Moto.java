package entidades;

public class Moto {

  public String modelo;
  public int ano;
  public String cor;
  public String combustivel;

  public Moto(String modelo, int ano, String cor, String combustivel) {
    this.modelo = modelo;
    this.ano = ano;
    this.cor = cor;
    this.combustivel = combustivel;
  }

  public String informacoesMoto() {
    return "Modelo da moto: " + modelo + ".\nCor: " + cor + ".\nAno de fabricação: " + ano + ".\nCombustível: " + combustivel;
  }

  public String editarCor (String cor) {
    return this.cor = cor;
  }

  public String editarCombustivel (String combustivel) {
    return this.combustivel = combustivel;
  }
}

