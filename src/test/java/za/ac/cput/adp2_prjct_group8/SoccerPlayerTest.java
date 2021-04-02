/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp2_prjct_group8;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Mongameli Shasha - 219181527
 */
public class SoccerPlayerTest {
    
   private SoccerPlayer player1;
   private SoccerPlayer player2;
   private SoccerPlayer player3;   
   

    
    @Before
    public void setUp() {
        player1 = new SoccerPlayer();
        player2 = new SoccerPlayer();
        player3 = player1;
        
    }
    
   @Test
   public void testIdentity(){
    assertSame(player3, player1);
   }
   
   @Test
   public void testEquality(){
    assertEquals(player3, player1);
   }
   
   

    /**
     * Test of getName method, of class SoccerPlayer.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String name = "";
        SoccerPlayer instance = new SoccerPlayer();
        String expResult = "";
        String result = instance.getName(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class SoccerPlayer.
     */
    @Test
    @Ignore
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        SoccerPlayer instance = new SoccerPlayer();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSurname method, of class SoccerPlayer.
     */
    @Test
    @Ignore
    public void testGetSurname() {
        System.out.println("getSurname");
        String editor = "";
        SoccerPlayer instance = new SoccerPlayer();
        String expResult = "";
        String result = instance.getSurname(editor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSurname method, of class SoccerPlayer.
     */
    @Test
    @Ignore
    public void testSetSurname() {
        System.out.println("setSurname");
        String surname = "";
        SoccerPlayer instance = new SoccerPlayer();
        instance.setSurname(surname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJerseyNumber method, of class SoccerPlayer.
     */
    @Test
    @Ignore
    public void testGetJerseyNumber() {
        System.out.println("getJerseyNumber");
        String email = "";
        SoccerPlayer instance = new SoccerPlayer();
        int expResult = 0;
        int result = instance.getJerseyNumber(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJerseyNumber method, of class SoccerPlayer.
     */
    @Test
    @Ignore
    public void testSetJerseyNumber() {
        System.out.println("setJerseyNumber");
        int jerseyNumber = 0;
        SoccerPlayer instance = new SoccerPlayer();
        instance.setJerseyNumber(jerseyNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class SoccerPlayer.
     */
    @Test
    @Ignore
    public void testToString() {
        System.out.println("toString");
        SoccerPlayer instance = new SoccerPlayer();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class SoccerPlayer.
     */
    @Test
    @Ignore
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SoccerPlayer.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
