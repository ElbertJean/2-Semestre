package entidades;

public class Lancha {

  public String modelo;
  public String marca;
  public int ano;

  public String informacoesLancha() {
    return "Modelo do lancha: " + modelo + ".\nMarca: " + marca + ".\nAno de fabricação: " + ano;
  }

  public String editarModelo (String modelo) {
    return this.modelo = modelo;
  }

  public int editarAno (int ano) {
    return this.ano = ano;
  }
}
