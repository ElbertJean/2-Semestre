package aplicacao;

import entidades.Apartamento;
import entidades.Aviao;
import entidades.Biblioteca;
import entidades.Carro;
import entidades.Floresta;
import entidades.Jardim;
import entidades.Lancha;
import entidades.LojaDeRoupa;
import entidades.Moto;
import entidades.Supermercado;

public class TestaClasse {

  public static void main(String[] args) {
    Carro carro = new Carro();
    carro.marca = "Chevrolet";
    carro.modelo = "Onix";
    carro.ano = 2014;
    System.out.println(carro.informacoesCarro());
    carro.editarModelo("Onix LTZ");
    System.out.println(carro.informacoesCarro());
    
    System.out.println("\n**************************************************\n");

    Moto moto = new Moto();
    moto.modelo = "Harley-Davidson";
    moto.cor = "Prata";
    moto.ano = 2020;
    moto.combustivel = "Gasolina";
    System.out.println(moto.informacoesMoto());
    moto.editarCombustivel("Álcool");
    System.out.println(moto.informacoesMoto());

    System.out.println("\n**************************************************\n");

    Apartamento apartamento = new Apartamento();
    apartamento.morador = "Joaquim";
    apartamento.bloco = "A";
    apartamento.andar = 1;
    System.out.println(apartamento.informacoesApartamento());
    System.out.println(apartamento.possuiMorador("sim"));

    System.out.println("\n**************************************************\n");

    Biblioteca biblioteca = new Biblioteca();
    biblioteca.livro = "Java. Aprendendo sobre orientação a objetos";
    biblioteca.autor = "Joaquim";
    biblioteca.editora = "Casa do Código";
    System.out.println(biblioteca.informacoesLivro());
    System.out.println(biblioteca.alugarLivro("não"));

    System.out.println("\n**************************************************\n");

    LojaDeRoupa roupa = new LojaDeRoupa();
    roupa.camiseta = "Preta";
    roupa.tamanho = "P";
    roupa.estoque = "10";
    System.out.println(roupa.informacoesEstoque());
    System.out.println(roupa.informarCamisetasVendidas(15));

    System.out.println("\n**************************************************\n");

    Aviao aviao = new Aviao();
    aviao.companhiaAerea = "Latam";
    aviao.tamanhoAviao = "Pequeno";
    aviao.capacidadePassageiros = "50";
    System.out.println(aviao.informacoesAviao());
    aviao.editarTamanhoAviao("Médio");
    System.out.println(aviao.informacoesAviao());

    System.out.println("\n**************************************************\n");

    Lancha lancha = new Lancha();
    lancha.modelo = "Falcon 9";
    lancha.marca = "Pepsi";
    lancha.ano = 2020;
    System.out.println(lancha.informacoesLancha());
    lancha.editarAno(2021);
    System.out.println(lancha.informacoesLancha());

    System.out.println("\n**************************************************\n");

    Jardim jardim = new Jardim();
    jardim.nomeJardim = "Jardim das flores";
    jardim.flor = "Violeta";
    jardim.tamanhoJardim = "Pequeno";
    System.out.println(jardim.informacoesJardim());
    jardim.editarFlor("Rosa");
    System.out.println(jardim.informacoesJardim());

    System.out.println("\n**************************************************\n");

    Floresta floresta = new Floresta();
    floresta.animal = "Esquilo";
    floresta.tamanhoFloresta = "Pequeno";
    floresta.arvore = "Cerejeira";
    System.out.println(floresta.informacoesFloresta());
    floresta.editarAnimal("Tamanduá");
    System.out.println(floresta.informacoesFloresta());

    System.out.println("\n**************************************************\n");

    Supermercado supermercado = new Supermercado();
    supermercado.produto = "Leite";
    supermercado.quantidadeFuncionario = 10;
    supermercado.nomeSupermercado = "Dois irmãos";
    System.out.println(supermercado.informacoesSupermercado());
    supermercado.editarNumeroDeFuncionarios(20);
    System.out.println(supermercado.informacoesSupermercado());
  }
}
