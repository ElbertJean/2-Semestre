package entidades;

public class Moto {

  public String modelo;
  public String cor;
  public int ano;
  public String combustivel;

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

