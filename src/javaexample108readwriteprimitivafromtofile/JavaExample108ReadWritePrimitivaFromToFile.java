
package javaexample108readwriteprimitivafromtofile;

import java.io.File;


public class JavaExample108ReadWritePrimitivaFromToFile {

    
    public static void main(String[] args) {
        
        File fil = myHelper.CreateFileInFolder("myWorkingFolder", "myData.dat");
        
        //======================================================================
        
        Write.Run(fil);
        
        //======================================================================
        
        Read.Run(fil);
    }
    
}
