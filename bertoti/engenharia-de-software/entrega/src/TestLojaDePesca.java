import static org.junit.Assertions.*;

import org.junit.Test;

import java.util.List;

public class TestLojaDePesca {

    @Test
    void testLojaDePesca() {
        // Criação de uma nova loja de pesca
        LojaDePesca loja = new LojaDePesca();

        // Criação de detalhes de produtos
        Detalhe detalhe1 = new Detalhe("Vara de pesca", "2m", true);
        Detalhe detalhe2 = new Detalhe("Anzol", "10cm", false);
        Detalhe detalhe3 = new Detalhe("Linha", "100m", true);

        // Criação de itens
        Item item1 = new Item("Vara Shimano", "Shimano", detalhe1);
        Item item2 = new Item("Anzol Mustad", "Mustad", detalhe2);
        Item item3 = new Item("Linha Trilene", "Berkley", detalhe3);

        // Cadastro de itens na loja
        loja.cadastrarItem(item1);
        loja.cadastrarItem(item2);
        loja.cadastrarItem(item3);

        // Verificação de itens cadastrados
        assertEquals(3, loja.buscarItemPorNome("Vara Shimano").size());
        assertEquals("Vara Shimano", loja.buscarItemPorNome("Vara Shimano").get(0).getNome());

        // Busca de itens por nome
        List<Item> itemsPorNome = loja.buscarItemPorNome("Vara Shimano");
        assertEquals(1, itemsPorNome.size());
        assertEquals("Shimano", itemsPorNome.get(0).getMarca());

        // Busca de itens por marca
        List<Item> itemsPorMarca = loja.buscarItemPorMarca("Mustad");
        assertEquals(1, itemsPorMarca.size());
        assertEquals("Anzol Mustad", itemsPorMarca.get(0).getNome());

        // Busca de itens por detalhe
        List<Item> itemsPorDetalhe = loja.buscarItemPorDetalhe(detalhe1);
        assertEquals(1, itemsPorDetalhe.size());
        assertEquals("Vara Shimano", itemsPorDetalhe.get(0).getNome());

        // Criação de documentos de clientes
        DocumentosCliente docCliente1 = new DocumentosCliente("12345678", "111.222.333-44");
        DocumentosCliente docCliente2 = new DocumentosCliente("87654321", "555.666.777-88");

        // Criação de clientes
        Cliente cliente1 = new Cliente("João Silva", docCliente1);
        Cliente cliente2 = new Cliente("Maria Oliveira", docCliente2);

        // Cadastro de clientes na loja
        loja.cadastrarCliente(cliente1);
        loja.cadastrarCliente(cliente2);

        // Verificação de clientes cadastrados
        assertEquals(2, loja.buscarClientePorNome("João Silva").size());
        assertEquals("João Silva", loja.buscarClientePorNome("João Silva").get(0).getNome());

        // Busca de clientes por nome
        List<Cliente> clientesPorNome = loja.buscarClientePorNome("Maria Oliveira");
        assertEquals(1, clientesPorNome.size());
        assertEquals("Maria Oliveira", clientesPorNome.get(0).getNome());

        // Busca de clientes por documentos
        List<Cliente> clientesPorDoc = loja.buscarClientePorDocumentosCliente(docCliente1);
        assertEquals(1, clientesPorDoc.size());
        assertEquals("João Silva", clientesPorDoc.get(0).getNome());

        // Adição de itens ao cliente
        loja.addItemAoCliente(cliente1, item1);
        loja.addItemAoCliente(cliente1, item2);

        // Verificação de itens do cliente
        List<Item> itemsDoCliente = loja.buscarItemDoCliente(cliente1);
        assertEquals(2, itemsDoCliente.size());
        assertTrue(itemsDoCliente.contains(item1));
        assertTrue(itemsDoCliente.contains(item2));

        // Remoção de item do cliente
        loja.removeItemAoCliente(cliente1, item1);

        // Verificação de itens do cliente após a remoção
        itemsDoCliente = loja.buscarItemDoCliente(cliente1);
        assertEquals(1, itemsDoCliente.size());
        assertFalse(itemsDoCliente.contains(item1));
        assertTrue(itemsDoCliente.contains(item2));
    }

    private void assertTrue(boolean contains) {
      throw new UnsupportedOperationException("Unimplemented method 'assertTrue'");
    }

    private void assertEquals(int i, int size) {
      throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    private void assertEquals(String string, String string2) {
      throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }
}