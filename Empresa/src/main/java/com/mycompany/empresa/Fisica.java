package com.mycompany.empresa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno.den
 */
public abstract class Fisica extends Pessoa{
    protected Sexo sexo; 
    protected Estado_civil estadocivil;
    protected String dataDeNascimento;

    public Fisica(Sexo sexo, Estado_civil estadocivil, String dataDeNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.sexo = sexo;
        this.estadocivil = estadocivil;
        this.dataDeNascimento = dataDeNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Estado_civil getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(Estado_civil estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return "== Dados Pessoa Fisica == " +
                super.toString() +
               "\nSexo: " + sexo +
               "\nEstado Civil: " + estadocivil +
               "\nData de Nascimento: " + dataDeNascimento;
    }

}
