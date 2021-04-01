/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp2_prjct_group8;

/**
 *
 * @Brady_Sheldon_219053715
 */
public class Student {
    
    
String name;
int Age;


public static void main(String[] args) {

Student c = new Student();

c.setName("Brady");
c.setAge(23);
System.out.println(c.getName());
System.out.println(c.getAge());

c.printDetails();
}

public void setName(String name){
this.name = name;
}


public void setAge(int Age) {
this.Age =Age;
}

public String getName(){
return this.name;
}

public int getAge(){
return this.Age;
}

public void printDetails() {
System.out.println(getName() + "," + getAge());


}


}


