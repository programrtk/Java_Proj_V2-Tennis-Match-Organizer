/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TennisMatchOrganizer;

/**
 *
 * @author guptas5279
 */
public class Match {
    
    private int player1Id;
    private int player2Id;
    private String location;
    
    private String player1FirstName;
    private String player2FirstName;
    public String winner;
    
    //String variables of date and time will be converted to integer when needed.
    private String date;
    private String time;
    private int winnerId;
    
    public Match(String player1FirstName, String player2FirstName, String location, String date, String time)
    {
        this.player1FirstName = player1FirstName;
        this.player2FirstName = player2FirstName;
        this.location = location;
        this.date = date;
        this.time = time;
    }
    
    public Match(String player1FirstName, String player2FirstName, String winner)
    {
        this.player1FirstName = player1FirstName;
        this.player2FirstName = player2FirstName;
        this.winner = winner;
    }
    
    public String toStringMatches()
    {
        return player1FirstName +" vs. "+ player2FirstName +"; at location: "+location +", date: "+date+", time: "+time;
    }
    
    public String toStringWinner()
    {
        return player1FirstName +" vs. "+ player2FirstName+"; The winner is: "+winner;
    }
           
    
}
