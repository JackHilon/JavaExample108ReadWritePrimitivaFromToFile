
package javaexample108readwriteprimitivafromtofile;

import java.io.*;
import java.nio.charset.Charset;


public class Read {
    
    // https://docs.oracle.com/javase/7/docs/api/java/nio/charset/Charset.html

public static void Run(File fil) {
        
        try{
            
            FileInputStream fis = new FileInputStream(fil);
            
            BufferedInputStream bis = new BufferedInputStream(fis);
            
            DataInputStream dis = new DataInputStream(bis);
            
            String str = dis.readUTF();
            double d = dis.readDouble();
            System.out.println(str + " " + d);
                        
            
            // close
            dis.close();
            bis.close();
            fis.close();
            
            //------------------------------------------------------------------
            fis = new FileInputStream(fil);
            bis = new BufferedInputStream(fis);
            dis = new DataInputStream(bis);
            
            byte[] vector = new byte[1000];
            dis.read(vector);
            String s = new String(vector);
            String ss = new String(vector, Charset.forName("UTF-8"));
            System.out.println(s);
            System.out.println(ss);
            
            // close
            dis.close();
            bis.close();
            fis.close();
        }
        catch(IOException e)
        {
            System.out.println(e.toString());
            e.printStackTrace();
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
}
