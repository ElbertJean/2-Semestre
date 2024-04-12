package com.entrega1;

public class Moto {

    public String modelo;
    public String cor;
    public String ano;
    public String combustivel;

    public Moto(String modelo, String cor, String ano, String combustivel) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.combustivel = combustivel;
    }

    public String toString() {
        return "Modelo: " + modelo + "\nCor: " + cor + "\nAno: " + ano + "\nCombustível:" + combustivel;
      }
}
