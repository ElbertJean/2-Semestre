package com.entrega1;

public class Moto extends Automovel{

    public String cor;
    public String combustivel;

    public Moto(String modelo, String cor, String ano, String combustivel) {
        super(modelo, ano);
        this.cor = cor;
        this.combustivel = combustivel;
    }

    public String toString() {
        return "Modelo: " + modelo + "\nCor: " + cor + "\nAno: " + ano + "\nCombustível:" + combustivel;
      }
}
