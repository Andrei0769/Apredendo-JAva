package com.mycompany.empresa;


import com.mycompany.empresa.Fisica;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno.den
 */
public class Prestacao_servico extends Juridica{
     private String contratoInicio;
     private String contratoFim;

    public Prestacao_servico(String contratoInicio, String contratoFim, String cnpj, String incricaoEstadual, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, incricaoEstadual, nome, telefone, email, endereco);
        this.contratoInicio = contratoInicio;
        this.contratoFim = contratoFim;
    }

    public String getContratoInicio() {
        return contratoInicio;
    }

    public void setContratoInicio(String contratoInicio) {
        this.contratoInicio = contratoInicio;
    }

    public String getContratoFim() {
        return contratoFim;
    }

    public void setContratoFim(String contratoFim) {
        this.contratoFim = contratoFim;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\n==Prestação de Serviços==" +
                "\n Inicio do COntrato: " + contratoInicio +
                "\n Fim do Contrato: " + contratoFim ;
    }

     
}

