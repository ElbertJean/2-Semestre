package entidades;

public class Biblioteca {

  public String livro;
  public String autor;
  public String editora;

  public String editarLivro(String livro) {
    return this.livro = livro;
  }

  public String alugarLivro(String alugarLivro) {
    if (alugarLivro == "sim") {
      return "Você está alugando este livro";
    } else {
      return "Procure outro livro para alugar";
    }
  }

  public String informacoesLivro() {
    return "Livro: " + livro + ".\nAutor: " + autor + ".\nEditora: " + editora;    
  }
}
