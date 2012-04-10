/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author piotrkowalski
 */
public class Shapes {
    
    ArrayList lst;
    Iterator it;
    Scanner s;
    String l;
    static ShapeSet shp;
   // PrintWriter outputStream;
    
    public Shapes() {
        lst = new ArrayList();
        s = null;
        shp  = new ShapeSet();
        
    }

    /**
     * Znajdź figury o największym polu w zbiorze ShapeSet
     * 
     * @param shapes zbiór figór
     * @return Zwraca listę zawierającą obiekty o największym polu.
     */
    public ArrayList findLargest(ShapeSet shapes) {
        double max = 0.0;
        Shape dsa;      //pomocniczy
        
        it = shapes.iterator();     //ustawiamy iterator przed 1 elementem shapesetu
        
        
        while(it.hasNext()){
            dsa = (Shape) it.next();
            if(dsa.area() > max)            //*//Jezeli nastepny element ma pole wieksze od max to
            {                       
                max = dsa.area();           //Przypisz wieksze pole do max
                lst.removeAll(lst);         //usun cala zawartosc listy(wybieramy tylko najwieksze pole)
                lst.add(dsa);               //dodaj nowy element do listy
                
            }
            else if(dsa.area() == max)      //*//Jezeli nastepny element ma pole równe od max to
            {
                lst.add(dsa);               //dodaj ten element do listy
            }
            
        }
        for(int i=0; i<lst.size(); i++)
        {
            dsa = (Shape) lst.get(i);       
            System.out.println(i+ " element - " +lst.get(i) + " - Pole: " + dsa.area());
        }
        return lst;
    }

    /**
     * Wczytaj figury z pliku o nazwie fileName do nowo utworzonego zbioru ShapeSet.
     * 
     * @param fileName nazwa pliku
     * @return zbiór figór ShapeSet.
     */
    public ShapeSet readShapesFromFile(String fileName) throws IOException{
        
        try
        {
            //inputStream = new BufferedReader(new FileReader(fileName));
            
            s = new Scanner(new BufferedReader(new FileReader(fileName)));
            //outputStream = new PrintWriter(new FileWriter("5token.txt"));
            s.useDelimiter(",|\n");
            s.useLocale(Locale.US);
//            while(s.hasNext())
//            {
//                System.out.println(s.next());
//            }
            while(s.hasNext())                              //**Jezeli jest jakikolwiek nastepny element
            {
                String poms = s.next();
               //**/System.out.println("\t\t\t" +poms);
                
                //Kolo
                if(poms.equals("circle"))               //i ten element jest circle
                {
                    /**/System.out.println("next?? " + s.hasNext() );
                    
                    if(s.hasNext())
                    {
                        /**/System.out.println("\tkolko is double next? " + s.hasNextDouble() );
                        if(s.hasNextDouble())                   //sprawdz czy nastepny element jest i czy jest double
                        {
                            double pom1 = s.nextDouble();       //jezeli tak to przypisz zmiennej pomocniczej go
                            /**/System.out.println("\tdouble " + pom1);
                            shp.addShape(new Circle(pom1));     //add shape
                        }
                        else                                //w przeciwnym przypadku
                        {
                            if(s.hasNext())
                            {
                                poms = s.next();    //przejdz do nastepnego elementu
                                System.out.println("  nxt" + poms);
                            }
                        }
                    }
                }
                else
                {
                    System.out.println(" nie kolko! next!");
                }
                
                
                //Kwadrat
                if(s.hasNext())
                {
                    /**/System.out.println("next? " + s.hasNext());
                    if(poms.equals("square"))       
                    {
                        /**/System.out.println("\tkwadrat is double next?" + s.hasNextDouble() );
                        if(s.hasNextDouble())
                        {
                            double pom1 = s.nextDouble();
                            /**/System.out.println("\tdouble " + pom1);
                            shp.addShape(new Square(pom1));
                        }
                        else
                        {
                            s.next();
                        }
                    }
                    else
                    {
                        System.out.println("  but it is not square:)");
                    }
                }
                
                //Trojkat
                if(s.hasNext())
                {
                    /**/System.out.println("next? " + s.hasNext());
                    if(poms.equals("triangle"))
                    {
                        double pom1, pom2;
                        System.out.println("trojkat");
                        
                        /**/System.out.println("\ttrojkat is double next?" + s.hasNextDouble() );
                        if(s.hasNextDouble())
                        {
                            pom1 = Double.parseDouble(s.next());        //
                            /**/System.out.println("\tdouble " + pom1);

                            if(s.hasNextDouble())
                            {
                                pom2 = Double.parseDouble(s.next());
                                /**/System.out.println("\tdouble " + pom2);
                                shp.addShape(new Triangle(pom1, pom2));
                            }
                            else
                            {
                                s.next();
                            }
                        }
                        else
                        {
                           s.next();
                        }

                    }
                    else
                    {
                        System.out.println(" But its not triangle:)");
                    }
                    /**/System.out.println("next? " + s.hasNext());
                }
            }
            
            /*
            Shape dsa;      //pomocniczy
        
            it = shp.iterator();     //ustawiamy iterator przed 1 elementem shapesetu

            while(it.hasNext()){
                dsa = (Shape) it.next();
                lst.add(dsa);               //dodaj ten element do listy
            }
            for(int i=0; i<lst.size(); i++)
            {
                dsa = (Shape) lst.get(i);       
                System.out.println(i+ " element - " +lst.get(i) + " - Pole: " + dsa.area());
            }*/
            
            /*
            while(s.hasNext())
            {
                System.out.println(s.next());
            }*/
        }
        finally
        {
            if(s!=null)
            {
                s.close();
            }
            /*
            if(inputStream != null)
            {
                inputStream.close();
            }*/
            /*
            if(outputStream != null)
            {
                outputStream.close();
            }*///
            
        }
        
        return null;
    }

    public static void main(String[] args) throws IOException {
        Shapes program = new Shapes();
        program.readShapesFromFile("shapes.txt");
        program.findLargest(shp);
    }
}
