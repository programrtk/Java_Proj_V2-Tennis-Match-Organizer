/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TennisMatchOrganizer;

import java.util.Scanner;

/**
 *
 * @author guptas5279
 */
public class Runner {
    
    public static void main(String[] args) {
        
        Team team1 = new Team();
        
        Scanner keyboard = new Scanner(System.in);
        
        
        System.out.println("Would you like to add a player to the team? y/n");
        String ans = keyboard.nextLine();
                //keyboard.next().charAt(0);
        
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
        
        
        
    }
    
}
