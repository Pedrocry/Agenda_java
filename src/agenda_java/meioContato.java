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
public class meioContato {
    private String descricao;
    private tipoMeioContato TipoMeioContato;

    public String getDescricao() {
        return descricao;
    }
    
    
            /*
        System.out.println("Meio de contato?: T, E ou F \n");  // Contato
        String Mcontato = entrada.nextLine();
        if("T".equals(Mcontato)){
            Mcontato=tipoMeioContato.T.tipoC;
            
        }
    */

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public tipoMeioContato getTipoMeioContato() {
        return TipoMeioContato;
    }

    public void setTipoMeioContato(tipoMeioContato TipoMeioContato) {
        this.TipoMeioContato = TipoMeioContato;
    }
}
