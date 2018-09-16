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
public enum tipoMeioContato {
       T("TELEFONE"),E("EMAIL"),F("FAX");
    public String tipoC;
    tipoMeioContato(String tipoC){
        this.tipoC=tipoC;
    }
}
