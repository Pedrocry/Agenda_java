/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda_java;

/**
 *
 * @author Mendax
 */
public class PessoaFisica extends Pessoa{
    
    
    
    private String cpf;
    private int anoNascimento;
    private int quantPessoasFisicas=0;

 //   public PessoaFisica(String cpf){this.cpf=cpf;}
    public PessoaFisica(String cpf, int anoNascimento, String endereco, String nome) {
        super(endereco, nome);
        this.cpf = cpf;
        this.anoNascimento = anoNascimento;
    }

// sobrecasrga de construtortes
    public PessoaFisica(String cpf, int anoNascimento, String endereco, String nome, agenda_java.tipoPessoa tipoPessoa, agenda_java.meioContato meioContato) {
        super(endereco, nome, tipoPessoa, meioContato);
        this.cpf = cpf;
        this.anoNascimento = anoNascimento;
    }
    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public int getQuantPessoasFisicas() {
        return quantPessoasFisicas;
    }


}
