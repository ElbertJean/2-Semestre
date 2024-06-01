package com.entrega2;

public class Carro {
  
  public String fabricante;
  public String placa;
  public String modelo;
  public String ano;

  public Carro(String fabricante, String placa, String modelo, String ano) {
    this.modelo = modelo;
    this.ano = ano;
    this.fabricante = fabricante;
    this.placa = placa;
  }

  public String toString() {
    return "Modelo: " + modelo + "\nFabricante: " + fabricante + "\nPlaca: " + placa + "\nAno:" + ano;
  }
}
