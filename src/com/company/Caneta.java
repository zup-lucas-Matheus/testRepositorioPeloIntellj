package com.company;

public class Caneta {

    //atributos

    public String modelo;
    public String cor;
    public float ponta;
    public int carga;
    public boolean tampada;


    //metodos
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! Não posso rabscar ");

        }
        else {
            System.out.println("Estou rabiscando! ");
        }

    }

    void tampar(){
        this.tampada = true;

    }

    void destampar(){
        this.tampada = false;



    }

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);

    }

}
