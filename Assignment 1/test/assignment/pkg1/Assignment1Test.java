/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package assignment.pkg1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kuri
 */
public class Assignment1Test {
    
    public Assignment1Test() {
    }


    @Test
    public void testCreatingStudentData() {
        String[][] StudentArrays = new String[5][];
        StudentArrays[0] = new String[]{"10111"};
        StudentArrays[1] = new String[]{"J.Bloggs"};
        StudentArrays[2] = new String[]{"19"};
        StudentArrays[3] = new String[]{"Jboggs@ymail.com"};
        StudentArrays[4] = new String[]{"disd"};
        
        String[][] ExpectedStudentArrays = new String[5][];
        ExpectedStudentArrays[0] = new String[]{"10111"};
        ExpectedStudentArrays[1] = new String[]{"J.Bloggs"};
        ExpectedStudentArrays[2] = new String[]{"19"};
        ExpectedStudentArrays[3] = new String[]{"Jboggs@ymail.com"};
        ExpectedStudentArrays[4] = new String[]{"disd"};
        
        var ExpectedStudentData = new Assignment1();
        
        assertEquals(ExpectedStudentArrays, ExpectedStudentData.CreatingStudentData("10111","J.Bloggs", "19", "Jboggs@ymail.com", "disd"));
    }
    
    @Test
    public void testSearchStudentbyId() {
        String SearchStudentVal = "10111";
        String ExpectedOutputVal = "Student with Student Id: "+SearchStudentVal+" was found!";
        
        
        String[][] StudentArrays = new String[5][];
        StudentArrays[0] = new String[]{"10111","10112","10113"};
        StudentArrays[1] = new String[]{"J.Bloggs","J.Doe"};
        StudentArrays[2] = new String[]{"19","21","20"};
        StudentArrays[3] = new String[]{"Jboggs@ymail.com","jdoe@ymail.com","spidey@ymail.com"};
        StudentArrays[4] = new String[]{"disd","disd","disd"};
        
        var ExpectedStudentData = new Assignment1();
        
        assertEquals(ExpectedOutputVal, ExpectedStudentData.SearchStudentbyId(SearchStudentVal,StudentArrays));
    }
    
}
