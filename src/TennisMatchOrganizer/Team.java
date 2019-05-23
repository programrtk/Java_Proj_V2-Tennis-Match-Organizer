/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TennisMatchOrganizer;

import java.util.ArrayList;

/**
 *
 * @author guptas5279
 */
public class Team {
    
    private ArrayList<Player> players;
    
    
    public Team(){
        players = new ArrayList<Player>();
    }
    
    public void addPlayer(String lastName, String firstName, char gender)
    {
        players.add(new Player(lastName, firstName, gender));
    }
    
    
    
}
