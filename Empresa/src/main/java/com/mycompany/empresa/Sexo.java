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
    
    String Genero;

    private Sexo(String Genero) {
        this.Genero = Genero;
    }

    public String getGenero() {
        return Genero;
    }
    
    
}
