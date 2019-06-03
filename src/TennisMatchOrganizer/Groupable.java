/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TennisMatchOrganizer;

/**
 *
 * @author Sumit
 */
public interface Groupable {
    
    public void addPlayer(String lastName, String firstName, char gender);
    
    public void printPlayerList();
    
    public int getPlayerListLength();
    
}
