/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package server;
 
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Rickson
 */
public class Reader 
{
public static String initialRead() throws FileNotFoundException {
     //Z means: "The end of the input but for the final terminator, if any"
    String temp;    
    String output = new Scanner(new File("file.txt")).useDelimiter("\\Z").next();
        temp="" + output;
    return temp;
    }
    
    
 public void readAll() throws FileNotFoundException
    {
        String temp;
        temp = initialRead();
        System.out.println(temp);
    }

 public void bacaHari( String hari) throws FileNotFoundException
    {
        String temp;
        int i;
        temp = initialRead();
        String perBaris [] = temp.split("\n");
        System.out.println(perBaris[0]);
        for(i=0;i<perBaris.length;i++)
        {
            if(perBaris[i].indexOf(hari) != -1)
            {
                System.out.println(perBaris[i]);
            }
        }
    }


    
    
}
