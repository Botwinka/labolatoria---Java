/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author Asia
 */
public class Triangle implements Shape{
    
    private double height;   //wysokosc
    private double base;   //podstawa
    
    Triangle(double a, double h)
    {
        this.base = a;
        this.height = h;
    }
    
    @Override
    public double area() {
        //java.text.DecimalFormat = new java.text.DecimalFormat("###.#######");
        double pole = base*height/2;
        int calko= (int)(pole*10000);
        return (double)calko/10000;
    }
    
    public double getBase() {
        return base;            //zwraca podstawe
    }
    
    public double getHeight() {     //zwraa wysokosc
        return height;
    }
    
    
    @Override
    public String toString() {
        return "Triangle with base: " + base + " and height: " + height;
    }
    
    @Override
    public int hashCode() {
        int hash = 2;
        hash = (int)(10 * hash + this.base + this.height);
        return hash;
    }
    
     @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (other == this) {
            return true;
        }
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Triangle otherMyClass = (Triangle) other;
        if (otherMyClass.getBase() != this.getBase()) {
            return false;
        }
        return true;
     }
}
