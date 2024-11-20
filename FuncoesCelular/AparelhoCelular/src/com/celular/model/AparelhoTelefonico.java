package com.celular.model;

import com.celular.interfaces.AparelhoInterface;

public class AparelhoTelefonico implements AparelhoInterface {

    public void ligar() {
        System.out.println("LIGANDO...");
    }
    public void atender() {
        System.out.println("ATENDENDO...");
    }
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ...");
    }
}
