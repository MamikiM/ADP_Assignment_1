/* StudentFeeAccountTest.java
 * This program demonstates test driven development (tdd)
 * Andrea Jacobs 218024266 */

package za.ac.cput.student;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentAccountTest {
    private StudentAccount stuAccount1;
    private StudentAccount stuAccount2;
    private StudentAccount stuAccount3;
    
    public StudentAccountTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() 
    {
        stuAccount1 = new StudentAccount();
        stuAccount2 = new StudentAccount();
        stuAccount3 = stuAccount1;
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testIdentity() {
        assertSame(stuAccount1, stuAccount3);
    }    
   
    /**
     * Test of getStuNumber method, of class StudentAccount.
     */
    @Test
    public void testGetStuId() {
        System.out.println("getStuId");
        String expResult = "100";
        stuAccount1.setStuNumber("100");
        String result = stuAccount1.getStuNumber();
        assertEquals(expResult, result); //The following method demonstrates Object Equailty
        }
    /**
     * Test of setStuNumber method, of class StudentAccount.
     */
    @Test
    public void testSetStuNumber() {
        System.out.println("setStuNumber");
        int stuNumber = 0;
        StudentAccount instance = new StudentAccount();
        instance.setStuNumber("stuNumber");
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStuName method, of class StudentAccount.
     */
    @Test
    public void testGetStuName() {
        System.out.println("getStuName");
        StudentAccount instance = new StudentAccount();
        String expResult = "";
        String result = instance.getStuName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStuName method, of class StudentAccount.
     */
    @Test
    public void testSetStuName() {
        System.out.println("setStuName");
        String stuName = "";
        StudentAccount instance = new StudentAccount();
        instance.setStuName(stuName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStLastName method, of class StudentAccount.
     */
    @Test
    public void testGetStLastName() {
        System.out.println("getStLastName");
        StudentAccount instance = new StudentAccount();
        String expResult = "";
        String result = instance.getStLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStLastName method, of class StudentAccount.
     */
    @Test
    public void testSetStLastName() {
        System.out.println("setStLastName");
        String stLastName = "";
        StudentAccount instance = new StudentAccount();
        instance.setStLastName(stLastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStuCourse method, of class StudentAccount.
     */
    @Test
    public void testGetStuCourse() {
        System.out.println("getStuCourse");
        StudentAccount instance = new StudentAccount();
        String expResult = "";
        String result = instance.getStuCourse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStuCourse method, of class StudentAccount.
     */
    @Test
    public void testSetStuCourse() {
        System.out.println("setStuCourse");
        String stuCourse = "";
        StudentAccount instance = new StudentAccount();
        instance.setStuCourse(stuCourse);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getYear method, of class StudentAccount.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        StudentAccount instance = new StudentAccount();
        int expResult = 0;
        int result = instance.getYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setYear method, of class StudentAccount.
     */
    @Test
    public void testSetYear() {
        System.out.println("setYear");
        int year = 0;
        StudentAccount instance = new StudentAccount();
        instance.setYear(year);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStuAccBalance method, of class StudentAccount.
     */
    @Test
    public void testGetStuAccBalance() {
        System.out.println("getStuAccBalance");
        StudentAccount instance = new StudentAccount();
        double expResult = 0.0;
        double result = instance.getStuAccBalance();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStuAccBalance method, of class StudentAccount.
     */
    @Test
    public void testSetStuAccBalance() {
        System.out.println("setStuAccBalance");
        double stuAccBalance = 0.0;
        StudentAccount instance = new StudentAccount();
        instance.setStuAccBalance(stuAccBalance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class StudentAccount.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        StudentAccount instance = new StudentAccount();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
