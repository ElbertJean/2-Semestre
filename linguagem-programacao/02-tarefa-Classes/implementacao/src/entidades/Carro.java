package entidades;

public class Carro {

  public String modelo;
  public String marca;
  public int ano;

  public String informacoesCarro() {
    return "Modelo do carro: " + modelo + ".\nMarca: " + marca + ".\nAno de fabricação: " + ano;
  }

  public String editarModelo (String modelo) {
    return this.modelo = modelo;
  }

  public String editarMarca (String marca) {
    return this.marca = marca;
  }
}
