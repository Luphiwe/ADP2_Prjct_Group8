/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp2_prjct_group8;

/**
 *
 * @author 27627
 */
public class SoccerPlayer {
    
    private String name;
    private String surname;
    private int jerseyNumber;
    
    public SoccerPlayer(){
    
        System.out.println("This is a default constructor");
    }
    
      public SoccerPlayer(String name, String surname, int jerseyNumber) //Creating parameterized constructor
    {
        this.name = name;
       this.surname = surname;
       this.jerseyNumber = jerseyNumber;
       
    }
      
       public String getName(String name){ //Creating public getter method for name
        
        return name;
    }
    
    public void setName(String name){ //Creating public setter method for name
        
        this.name = name;
    }
    
    
    public String getSurname(String editor){ //Creating public getter method for editor field
        
        return editor;
    }
    
     public void setSurname(String surname){ //Creating public setter method for editor field
        
        this.surname = surname;
        
    }
    
    public int getJerseyNumber(String email){ //Creating public getter method for email field
        
        return jerseyNumber;
    }
    
    public void setJerseyNumber(int jerseyNumber){ //Creating public setter method for email field
        
        this.jerseyNumber = jerseyNumber;
        
    }
    
    @Override
    public String toString(){ //Creating a toString method
        
       String str = String.format("Player Name : %S\n Player Surname : %S\n Jersey Number : %d", this.name,this.surname,this.jerseyNumber);
       
       return str;
    }
    
    public static void main(String[] args) {
        
         SoccerPlayer player [] = new SoccerPlayer [5]; //Creating an array that will hold 5 objects
         
      System.out.println("The Best Footballers in the world:");
      System.out.println("-------------------------------------------------------------");
         //Adding the 5 objects in the array
        
        player [0] = new SoccerPlayer("Lionel","Messi", 10);
        player [1] = new SoccerPlayer("Cristiano","Ronaldo", 7);
        player [2] = new SoccerPlayer("Diego","Maradona", 10);
        player [3] = new SoccerPlayer("Zinedine","Zidane", 5);
        player [4] = new SoccerPlayer("Ronaldinho","Gaucho", 10);
        
        for (int i = 0; i < player.length; i++){
        System.out.println(player[i]);
        }
    }    
      
    }
    

