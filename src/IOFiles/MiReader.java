
package IOFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class MiReader {
       public static void MiReader(String cadena) {
        try {
            FileReader fr = new FileReader("/home/ubunto/Ficheros/fichero_caracteres.txt");
            BufferedReader mibuffer = new BufferedReader(fr);
            String linea="";
                    while(linea!=null){
                        linea=mibuffer.readLine();
                        System.out.println(linea);
                    }
            fr.close();
        } catch (IOException ex) {
            System.out.println("Se ha prducido una excecion IO:"+ex);
        }
        
    }

}
