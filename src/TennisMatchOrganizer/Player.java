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
public class Player extends PlayerInfo implements Comparable<Player>{
    
    private String lastName = "";
    private String firstName = "";
    private char gender = 'M';
    private int wins = 0;
    
    /*
    private String email = "";
    private double contantNum = 0;
    private int rating = 0;
    private int rank = 0;
    private String city = "";
    private int playerId = 0;
    private int teamId = 0;
    */
    
    public Player(){
        super("one", "player1", 'm');
    }
    
    public Player(String lastName, String firstName, char gender){
        super(lastName, firstName, gender);
    }
    
    public String toString(){
        return getLastName()+" "+ getFirstName()+" "+getGender();
    }
    
    public String displayPlayerInfo() {
        return getLastName()+" "+ getFirstName()+" "+getGender();
    }
    
    public boolean isMale() {
        if(getGender() == 'm'){
            return true;
        }
        return false;
    }
    
    public boolean isFemale(){
        if(getGender() == 'f'){
            return true;
        }
        return false;
    }
    
    
    //isaac did this
    public void setWins(int w) {
    	wins = w;
    }
    
    public int getWins() {
    	return wins;
    }

    @Override
    public int age() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    //isaac did this
	@Override
	public int compareTo(Player o) {
		if(getWins() < o.getWins()) return 1;
		else if(getWins() > o.getWins()) return -1;
		else return toString().compareTo(o.toString());
	}
    
}
