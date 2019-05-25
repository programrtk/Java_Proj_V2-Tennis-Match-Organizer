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
public class Score {
    
    //The user will have to enter the score in this example format: 6-2, 3-6
    private String scoreSet1;
    private String scoreSet2;
    
    private boolean tieBreaker;
    
    //Example format for tieBreakerScore from user: 10-7
    //tieBreakerScore is a win by 2, so the winner wins if he/she wins by 2 points
    private String tieBreakerScore;
    
}
