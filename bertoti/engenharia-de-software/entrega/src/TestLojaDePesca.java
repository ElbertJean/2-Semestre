import java.util.List;

public class TestLojaDePesca {
  public static void main(String[] args) {

    // Nessa parte estou criando alguns detalhes para cada item que vou vincular ao item
    Detalhe detalheItem1 = new Detalhe("Vara de pesca Maruri Tambaqui 30~60lbs", "2.7m", true);
    Detalhe detalheItem2 = new Detalhe("Anzol circle hook 6/0", "6cm", false);
    Detalhe detalheItem3 = new Detalhe("Linha ZEED monofilamanento 0.40mm", "100m", true);

    // Nessa parte estou criando alguns itens para adicionar na loja
    Item item1 = new Item("Vara Maruri", "Maruri", detalheItem1);
    Item item2 = new Item("Anzol Marine Sports", "Marine Sports", detalheItem2);
    Item item3 = new Item("Linha Monofilamento", "Maruri", detalheItem3);

    // Nessa parte estou criando alguns documentos que vou vincular ao cliente
    DocumentosCliente docCliente1 = new DocumentosCliente("12345678", "111.222.333-44");
    DocumentosCliente docCliente2 = new DocumentosCliente("87654321", "555.666.777-88");

    // Nessa parte estou criando um cliente
    Cliente cliente1 = new Cliente("Elbert Jean", docCliente1);
    Cliente cliente2 = new Cliente("Júlio Cesar", docCliente2);

    // Nessa parte estou criando uma instância da LojaDePesca
    LojaDePesca loja = new LojaDePesca();

    // Nessa parte estou cadastrando itens na loja
    loja.cadastrarItem(item1);
    loja.cadastrarItem(item2);
    loja.cadastrarItem(item3);

    // Nessa parte estou cadastrando um cliente na loja
    loja.cadastrarCliente(cliente1);
    loja.cadastrarCliente(cliente2);

    // Nessa parte estou criando uma busca de itens pelo nome
    List<Item> itemsPorNome = loja.buscarItemPorNome("Vara Maruri");
    System.out.println("Itens encontrados por nome 'Vara Maruri': " + itemsPorNome.size());

    // Nessa parte estou buscando os itens por marca
    List<Item> itemsPorMarca = loja.buscarItemPorMarca("Maruri");
    System.out.println("Itens encontrados por marca 'Maruri': " + itemsPorMarca.size());

    // Aqui estou buscando os detalhes de um item
    List<Item> itemsPorDetalhe = loja.buscarItemPorDetalhe(detalheItem1);
    System.out.println("Itens encontrados por detalhe 'Vara de pesca Maruri Tambaqui 30~60lbs, 2.7m, novo': " + itemsPorDetalhe.size());

    // Buscando os clientes pelo nome
    List<Cliente> clientesPorNome = loja.buscarClientePorNome("Júlio Cesar");
    System.out.println("Clientes encontrados por nome 'Júlio Cesar': " + clientesPorNome.size());

    // Buscando os clientes pelo documento
    List<Cliente> clientesPorDoc = loja.buscarClientePorDocumentosCliente(docCliente1);
    System.out.println("Clientes encontrados por documentos 'RG: 12345678, CPF: 111.222.333-44': " + clientesPorDoc.size());

    // Aqui estou vinculando items ao cliente
    loja.addItemAoCliente(cliente1, item1);
    loja.addItemAoCliente(cliente1, item2);

    // Listar itens do cliente
    List<Item> itemsDoCliente = loja.buscarItemDoCliente(cliente1);
    System.out.println("Itens do cliente 'Elbert Jean': " + itemsDoCliente.toString());

    // Remover item do cliente
    loja.removeItemAoCliente(cliente1, item1);

    // Listar os itens do cliente após remover um item
    itemsDoCliente = loja.buscarItemDoCliente(cliente1);
    System.out.println("Itens do cliente 'Elbert Jean' após remoção: " + itemsDoCliente.toString());
  }
}