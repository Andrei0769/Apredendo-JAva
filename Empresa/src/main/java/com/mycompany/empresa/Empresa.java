/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empresa;

/**
 *
 * @author aluno.den
 */
public class Empresa {

    public static void main(String[] args) {
       Cliente cliente = new Cliente("1154-4548", Sexo.MASCULINO, Estado_civil.SOLTEIRO, "12/11/2005", "Andrei Luiz ", "(71) 9 8811-2455", "AndreiLuiz@gmail.com",
       new Endereco("Rua B", "124", "Perto da Ampli", "441-454", "Salvador", Unidade_federativa.BAHIA));
       
       Prestacao_servico prestacaoservico = new Prestacao_servico("12/05/2029", "12/06/2030", "654.654.64654.0001", "001", "Luana", "71 98811-2455", "Luana@gmail.com",
       new Endereco("Rua C", "154", "Rua do beco", "5154.65", "Pão de Açucar", Unidade_federativa.RIO_DE_JANEIRO));
       
       System.out.println(cliente);
       System.out.println(prestacaoservico);
    }
}
