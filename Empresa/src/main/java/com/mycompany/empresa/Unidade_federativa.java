package com.mycompany.empresa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */

/**
 *
 * @author aluno.den
 */
public enum Unidade_federativa {
    BAHIA ("Bahia","BA"),
    SAO_PAULO("São Paulo","SP"),
    RIO_DE_JANEIRO("Rio de Janeiro","RJ");
    
     private String nome;
     private String Sigla;

    private Unidade_federativa(String nome, String Sigla) {
        this.nome = nome;
        this.Sigla = Sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return Sigla;
    }

    
    
}

