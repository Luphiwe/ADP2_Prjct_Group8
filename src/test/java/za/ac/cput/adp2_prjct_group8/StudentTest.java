/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp2_prjct_group8;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @Brady_Sheldon_219053715
 */
public class StudentTest {
    
    
    
        private Student student1;
        private Student student2;
        private Student student3;
    
    
    @BeforeEach
    public void setUp() {
        student1 = new Student();
        student2 = new Student();
        student3 = student1; 
    } 
    
    @Test
    public void testIdentity () {
            assertSame(student1, student3);
    }
    
    //equality
    @Test
    public void testEquality () {
            assertEquals(student1, student3);
    
    }
    //Failing
    @Test
    public void testFail(){
        fail("failure");
        assertEquals(student1, student3);
        
    }
    
    //timeout
    @Test
    @Timeout (value=200, unit=TimeUnit.MILLISECONDS)
    public void TestTimeout(){
        
    }    
        
    //Disable
    @Test
    @Disabled("Disabling")
    public void testDisable(){
        System.out.println("Will not run");
    }
       
    }
