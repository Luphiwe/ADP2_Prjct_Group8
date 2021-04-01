/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp2_prjct_group8;

/**
 *
 * @author Blaine Simpson
 * 218020171
 */
public class Classroom {
    public String owner;
    public int room;
    
    
    public Classroom (String owner,int room){
    this.owner = owner;
    this.room = room;
    } 
  public boolean equals (Classroom C){
       
   return (C.owner.equals(owner)) && (C.room == room);
      
      
    }

// Getter
  public String getOwner() {
    return owner;
  }
  
  // Setter
  public void setOwner(String O) {
    this.owner = O;
  }

  // Getter
  public int getroom() {
    return room;
  }
  
  // Setter
  public void setroom(int r) {
    this.room = r;
  }

public static void main(String[] args) {
    
    
    Classroom classroom1 = new Classroom ("Rouhen", 1);           
    Classroom classroom2 = new Classroom ("Michelle", 2);
      
    System.out.println(classroom1 == classroom2);
    }
     
}

