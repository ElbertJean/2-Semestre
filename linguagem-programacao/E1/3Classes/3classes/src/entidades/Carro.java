package entidades;

public class Carro {

  public String modelo;
  public int ano;
  public String placa;
  public String fabricante;

  public Carro(String modelo, int ano, String placa, String fabricante) {
    this.modelo = modelo;
    this.ano = ano;
    this.placa = placa;
    this.fabricante = fabricante;
  }

  public String informacoesCarro() {
    return "Modelo do carro: " + modelo + ".\nAno: " + ano + ".\nPlaca " + placa + ".\nFabricante: " + fabricante;
  }

  public String editarModelo (String modelo) {
    return this.modelo = modelo;
  }

  public int editarAno (int ano) {
    return this.ano = ano;
  }
}
