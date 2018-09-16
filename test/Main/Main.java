/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Mendax
 */

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
public class Main {
    
    
    
    public static void main(String[] args) {
		String textoQueSeraEscrito = "Texto que sera escrito.";
		FileWriter arquivo;
		try {
			arquivo = new FileWriter(new File("C:\\Users\\Mendax\\Desktop","teste2.txt"));
			arquivo.write(textoQueSeraEscrito);
			arquivo.close();
		} catch (IOException e) {
		} catch (Exception e) {
		}
	}
    
    
    
    
    
    

}
