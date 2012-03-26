/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.util.Iterator;
import static org.junit.Assert.*;
import org.junit.*;

/**
 *
 * @author Asia
 */
public class ShapeSetTest {
    
    public ShapeSetTest() {
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
     * Test of addShape method, of class ShapeSet.
     */
    @Test
    public void testAddShape() {
        System.out.println("addShape");
        Shape shape = null;
        ShapeSet instance = new ShapeSet();
        instance.addShape(shape);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        
    }

    /**
     * Test of iterator method, of class ShapeSet.
     */
    @Test
    public void testIterator() {
        /*System.out.println("iterator");
        Set ksztalt = new HashSet();
        ShapeSet instance = new ShapeSet();
        instance.addShape(new Circle(2.0));        
        assertEquals(0,ksztalt.size());     */  //Stwierdzam bezsensownosc
        //jak przetestowac iterator - zwraca miejsce w pamieci
        ShapeSet instance = new ShapeSet();
        instance.addShape(new Circle(2.0));  
        if(instance.iterator()==instance.iterator())    //jezeli obiekt powstal
            assertTrue(true);
    }

    /**
     * Test of toString method, of class ShapeSet.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ShapeSet instance = new ShapeSet();
        Square kolko = new Square(34.6);
        instance.addShape(kolko);
        instance.iterator();
        while(instance.iterator().hasNext()){
            System.out.println(instance.toString());
        }
        System.out.println(instance.toString());
        System.out.println(instance.toString());
        //String t = instance.toString();
        assertEquals(" Square with side 34.6", instance.toString());  //Czemu nie dziala --?
                                                        //w outpucie wszystko sie pokazuje
        fail("FUNKCJA TO STRING- -_-");
    }
}
