/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.util.*;

/**
 *
 * @author piotrkowalski
 */
public class ShapeSet {

    private Set ksztalty;
    private Iterator it;
    private List lst;
    
    
    /**
     * Konstruktor inicjalizujacy
     */
    public ShapeSet() {
        ksztalty = new HashSet();   //Korzystamy tutaj z HashSet co zabezpieczy
                                    //nasz kod przed dodaniem tego samego
                                    //obiektu/ksztaltu do zbioru(elementy 
                                    //nie moga sie powtarzac)
        lst = new ArrayList();
    }
    
    
    /**
     * Dodaj ksztalt do zbioru; zapewnij, ze zadna figura sie nie powtorzy.
     * 
     * @param shape ksztalt dodawany do zbioru
     */
    public void addShape(Shape shape) {
        ksztalty.add(shape);    
        it = ksztalty.iterator();   //ustawia nam iterator na poczatek zbioru?
    }

    /**
     * Zaimplementuj metode iterator zwracajaca iterator do zbioru elementów.
     * @return 
     */
    public Iterator iterator() {
        
        return it;
    }

    /**
     * Metoda reprezentacja tekstowa obiektu
     * 
     * @return Zwraca reprezentacje tekstowa wszystkich <br>
     * ksztaltow, zgodnie z typem do jakiego naleza.
     */
    @Override
    public String toString() {
        String tekst = new String();
        //System.out.println(it.toString() +it.hasNext());
        while(it.hasNext()){
            System.out.println("next " + it.next().toString());
        }
            
        return tekst;
    }
}
