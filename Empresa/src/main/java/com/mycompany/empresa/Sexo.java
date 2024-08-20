package com.mycompany.empresa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */

/**
 *
 * @author aluno.den
 */
public enum Sexo {
    MASCULINO ("Masculino"),
    FEMININO ("Feminino");
    
    private String genero;

    private Sexo(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    
    
}
