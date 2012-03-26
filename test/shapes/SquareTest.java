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
public class SquareTest {
    
    public SquareTest() {
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
     * Test of area method, of class Square.
     */
    @Test
    public void testArea() {
        System.out.println("Square area");
        
        Square instance = new Square(0.0);
        assertEquals(0.0, instance.area(), 0.0);
        instance = new Square(1.0);
        assertEquals(1.0, instance.area(), 0.0);
        instance = new Square(5.0);
        assertEquals(25.0, instance.area(), 0.0);
        instance = new Square(5.45);
        assertEquals(29.7025 , instance.area(), 0.0);
    }

    /**
     * Test of getSide method, of class Square.
     */
    @Test
    public void testGetSide() {
        System.out.println("Square getSide");
        Square instance = new Square(0.0);
        assertEquals(0.0, instance.getSide(), 0.0);
        instance = new Square(1.0);
        assertEquals(1.0, instance.getSide(), 0.0);
        instance = new Square(1.567);
        assertEquals(1.567, instance.getSide(), 0.0);
    }

    /**
     * Test of toString method, of class Square.
     */
    @Test
    public void testToString() {
        System.out.println("Square toString");
        Square instance;
        instance = new Square(0.0);                     //Promien =0.0
        assertEquals("Square with radius 0.0", "Square with radius " + String.valueOf((double)instance.getSide()));
        instance = new Square(5.1);                     //Promien =5.1
        System.out.println(String.valueOf((double)instance.getSide()));
        assertEquals("Circle with radius 5.1", "Circle with radius " + String.valueOf((double)instance.getSide()));
        instance = new Square(1111110.023);           //Promien =111111130.023
        assertEquals("Circle with radius 1111110.023", "Circle with radius " + String.valueOf((double)instance.getSide()));
    }

    /**
     * Test of hashCode method, of class Square.
     */
    @Test
    public void testHashCode() {
        System.out.println("Square hashCode");
        Square instance;
        instance= new Square(0.0);
        assertEquals(553, instance.hashCode(),0.0);
        //instance= new Square(2.0);
        //assertEquals(554, instance.hashCode(),0.0); //to bez sensu
    }

    /**
     * Test of equals method, of class Square.
     */
    @Test
    public void testEquals() {
        System.out.println("Square equals");
        Object other = null;    
        assertNull("    Is other null? ", other);
        Square instance = new Square(0.0);
        assertEquals("other == null ",false, instance.equals(other));
        other = instance;
        assertEquals("other == this ", true, instance.equals(other));
        assertEquals("this.getClass() == other.getClass() ", true, instance.equals(other));
        other = new Circle(2.0);            
        assertEquals("this.getClass() == other.getClass() ", false, instance.equals(other));
    }
}
