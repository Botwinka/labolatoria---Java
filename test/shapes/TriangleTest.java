/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Asia
 */
public class TriangleTest {
    
    public TriangleTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    
    @Test
    public void testTriangle()
    {    }
    
    /**
     * Test of area method, of class Triangle.
     */
    @Test
    public void testArea() {
        System.out.println("Triangle area");
        Triangle instance = new Triangle(0.0, 0.0);            
        assertEquals(0.0, instance.area(), 0.0);        
        instance = new Triangle(1.0, 1.0);
        assertEquals(0.5, instance.area(), 0.0);
        instance = new Triangle(5.0, 2.4);
        assertEquals(6.0, instance.area(), 0.0);
        instance = new Triangle(5.5, 8.8);
        assertEquals(24.2, instance.area(), 0.0);
    }

    /**
     * Test of getBase method, of class Triangle.
     */
    @Test
    public void testGetBase() {                                                     //bez sensu robic dwa osobne testy?
        System.out.println("getBase");
        Triangle instance = new Triangle(0.0, 0.0);
        assertEquals(0.0, instance.getBase(), 0.0);
        instance = new Triangle(56.0, 456.0);
        assertEquals(56.0, instance.getBase(), 0.0);
        instance = new Triangle(35.55445, 11.1111111);
        assertEquals(35.55445, instance.getBase(), 0.0);
        
    }

    /**
     * Test of getHeight method, of class Triangle.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        Triangle instance = new Triangle(0.0, 0.0);
        assertEquals(0.0, instance.getHeight(), 0.0);
        instance = new Triangle(56.0, 456.0);
        assertEquals(456.0, instance.getHeight(), 0.0);
        instance = new Triangle(35.55445, 11.1111111);
        assertEquals(11.1111111, instance.getHeight(), 0.0);
    }

    /**
     * Test of toString method, of class Triangle.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Triangle instance = new Triangle(0.0, 0.0);
        assertEquals("Triangle with base 0.0 and height 0.0",
                "Triangle with base "
                + String.valueOf((double)instance.getBase())
                + " and height "
                + String.valueOf((double)instance.getHeight()));
        instance = new Triangle(56.0, 456.0);                     //podstawa 56 wysokosc 456
        //System.out.println(String.valueOf((double)instance.getRadius()));
        assertEquals("Triangle with base 56.0 and height 456.0",
                "Triangle with base "
                + String.valueOf((double)instance.getBase())
                + " and height "
                + String.valueOf((double)instance.getHeight()));
        instance = new Triangle(35.55445, 11.1111111);           
        assertEquals("Triangle with base 35.55445 and height 11.1111111",
                "Triangle with base "
                + String.valueOf((double)instance.getBase())
                + " and height "
                + String.valueOf((double)instance.getHeight()));
    }

    /**
     * Test of hashCode method, of class Triangle.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");             //hash = (int)(10 * hash + this.base + this.height);
        Triangle instance = new Triangle(0.0, 0.0);
        assertEquals(20.0, instance.hashCode(), 0.0);
        instance = new Triangle(56.0, 456.0); 
        assertEquals(532.0, instance.hashCode(), 0.0);
        instance = new Triangle(35.55445, 11.1111111);  
        assertEquals(66.0, instance.hashCode(), 0.0);
        
    }

    /**
     * Test of equals method, of class Triangle.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object other = null;
        assertNull("    Is other null? ", other);
        Triangle instance = new Triangle(0.0, 0.0);
        assertEquals("  other == null ",false, instance.equals(other));
        other = instance;
        assertEquals("  other == this ", true, instance.equals(other));
        other = new Triangle(2.0, 6.6); 
     //   assertEquals("  this.getClass() != other.getClass() ", false, instance.equals(other));        //czy to jest dobrze?  jezeli other jest rozny od instance to false - tak to rozumiem
     //   other = new Square(2.2); 
     //   assertEquals("  this.getClass() != other.getClass() ", true, instance.equals(other));       //czemu true????????
        Triangle otherMyClass = (Triangle) other;                                                       //??????czy moge to tu wrzucic? niewiem jak przetestowac ostatniego ifa...
        assertEquals("  otherMyClass.getRadius() != this.getRadius()", false, instance.equals(other));  
    }
}
