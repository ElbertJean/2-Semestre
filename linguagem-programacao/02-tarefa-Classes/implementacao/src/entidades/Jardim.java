package entidades;

public class Jardim {

  public String tamanhoJardim;
  public String flor;
  public String nomeJardim;

  public String informacoesJardim() {
    return "Tamanho do jardim: " + tamanhoJardim + ".\nFlor: " + flor + ".\nNome do jardim: " + nomeJardim;
  }

  public String editarTamanhoJardim(String tamanhoJardim) {
    return this.tamanhoJardim = tamanhoJardim;
  }

  public String editarFlor(String flor) {
    return this.flor = flor;
  }
}
