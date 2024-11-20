package com.celular.model;

import com.celular.interfaces.NavegarInterface;

public class NavegarInternet implements NavegarInterface {

    public void exibirPagina() {
        System.out.println("EXIBINDO PAGINA");
    }

    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA PAGINA");
    }

    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA");
    }
}
