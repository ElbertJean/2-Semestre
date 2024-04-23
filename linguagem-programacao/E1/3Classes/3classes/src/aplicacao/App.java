package aplicacao;

import entidades.Carro;
import entidades.Moto;
import entidades.Cliente;


public class App {

  public static void main(String[] args) {
    Carro carro = new Carro("Chevette", 1995, "ABC-1234", "Chevrolet");
    System.out.println(carro.informacoesCarro());
    carro.editarModelo("Onix LTZ");
    System.out.println("\n--------------------------\n");
    
    System.out.println(carro.informacoesCarro());
    
    System.out.println("\n**************************************************");
    System.out.println("**************************************************\n");

    Moto moto = new Moto("Harley-Davidson", 1982, "Preta", "Gasolina");
    System.out.println(moto.informacoesMoto());
    moto.editarCombustivel("Álcool");
    System.out.println("\n--------------------------\n");
    System.out.println(moto.informacoesMoto());

    System.out.println("\n**************************************************");
    System.out.println("**************************************************\n");

    Cliente cliente = new Cliente("Elbert Jean", 27, "Rua Tal, número 55", "129999-1234");
    System.out.println(cliente.informacoesCliente());
    cliente.editarTelefone("(12)99123-1288");
    System.out.println("\n--------------------------\n");
    System.out.println(cliente.informacoesCliente());

    System.out.println("\n**************************************************\n");
  }
}
