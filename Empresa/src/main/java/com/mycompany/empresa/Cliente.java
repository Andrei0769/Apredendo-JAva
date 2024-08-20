package com.mycompany.empresa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno.den
 */
public class Cliente extends Fisica{
    private String protocoloAtendimento;

    public Cliente(String protocoloAtendimento, Sexo sexo, Estado_civil estadocivil, String dataDeNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(sexo, estadocivil, dataDeNascimento, nome, telefone, email, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    public String getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(String protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }

    @Override
    public String toString() {
        return super.toString()+ 
                "\nProtocolo de Atendimento: " + protocoloAtendimento;
    }

    
    
}
