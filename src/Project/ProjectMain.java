
package Project;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author helvetic
 */
public class ProjectMain {

  
    public static void main(String[] args) throws IOException {
        
        String ruta = System.getProperty("user.dir");
        
        File myDirectory = new File(ruta + File.separator + "files");
        
        if(!myDirectory.exists()){
            myDirectory.mkdir();
        }
        
        File myFile = new File(ruta + File.separator + "files" + File.separator + "miArchivo.txt");
        
        if(!myFile.exists()){
            myFile.createNewFile();
        }
        
        
        FileWriter fw = new FileWriter(myFile);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("おはようう");
        bw.flush();
        bw.close();
        

    }
    
}
