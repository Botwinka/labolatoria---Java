/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author szczepj0
 */
public class CircleTest {
    
    public CircleTest() {
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

    /**
     * Test of area method, of class Circle.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        
        Circle instance;
        instance = new Circle(0.0);                     //Promien=0
        assertEquals(0.0, instance.area(), 0.0);        //pi*r^2 = 3.14*0^2= 0.0
        //instance = new Circle(1.0);                     //Promien=0 
        //assertEquals(3.14159265, instance.area(), 0.0);        //pi*r^2 = 3.14*0^2= 0.0 jak przetestowac doubla?
    }

    /**
     * Test of getRadius method, of class Circle.
     */
    @Test
    public void testGetRadius() {
        System.out.println("getRadius: ");
        Circle instance ;
        instance = new Circle(0.0);                     //Promien =0
        assertEquals(0.0, instance.getRadius(), 0.0);        //r=0.0
        instance = new Circle(1.0);                     //Promien =1
        assertEquals(1.0, instance.getRadius(), 0.0);        //r=1.0
        instance = new Circle(1.5);                     //Promien =1
        assertEquals(1.0, instance.getRadius(), 0.0);        //r=1.0
  
    }

    /**
     * Test of toString method, of class Circle.
     */
    @Test
    public void testToString() {
        System.out.println("toString: ");
        Circle instance;
        instance = new Circle(0.0);                     //Promien =0.0
        assertEquals("Circle with radius 0.0", "Circle with radius " + String.valueOf((double)instance.getRadius()));
        instance = new Circle(5.1);                     //Promien =5.1
        System.out.println(String.valueOf((double)instance.getRadius()));
        assertEquals("Circle with radius 5.0", "Circle with radius " + String.valueOf((double)instance.getRadius()));
        instance = new Circle(1111110.023);           //Promien =111111130.023
        assertEquals("Circle with radius 1111110.0", "Circle with radius " + String.valueOf((double)instance.getRadius()));
        
    }

    /**
     * Test of hashCode method, of class Circle.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Circle instance = null;
        instance = new Circle(0.0);
        assertEquals(85.0, instance.hashCode(), 0.0);
        instance = new Circle(1.0);
        assertEquals(86.0, instance.hashCode(), 0.0);
        instance = new Circle(3.0);
        assertEquals(88.0, instance.hashCode(), 0.0);
    }

    /**
     * Test of equals method, of class Circle.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object other = null;
        assertNull("    Is other null? ", other);
        Circle instance = new Circle(0.0);
        assertEquals("  other == null ",false, instance.equals(other));
        other = instance;
        assertEquals("  other == this ", true, instance.equals(other));
        other = new Circle(2.0); 
        assertEquals("  this.getClass() != other.getClass() ", false, instance.equals(other));        //czy to jest dobrze?  jezeli other jest rozny od instance to false - tak to rozumiem
     //   other = new Square(2.2); 
     //   assertEquals("  this.getClass() != other.getClass() ", true, instance.equals(other));       //czemu true????????
        Circle otherMyClass = (Circle) other;                                                       //??????czy moge to tu wrzucic? niewiem jak przetestowac ostatniego ifa...
        assertEquals("  otherMyClass.getRadius() != this.getRadius()", false, instance.equals(other));  
        
    }
}
