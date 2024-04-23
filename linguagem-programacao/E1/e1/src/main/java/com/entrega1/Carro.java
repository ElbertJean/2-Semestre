package com.entrega1;

public class Carro extends Automovel {
  
  public String fabricante;
  public String placa;

  public Carro(String fabricante, String placa, String modelo, String ano) {
    super(modelo, ano);
    this.fabricante = fabricante;
    this.placa = placa;
  }

  public String toString() {
    return "Modelo: " + modelo + "\nFabricante: " + fabricante + "\nPlaca: " + placa + "\nAno:" + ano;
  }
}
