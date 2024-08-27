package com.mycompany.empresa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno.den
 */
public class Diretor extends CargoDeConfianca {
    private static final double PREMIO = 0.5;

    public Diretor(String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento, Bonificacao bonificacao) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento, bonificacao);
    }

    @Override
    public double getSalarioFinal() {
        return super.getSalarioFinal() + (salario * PREMIO);
    }

    @Override
    public String toString() {
        return super.toString() + " (Diretor)";
    }
}

