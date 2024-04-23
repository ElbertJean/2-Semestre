package entidades;

public class Cliente {

    public String nomeCompleto;
    public int idade;
    public String endereco;
    public String telefone;

    public Cliente(String nomeCompleto, int idade, String endereco, String telefone) {
        this.nomeCompleto = nomeCompleto;
        this.idade = idade;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String informacoesCliente() {
        return "Modelo do cliente: " + nomeCompleto + ".\nIdade: " + idade + ".\nEndereço " + endereco + ".\nTelefone: " + telefone;
      }
    
      public String editarTelefone (String telefone) {
        return this.telefone = telefone;
      }
    
      public int editarIdade (int idade) {
        return this.idade = idade;
      }
}
