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
public class PessoaJuridica extends Pessoa {
    String cnpj;
    String nomeFantasia;
    int quantPessoasJuridicas;

     PessoaJuridica(String endereco, String nome, String cnpj, String nomeFantasia) {
         super(endereco, nome);
         this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }
          
    public PessoaJuridica(String endereco, String nome, String cnpj,String nomeFantasia,agenda_java.tipoPessoa tipoPessoa, agenda_java.meioContato meioContato){
        super(endereco, nome, tipoPessoa, meioContato);
        this.cnpj=cnpj;
        this.nomeFantasia=cnpj;
      
    }
           
      

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public int getQuantPessoasJuridicas() {
        return quantPessoasJuridicas;
    }


    
    
}
