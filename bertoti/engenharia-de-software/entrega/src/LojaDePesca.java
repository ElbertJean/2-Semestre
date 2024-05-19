import java.util.ArrayList;
import java.util.List;

public class LojaDePesca {
    private List<Item> items;
    private List<Cliente> clientes;

    public LojaDePesca() {
      this.items = new ArrayList<>();
      this.clientes = new ArrayList<>();
    }

    public void cadastrarItem(Item item) {
      items.add(item);
    }

    public List<Item> buscarItemPorNome(String nome) {
      List<Item> result = new ArrayList<>();
      for (Item item : items) {
        if (item.getNome().equalsIgnoreCase(nome)) {
          result.add(item);
        }
      }
      return result;
    }

    public List<Item> buscarItemPorMarca(String marca) {
      List<Item> result = new ArrayList<>();
      for (Item item : items) {
        if (item.getMarca().equalsIgnoreCase(marca)) {
          result.add(item);
        }
      }
      return result;
    }

    public List<Item> buscarItemPorDetalhe(Detalhe detalhe) {
      List<Item> result = new ArrayList<>();
      for (Item item : items) {
        if (item.getDetalhe().comparar(detalhe)) {
          result.add(item);
        }
      }
      return result;
    }

    public void cadastrarCliente(Cliente cliente) {
      clientes.add(cliente);
    }

    public List<Cliente> buscarClientePorNome(String nome) {
      List<Cliente> result = new ArrayList<>();
      for (Cliente cliente : clientes) {
        if (cliente.getNome().equalsIgnoreCase(nome)) {
          result.add(cliente);
        }
      }
      return result;
    }

    public List<Cliente> buscarClientePorDocumentosCliente(DocumentosCliente documentoCliente) {
      List<Cliente> result = new ArrayList<>();
      for (Cliente cliente : clientes) {
        if (cliente.getDocumentosCliente().comparar(documentoCliente)) {
          result.add(cliente);
        }
      }
      return result;
    }

    public void addItemAoCliente(Cliente cliente, Item item) {
      cliente.addItem(item);
    }

    public void removeItemAoCliente(Cliente cliente, Item item) {
      cliente.removeItem(item);
    }

    public List<Item> buscarItemDoCliente(Cliente cliente) {
      return cliente.getItens();
    }
}