package entidades;

public class Apartamento {
  public String morador;
  public String bloco;
  public int andar;

  public String informacoesApartamento() {
    return "Apartamento localizado no bloco " + bloco + ", andar " + andar + ", cujo morador se chama " + morador;
  }

  public String editarMorador (String morador) {
    return this.morador = morador;
  }

  public String possuiMorador (String possuiMorador) {
    if (possuiMorador == "sim") {
      return "Possui morador";
    } else {
      return "Nenhum morador";
    }
  }
}
