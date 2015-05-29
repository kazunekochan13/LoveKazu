/*
 * Class is used to read data from all text files
 *
 */

package Love;

import java.io.*;

public class ReadFiles {
    
     File P;
    
    public ReadFiles(File path){
        P=path;
    }
  
    public String ReadQues() throws IOException{
        FileReader fr = new FileReader(P);
        BufferedReader br = new BufferedReader(fr);
        
        String questions;
        
        questions=br.readLine();
        
        return questions;
    }
}
