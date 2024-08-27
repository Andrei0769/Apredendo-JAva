
import com.mycompany.empresa.Endereco;
import com.mycompany.empresa.Funcionario;
import com.mycompany.empresa.Setor;
import com.mycompany.empresa.Sexo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno.den
 */
public class Motorista extends Funcionario {
    private final String carteiraDeHabilitacao;

    public Motorista(String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento, String carteiraDeHabilitacao) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\n Carteira de Trabalho: " + carteiraDeHabilitacao;
    }

    public double getSalarioFinal() {
        double salario = 0;
        return salario;
    }
}
