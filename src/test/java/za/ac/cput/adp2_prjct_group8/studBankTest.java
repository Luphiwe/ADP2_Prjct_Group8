/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp2_prjct_group8;

import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author Luphiwe Sikupela
 * 216060133
 */
public class studBankTest {
    
    public studBankTest() {
        
        
    }
    
   private StudBank Absa;
  private StudBank Fnb;
  private StudBank Nedbank;
   
    
    @BeforeEach
    public void setUp() {
        
          Absa=new StudBank();
        Fnb=new  StudBank();
        Nedbank = Fnb ;
    
    }
    
  
    @Test
    //Object Identity
   public  void testIdentity() {
         assertSame(Nedbank, Fnb);
    }
    
   @Test
     //Object Equality
   public  void testEquality() {
         assertEquals(Nedbank, Fnb);
   }
         
  @Test
    public void testFail(){
        fail("failed");
        assertEquals(Nedbank, Fnb);

    }

    //Timeouts
    @Test 
    @Timeout        
      (value=50, unit=TimeUnit.MILLISECONDS)
    public void TestTimeout(){
    }

   

    //Disabling Tests
    @Test
    @Disabled("Disabling Tests")
    public void tempoarilyDisableTests(){
        System.out.println("It is disabled it will not ");
    }
 
}
