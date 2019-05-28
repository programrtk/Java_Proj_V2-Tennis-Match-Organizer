/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TennisMatchOrganizer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author guptas5279
 */
public class Team {
    
    private ArrayList<Player> players;
    
    
    public Team()
    {
        players = new ArrayList<Player>();
    }
    
    public void addPlayer(String lastName, String firstName, char gender)
    {
        players.add(new Player(lastName, firstName, gender));
    }
    
    public void /*ArrayList<Player>*/ getPlayerList()
    {
        //return players;
        System.out.println("\nHere are a list of players on the team: ");
        for(int i = 0; i < players.size(); i++)
        {
            System.out.println(players.get(i).toString());
        }
    }
    
}
