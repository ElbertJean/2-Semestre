package entidades;

public class Aviao {
  public String companhiaAerea;
  public String tamanhoAviao;
  public String capacidadePassageiros;

  public String informacoesAviao() {
    return "Companhia aérea: " + companhiaAerea + ".\nTamanho do avião: " + tamanhoAviao + ".\nCapacidade de passageiros: " + capacidadePassageiros;
  }

  public String editarTamanhoAviao(String tamanhoAviao) {
    return this.tamanhoAviao = tamanhoAviao;
  }

  public String editarCapacidadePassageiros(String capacidadePassageiros) {
    return this.capacidadePassageiros = capacidadePassageiros;
  }
}
