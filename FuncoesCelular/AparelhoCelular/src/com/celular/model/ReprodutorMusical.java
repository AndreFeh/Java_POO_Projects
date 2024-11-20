package com.celular.model;

import com.celular.interfaces.ReprodutorInterface;

public class ReprodutorMusical implements ReprodutorInterface {
    public void tocar() {
        System.out.println("TOCANDO");
    }

    public void pausar() {
        System.out.println("PAUSANDO");
    }

    public void selecionarMusica() {
        System.out.println("SELECIONANDO");
    }
}
