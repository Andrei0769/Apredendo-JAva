package com.mycompany.empresa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno.den
 */
public abstract class Juridica extends Pessoa{
    protected String cnpj;
    protected String incricaoEstadual;

    public Juridica(String cnpj, String incricaoEstadual, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.cnpj = cnpj;
        this.incricaoEstadual = incricaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIncricaoEstadual() {
        return incricaoEstadual;
    }

    public void setIncricaoEstadual(String incricaoEstadual) {
        this.incricaoEstadual = incricaoEstadual;
    }

    @Override
    public String toString() {
        return "\n=== Dados Pessoa Juridica ===" +
                super.toString()+
                "\nCNJP: " + cnpj +
                "\nIncrição Estadual: " + incricaoEstadual ;
    }

    
}
