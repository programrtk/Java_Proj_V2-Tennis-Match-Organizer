/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TennisMatchOrganizer;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author guptas5279
 */
public class Runner{
    
    private static Team team1;
    
    private static void writeToFile()
    {
        //this creates a file and writes a list of each player's information to it
        try{
            //createFile
            PrintWriter write = new PrintWriter("PlayerList.txt");
            System.out.println("\ntest for write in and read from files");
            
            for(int i = 0; i < team1.getPlayerListLength(); i++)
            {
                write.println();
                write.println(team1.getPlayer(i));
            }
            //closefile
            write.close();
            
        }catch(IOException e){
            System.out.println("IO Exception");
        }
    }
    
    private static void readFromFile()
    {
        //this reads the contents of the file created above
        try{
            
            FileReader file = new FileReader("PlayerList.txt");
            BufferedReader read = new BufferedReader(file);
            
            while(read.readLine() != null)
            {
                System.out.println(read.readLine());
            }
            read.close();
            
        }catch(IOException e){
            System.out.println("File is not found");
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        
        team1 = new Team();
        
        //Scanner keyboard = new Scanner(System.in);
        
        
        //System.out.println("Would you like to add a player to the team? y/n");
        //String ans = keyboard.nextLine();
                //keyboard.next().charAt(0);
        
        //test
        
//-->   //this is the real test of the requirements
        
        System.out.println("test for class methods");
        team1.addPlayer("player1", "one", 'm');
        team1.addPlayer("player2", "two", 'f');
        team1.addPlayer("player3", "three", 'm');
        team1.printPlayerList();
        
        //this creates a file and writes a list of each player's information to it
        writeToFile();
        /*
        try{
            //createFile
            PrintWriter write = new PrintWriter("PlayerList.txt");
            System.out.println("\ntest for write in and read from files\n");
            for(int i = 0; i < team1.getPlayerListLength(); i++)
            {
                write.println();
                write.println(team1.getPlayer(i));
            }
            //closefile
            write.close();
            
        }catch(IOException e){
            System.out.println("IO Exception");
        }*/
        
        
        //this reads the contents of the file created above
        readFromFile();
        /*
        try{
            
            FileReader file = new FileReader("PlayerList.txt");
            BufferedReader read = new BufferedReader(file);
            
            while(read.readLine() != null)
            {
                System.out.println(read.readLine());
            }
            read.close();
            
        }catch(IOException e){
            System.out.println("File is not found");
        }*/
        
        
        
        
        //this is extra
        System.out.println("\n----------------------------------");
        System.out.println("The tests below are extra");
        team1.setMatch("player1", "player2", "Torry Pines", "5/28/2019", "5pm");
        team1.setMatch("player2", "player3", "Torry Pines", "5/29/2019", "3pm");
        team1.setMatch("player1", "player3", "Torry Pines", "5/30/2019", "8pm");
        team1.getMatchList();
        
        team1.enterMatchWinner("player1", "player2", "player1");
        team1.enterMatchWinner("player2", "player3", "player2");
        team1.enterMatchWinner("player1", "player3", "player2");
        team1.getMatchWinnerList();
        
        
        /*
        if(ans.compareTo("y") == 0)
        {
            System.out.println("Enter the first name");
            String firstName = keyboard.nextLine();
            
            System.out.println("Enter the last name");
            String lastName = keyboard.nextLine();
            
            System.out.println("Enter the gender as character m/f");
            char gender = keyboard.next().charAt(0);
            
            team1.addPlayer(lastName, firstName, gender);
            
            team1.getPlayerList();
        }
        */
        
        
    }

    
}
