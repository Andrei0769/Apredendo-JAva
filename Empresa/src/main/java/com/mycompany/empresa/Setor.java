package com.mycompany.empresa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */

/**
 *
 * @author aluno.den
 */
public enum Setor {
    ENGENHARIA ("Engenharia"),
    JURIDICO ("Jurídico"),
    RECURSOS_HUMANOS ("Recursos Humanos"),
    MARKETING ("Marketing"),
    OPERACOES ("Opereções");
    
    String profissao;

    private Setor(String profissao) {
        this.profissao = profissao;
    }

    public String getProfissao() {
        return profissao;
    }
    
}
