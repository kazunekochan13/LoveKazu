/*
 *class is used to write data to all text files
 *
 */

package Love;

import java.io.*;

public class WriteFiles {
    
    File P;
    
    public WriteFiles(File path){
        P=path;
    }
    
    public void EditFiles(String text) throws IOException{
        FileWriter fw = new FileWriter(P);
        PrintWriter pt = new PrintWriter(fw);
            pt.printf("%s" + "%n", text);
        pt.close();
        
    }
}
