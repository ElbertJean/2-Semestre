public class DocumentosCliente {
  private String rg;
  private String cpf;

  public DocumentosCliente(String rg, String cpf) {
      this.rg = rg;
      this.cpf = cpf;
  }

  public String getRG() {
      return rg;
  }

  public void setRG(String rg) {
      this.rg = rg;
  }

  public String getCPF() {
      return cpf;
  }

  public void setCPF(String cpf) {
      this.cpf = cpf;
  }

  public boolean comparar(DocumentosCliente documentosCliente) {
      return this.rg.equalsIgnoreCase(documentosCliente.getRG()) &&
             this.cpf.equalsIgnoreCase(documentosCliente.getCPF());
  }
}