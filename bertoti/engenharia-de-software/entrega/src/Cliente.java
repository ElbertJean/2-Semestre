import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private DocumentosCliente documentosCliente;
    private List<Item> items;

    public Cliente(String nome, DocumentosCliente documentosCliente) {
        this.nome = nome;
        this.documentosCliente = documentosCliente;
        this.items = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public DocumentosCliente getDocumentosCliente() {
        return documentosCliente;
    }

    public void setDocumentosCliente(DocumentosCliente documentosCliente) {
        this.documentosCliente = documentosCliente;
    }

    public List<Item> getItens() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", documentosCliente=" + documentosCliente +
                ", items=" + items +
                '}';
    }
}