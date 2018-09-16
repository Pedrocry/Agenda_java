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
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
///
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Agenda implements ManutencaoLista{
    private int quantLivre=10;
    private int posicaoLivre=0;
    private Pessoa[] contatos;
    
    String partesString[] = new String[10];
    String inOcupado[] = new String[10];
    Exportacao exp=new Exportacao() {};
    
         public void mostrarDados() throws FileNotFoundException, IOException {   // da egenda
          String linha;
                  
        try (FileReader ar = new FileReader("data.txt")) {
            BufferedReader brc = new BufferedReader(ar);
            int i=0;
            String conteudo="";
            while ((linha = brc.readLine()) != null) {
                //  System.out.println(linha);
                
                conteudo += conteudo;
                conteudo = linha;
                partesString[i]=conteudo;
                i++;
            }       }

            //  System.err.println(partesString[0]);
              String varControl=null;
              String varControl2=null;
              boolean pessoa=false;
             for(int j=0;j<10;j++){
                   String [] nome=partesString[j].split("#",9);
                 System.out.println("ID  :"+nome[0]);
                     if (nome[0]!=null){System.out.println("POSICAO OCUPADA:  "+nome[0]);
                             inOcupado[j]=nome[0];}
                 
                 
                 System.out.println("ENDEREÇO  :"+nome[1]);
                 System.out.println("NOME  :"+nome[2]);
                 System.out.println("TIPO PESSOA  :"+nome[3]);
                    if("FISICA".equals(nome[3])){varControl="CPF: ";pessoa=true;}
                    if("JURIDICA".equals(nome[3])){varControl="CNPJ: ";pessoa=false;}
                 System.out.println(varControl+nome[4]);
                    if(pessoa){varControl2="ANO NASCIMENTMO: ";}
                    if(!pessoa){varControl2="NOME FANTASIA: ";}                    
                 System.out.println(varControl2+nome[5]);
                 System.out.println("TIPO CONTATO1:"+nome[5]+"  DESCRIÇÃO"+nome[5]);
                 System.out.println("TIPO CONTATO1:"+nome[6]+"  DESCRIÇÃO"+nome[6]);
                 System.out.println("TIPO CONTATO1:"+nome[7]+"  DESCRIÇÃO"+nome[7]);
                 
                 
                 System.out.println("\r\n***********************************************");
              
               
                              }
             

        
    }
    

    
    
    @Override
   public void adicionar(){
            Scanner entrada = new Scanner(System.in);
            Scanner entrada2 = new Scanner(System.in);
             Pessoa pessoa=new Pessoa("","") {};   //instancia Pessoa
             PessoaFisica pessoaF=new PessoaFisica("",0,"","");
           //  pessoa.setId(1);
             System.out.println("Informe seu nome:  \n");
             String nome = entrada.nextLine();
             pessoa.setNome(nome);
             
             System.out.println("Informe seu endereço : \n");
             String endereco = entrada.nextLine();
             pessoa.setEndereco(endereco);
             
             
             System.err.println("Informe o tipo de pessoa: ");
             
              System.out.println("Empresa ou pessoa?: J ou F \n");
              String tipoP = entrada.nextLine();
        // filtro para tipo de pessoa
          
            if("F".equals(tipoP)){                
               // System.out.println("Voce é uma pessoa:"+tipoPessoa.F.tipo);
               PessoaFisica pessF=new PessoaFisica("", 0, "", "");
                pessoa.setTipoPessoa(tipoPessoa.F);
                System.out.println("Ok! voce é uma pessoa: infoprtme seu CPF: ");
                String cpf = entrada.nextLine();
                pessoaF.setCpf(cpf);
                System.out.println("Ok! digite agora seu ano de nascimento : ");
                int anoNasc = entrada.nextInt();
                pessoaF.setAnoNascimento(anoNasc);
                pessoa.setPessoaFisica(pessoaF);
                
              
            } if("J".equals(tipoP)){
                PessoaJuridica pessoaJ=new PessoaJuridica("","","","");
                pessoa.setTipoPessoa(tipoPessoa.J);
                System.out.println("Ok! voce é uma empressa: infoprtme seu CNPJ: ");
                String cnpj = entrada.nextLine();
                pessoaJ.setCnpj(cnpj);
                System.out.println("Ok! digite agora seu nome fantasia : ");
                String nomeF = entrada.nextLine();
                pessoaJ.setNomeFantasia(nomeF);
                pessoa.setPessoaJuridica(pessoaJ);
            }
                
                                  
             meioContato[] contatosMeio = new meioContato[5];
             Pessoa[] contatos = new Pessoa[5];
             for(int i=0;i<3;i++){
           //  meioC.setTipoMeioContato(tipoMeioContato.T);
               meioContato meioC=new meioContato();        
                 System.out.println("Digite o primeiro tipo de contato(T,E,F)");
                  String tp = entrada2.nextLine();
                 if("T".equals(tp)){
                meioC.setTipoMeioContato(tipoMeioContato.T);
                 }
                  if("E".equals(tp)){
                meioC.setTipoMeioContato(tipoMeioContato.E);
                 }
                   if("F".equals(tp)){
                meioC.setTipoMeioContato(tipoMeioContato.F);
                 }
                 
             System.err.println("Digite a descicao do meio de  contato: ");
             String desc = entrada2.nextLine();
             meioC.setDescricao(desc);           
             // pessoa.obj
             
             contatosMeio[i]=meioC;
            // teste[i]=desc;
             pessoa.setContatosMeio(contatosMeio); /// tenho que ber isso urgente !!!
             } 

            /*
             for(int j=0;j<3;j++){
              System.err.println("Meios de contatos:  "+ contatosMeio[j].getDescricao()+"---"+contatosMeio[j].getTipoMeioContato().tipoC);
           //  pessoa.setMeioContato(meioC);
             //String nome=pessoa.getNome();
             //System.err.println(pessoa.getMeioContato().getDescricao());
             }
             
             */
               //   
             System.err.println("ID:    "+pessoa.getId());
              System.err.println("NOME:    "+pessoa.getNome()); //Classe pessoaF poderia ser acessada por get? 
              System.err.println("ENDERECO:    "+pessoa.getEndereco());
              System.err.println("TIPO PESSOA:    "+pessoa.getTipoPessoa().tipo);
              
              if (pessoa.getTipoPessoa()==tipoPessoa.F) {
             System.err.println("CPF:    "+pessoa.getPessoaFisica().getCpf());
             System.err.println("DATA NASCIMENTO:    "+pessoa.getPessoaFisica().getAnoNascimento());
                }
              if (pessoa.getTipoPessoa()==tipoPessoa.J) {
             System.err.println("CNPJ:    "+pessoa.getPessoaJuridica().getCnpj());
             System.err.println("NOME FANTASIA:    "+pessoa.getPessoaJuridica().getNomeFantasia());
                }
              
               for(int h=0;h<3;h++){
              System.err.println("CONTATOS   :"+ pessoa.contatosMeio[h].getDescricao()+"---"+pessoa.contatosMeio[h].getTipoMeioContato().tipoC);
              } 
               
               
        try {
            exp.exportar(pessoa);
        } catch (IOException ex) {
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
        }
               System.err.println(exp);
               
               
    

   }
    @Override
   public void editar(){
       
       
       
   }
   
    @Override
   public void remover(){
       
    
    
   }
    
     public void mostrarDadosContatos(int id) {   // mostrar dados pesquisados
        
    }
      public boolean contemContato(int id) {
           
        return true;
    }

}
