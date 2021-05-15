
package IOFiles;

import barcos.Barco;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;

import java.io.ObjectOutputStream;
import java.util.Set;



public class MiWriter {

    public static void EscribirBinario(Set<Barco> barcos) {
        try {
            ObjectOutputStream writing=new ObjectOutputStream(new FileOutputStream("/home/ubunto/Ficheros/fichero_caracteres.txt"));
            writing.writeObject(barcos);
            writing.close();
         //   writing.writeChars(marca+modelo....);
        } catch (IOException ex) {
            System.out.println("Se ha prducido una excecion IO:"+ex);
        }
        
    }

}
