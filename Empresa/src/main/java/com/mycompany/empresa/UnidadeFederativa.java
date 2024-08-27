package com.mycompany.empresa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno.den
 */
public enum UnidadeFederativa {
    BAHIA ("Bahia"),
    SAO_PAULO ("São Paulo"),
    RIO_DE_JANEIRO ("Rio de Janeiro");
    
    String Cidade;

    private UnidadeFederativa(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getCidade() {
        return Cidade;
    }
    
    
}
