/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp2_prjct_group8;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Ignore;
/**
 *
 * @author Gilberto_Silva_218239300
 */
public class MainTest {
     
     private Main account1;
     private Main account2;
     private Main account3;
     
    public MainTest() {
       
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @BeforeEach
    public void setUp() {
        account1 = new Main();
        account1 = new Main();
        account3 = account1;
    }

    @After
    public void tearDown() throws Exception {
    }
    
    @Test
    public void testIdentity (){
    assertSame(account1, account3);
    }
    
    @Test
    public void testEquality (){
    assertSame(account1, account3);
    }
    
    @Ignore
    @Test
    public void testFailing(){
    fail("You know Mos is gonna fail");
    }
    
    @Test
    public void testTimeOut(){
    final int factorialOf = 1 + (int) (30000 * Math.random());
    }
    
    @Ignore
    @Test
    public void testDisabling(){
    
    }
  
    @Ignore 
    @Test
     public void hello() {
     fail("Is going to fail for sure ");
     }

    /**
     * Test of getId method, of class Main.
     */
    @Ignore
    @org.junit.Test
    public void testGetId() {
        System.out.println("getId");
        Main instance = new Main();
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Main.
     */
    @Ignore
    @org.junit.Test
    public void testSetId() {
        System.out.println("setId");
        String id = "";
        Main instance = new Main();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Main.
     */
    @Ignore
    @org.junit.Test
    public void testGetName() {
        System.out.println("getName");
        Main instance = new Main();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Main.
     */
    @Ignore
    @org.junit.Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Main instance = new Main();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccountType method, of class Main.
     */
    @Ignore
    @org.junit.Test
    public void testGetAccountType() {
        System.out.println("getAccountType");
        Main instance = new Main();
        String expResult = "";
        String result = instance.getAccountType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAccountType method, of class Main.
     */
    @Ignore
    @org.junit.Test
    public void testSetAccountType() {
        System.out.println("setAccountType");
        String accountType = "";
        Main instance = new Main();
        instance.setAccountType(accountType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Main.
     */
    @Ignore
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        Main instance = new Main();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
