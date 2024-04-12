package com.entrega1;

public class Carro {
  
  public String modelo;
  public String fabricante;
  public String placa;
  public String ano;

  public Carro(String modelo, String fabricante, String placa, String ano) {
    this.modelo = modelo;
    this.fabricante = fabricante;
    this.placa = placa;
    this.ano = ano;
  }

  public String toString() {
    return modelo + " - " + fabricante + " - " + placa + " - " + ano;
  }

}
