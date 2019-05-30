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
    private ArrayList<Match> matchList;
    private ArrayList<Match> matchWinner;
    
    public Team()
    {
        players = new ArrayList<Player>();
        matchList = new ArrayList<Match>();
        matchWinner = new ArrayList<Match>();
    }
    
    public void addPlayer(String lastName, String firstName, char gender)
    {
        players.add(new Player(lastName, firstName, gender));
    }
    
    public void setMatch(String player1FirstName, String player2FirstName, String location, String date, String time)
    {
        matchList.add(new Match(player1FirstName, player2FirstName, location, date, time));
    }
    
    //score can be implemented later
    public void enterMatchWinner(String player1FirstName, String player2FirstName, String winner)
    {
        matchWinner.add(new Match(player1FirstName, player2FirstName, winner));
    }
    
    public Player getPlayer(int i){
        return players.get(i);
    }
    
    public int getPlayerListLength()
    {
        return players.size();
    }
            
    
    public void /*ArrayList<Player>*/ getPlayerList()
    {
        //return players;
        System.out.println("\nHere is a list of players on the team: ");
        for(int i = 0; i < players.size(); i++)
        {
            System.out.println(players.get(i).toString());
        }
    }
    
    public void getMatchList()
    {
        System.out.println("\nHere is a list of matches");
        for(int i = 0; i < matchList.size(); i++)
        {
            System.out.println(matchList.get(i).toString());
        }
    }
    
    public void getMatchWinnerList()
    {
        System.out.println("\nHere is a list of winners of each match");
        for(int i = 0; i < matchWinner.size(); i++)
        {
            System.out.println(matchWinner.get(i).toStringWinner());
        }
    }
    
}
