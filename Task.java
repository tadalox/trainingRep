import java.io.*;
import java.util.*;
public class Task{

     public static void main(String []args) throws FileNotFoundException {
         String s;
 
    try {
      
        BufferedReader in = new BufferedReader(new FileReader( new File("INPUT.txt")));
        try {
            
                s = in.readLine();
            
        } finally {
            in.close();
        }
    } catch(IOException e) {
        throw new RuntimeException(e);
    }
 int count=0;
 int maxValue=0;
for(int i=0;i<s.length();i++){
    char c = s.charAt(i);
    if(c=='1')
    count++;
    else{
        if(count>maxValue)
        maxValue=count;
        count=0;
    }
}
File file = new File("OUTPUT.txt");
try(BufferedWriter bw = new BufferedWriter(new FileWriter(file)))
        {
          
            int text = (maxValue!=0)?maxValue:(count!=0)?count:0;
            System.out.println(text);
            bw.write(text);
            
             
           
            bw.close();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
        
    } 

}
