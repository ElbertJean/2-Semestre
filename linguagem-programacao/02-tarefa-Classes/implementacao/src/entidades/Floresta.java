package entidades;

public class Floresta {

  public String tamanhoFloresta;
  public String animal;
  public String arvore;

  public String informacoesFloresta() {
    return "Tamanho da floresta: " + tamanhoFloresta + ".\nAnimal: " + animal + ".\nArvore: " + arvore;
  }

  public String editarArvore (String arvore) {
    return this.arvore = arvore;
  }

  public String editarAnimal (String animal) {
    return this.animal = animal;
  }
}
