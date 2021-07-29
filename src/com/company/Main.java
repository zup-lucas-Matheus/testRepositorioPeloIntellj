package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Caneta c1 = new Caneta();

        c1.modelo = "stancovik";
        c1.cor = "azul";
        c1.ponta = 05f;
        c1.tampar();
        c1.status();
        c1.rabiscar();

        System.out.println("-----------------------------------------");
        Caneta c2 = new Caneta();
        c2.modelo = "Guanabara";
        c2.cor = "PRETA";
        c2.destampar();
        c2.status();
        c2.rabiscar();

    }
}
