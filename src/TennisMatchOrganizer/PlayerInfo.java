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
    public abstract class PlayerInfo {
    
    private String lastName = "";
    private String firstName = "";
    private char gender = 'm';

    public PlayerInfo(String lastName, String firstName, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public char getGender() {
        return gender;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    
    public abstract String displayPlayerInfo();
    
    public abstract boolean isMale();
    
    public abstract int age();
    
}
