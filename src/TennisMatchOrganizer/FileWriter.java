/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TennisMatchOrganizer;

import java.io.File;
import java.io.*;

/**
 *
 * @author guptas5279
 */
public class FileWriter {
    
    //Received help from this website: http://www.avajava.com/tutorials/lessons/how-do-i-write-a-string-to-a-file.html;jsessionid=10B7CF37957AFACA797F227792A17538?page=1
    
    
    
    File file;
    
    FileWriter(String fileName)
    {
        file = new File(""+fileName+".txt");
    }
    
    FileWriter fileWriter = new FileWriter(file);
    
    public void WriteInFile(String write)
    {
        fileWriter.WriteInFile(write);
        fileWriter.flush();
        fileWriter.close();
    }
    
    
}
