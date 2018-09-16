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

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
  

public abstract class Exportacao {

// Pessoa pessoa=new Pessoa("","") {} ;
public boolean exportar(Pessoa pessoa) throws IOException{
     int id_ocupado=0;
    
    String pessoaT=null;
    String cpf = null;
    int dataNasc =0;
    String cnpj=null;
    String nomeFantasia=null;
    String texto=null;
    
    String TipoM[]= new String[3];
        System.out.println("teste de rotina");

        
        
        String linha;    String TipoC[]= new String[3];                 
        try (FileReader ar = new FileReader("IDS.txt") //    return "";
        ) {
            BufferedReader brc = new BufferedReader(ar);
            
            String conteudo="";
            while ((linha = brc.readLine()) != null) {
                //  System.out.println(linha);
                
               // conteudo += conteudo;
                conteudo = linha;
              id_ocupado=Integer.parseInt(conteudo);
               
            }       }
        
        System.out.println("UTIMO ID  "+id_ocupado);
        
        
       
  int id =id_ocupado+1;  //ID
  String id_string=Integer.toString(id_ocupado);
  String endereco=pessoa.getEndereco();  //Endereco
  String nome=pessoa.getNome(); // Nome
  
   if (pessoa.getTipoPessoa()==tipoPessoa.F) {
  pessoaT=pessoa.tipoPessoa.F.tipo;  // tipo de pessoa fisica
  
   cpf=pessoa.getPessoaFisica().getCpf();  // String CPF
   dataNasc=pessoa.getPessoaFisica().getAnoNascimento();  // int ano nasc
  
   }else{pessoaT=pessoa.tipoPessoa.J.tipo;
        cnpj=pessoa.getPessoaJuridica().getCnpj();
        nomeFantasia=pessoa.getPessoaJuridica().getNomeFantasia();
   }  // tipo pessoa juridica
  
  for(int i=0;i<3;i++){ 
  TipoC[i]=pessoa.contatosMeio[i].getTipoMeioContato().tipoC;  /// valores no vetor acima
  TipoM[i]=pessoa.contatosMeio[i].getDescricao();  // valores no aaray acima
  }
  
    try {
            FileWriter arq = new FileWriter("IDS.txt",true);
         try (PrintWriter gravarArq = new PrintWriter(arq)) {
             gravarArq.println(id);
         }
            
        }catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        } 
  
  
  
  
  
  
  
/*
  
  
   texto = "$"+pessoa.getId()+pessoa.getEndereco()
          +pessoa.getNome()+pessoa.tipoPessoa.tipo+"$"
          +cpf+"$"+dataNasc+"$"+cnpj+"$"+nomeFantasia+"$"+
          TipoC[0]+"-"+TipoM[0]+"$"+
          TipoC[1]+"-"+TipoM[1]+"$"+
          TipoC[2]+"-"+TipoM[2];
  
  
  */
  
if( "FISICA".equals(pessoaT)){ 
  texto =cpf+"#"+dataNasc;
}else{
     texto = cnpj+"#"+nomeFantasia;



}
  String data =id+"#"+pessoa.getEndereco()+"#"
          +pessoa.getNome()+"#"+pessoa.tipoPessoa.tipo+"#"+          
          texto+"#"+          
          TipoC[0]+"-"+TipoM[0]+"#"+
          TipoC[1]+"-"+TipoM[1]+"#"+
          TipoC[2]+"-"+TipoM[2]+"%";
          
         
  String url = "data.txt";
        try {
            FileWriter arq = new FileWriter(url,true);
         try (PrintWriter gravarArq = new PrintWriter(arq)) {
             gravarArq.println(data);
         }
            return true;
        }catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }
        
        
          
    
 
}   


  
   
	

}
   
   
   

