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
public enum tipoPessoa {
    F("FISICA"),J("JURIDICA");
    public String tipo;
    tipoPessoa(String tipo){
        this.tipo=tipo;
    }
}
