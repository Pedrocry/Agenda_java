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
public abstract class Pessoa {

   
   protected int id;
   protected String endereco;
   protected String nome;
   protected tipoPessoa tipoPessoa; 
   protected PessoaFisica pessoaFisica;
   protected PessoaJuridica  pessoaJuridica;
   
    public meioContato[] contatosMeio;
   
   private int posicaoLivre;
   static private int quantPessoas;
   static private int numeroID;
   
   
   Pessoa( String endereco, String nome){
        this.contatosMeio = new meioContato[5];
        this.endereco=endereco;
        this.nome=nome;
   }
   Pessoa(String endereco, String nome,tipoPessoa tipoPessoa,meioContato meioContato){
        this.contatosMeio = new meioContato[5];
        this.endereco=endereco;
        this.nome=nome;
        this.tipoPessoa=tipoPessoa;
       // this.meioContato=meioContato;
      //  meioContato[] contatosMeio = new meioContato[5];
   }

    public PessoaFisica getPessoaFisica() {
        return pessoaFisica;
    }

    public void setPessoaFisica(PessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    public PessoaJuridica getPessoaJuridica() {
        return pessoaJuridica;
    }

    public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }
   
   

 public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public tipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(tipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public meioContato[] getContatosMeio() {
        return contatosMeio;
    }

    public void setContatosMeio(meioContato[] contatosMeio) {
        this.contatosMeio = contatosMeio;
    }

    public int getPosicaoLivre() {
        return posicaoLivre;
    }

    public void setPosicaoLivre(int posicaoLivre) {
        this.posicaoLivre = posicaoLivre;
    }

     public static int getQuantPessoas() {
        return quantPessoas;
    }



    public int getNumeroID() {
        return numeroID;
    }

    public void setNumeroID(int numeroID) {
        this.numeroID = numeroID;
    }



}
