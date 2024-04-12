package com.entrega1;

public class Cliente {

    public String nomeCompleto;
    public String idade;
    public String endereco;
    public String telefone;

    public Cliente(String nomeCompleto, String idade, String endereco, String telefone) {
        this.nomeCompleto = nomeCompleto;
        this.idade = idade;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String toString() {
        return "Nome completo: " + nomeCompleto + "\nIdade: " + idade + "\nEndereço: " + endereco + "\nTelefone" + telefone;
      }
}
