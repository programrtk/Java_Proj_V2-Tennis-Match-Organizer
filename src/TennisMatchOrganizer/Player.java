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
public class Player {
    
    private String lastName = "";
    private String firstName = "";
    private char gender = 'M';
    private String email = "";
    private double contantNum = 0;
    private int rating = 0;
    private int rank = 0;
    private String city = "";
    private int playerId = 0;
    private int teamId = 0;
    
    public Player(){
        lastName = "";
        firstName = "";
    }
    
    public Player(String lastName, String firstName, char gender){
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
    }
    
    public String toString(){
        return lastName+", "+ firstName+", "+gender+", "+rating + "; ";
    }
    
}
