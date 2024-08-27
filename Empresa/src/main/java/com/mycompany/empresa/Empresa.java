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
        Funcionario advogado = new Advogado("João de Jesus", "8654.5545.564-65", "123.4568.963-6", 
                new Endereco("Rua B ", "124", "Perto de Beco", "124.654-020", "Salvador", UnidadeFederativa.BAHIA), Setor.JURIDICO, Sexo.MASCULINO, 6700, "12/11/2025", "456");
        
         System.out.println(advogado);
         System.out.println("Salário Final do Advogado: R$ " + advogado.getSalario());
    }
}
