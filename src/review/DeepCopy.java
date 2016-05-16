/**
 * CS2852
 * Spring 2016
 * Week 10
 */
package review;

import java.util.ArrayList;
import java.util.List;

/**
 * Exercises for the Deep Copy Tutorial
 *
 * 1.) Read: http://msoe.us/taylor/tutorial/cs2852/clone
 * 2.) Review the code: https://github.com/bcdennis/cs2852/blob/master/src/review/DeepCopy.java
 * 3.) Answer questions at : http://goo.gl/forms/LXLn8fkdhs
 * 4.) Do exercises
 * 5.) Uncomment out the prints
 * 6.) Answer again: http://goo.gl/forms/LXLn8fkdhs
 *
 * @author Brad Dennis, Ph.D.
 * @version 1.0
 */
public class DeepCopy {

    List<Widget> widgetsList;



    public DeepCopy() {
        widgetsList = new ArrayList<>();
    }



    public static void main(String[] args) throws Exception {
        DeepCopy tutorial = new DeepCopy();
        tutorial.go();
    }

    private void go() throws Exception {

        Widget widgetA = new Widget("Alpha", 1);
        Widget widgetB = new Widget("Beta", 1);

        System.out.println("Does A == B?");
        //System.out.println((widgetA == widgetB?"Yes":"No"));

        System.out.println("Does A .equals B?");
        //System.out.println((widgetA.equals(widgetB)?"Yes":"No"));

        Widget widgetC = widgetA;
        System.out.println("Does A == C?");
        //System.out.println((widgetA == widgetC?"Yes":"No"));

        System.out.println("Does A .equals C?");
        //System.out.println((widgetA.equals(widgetC)?"Yes":"No"));

        Widget widgetD = new Widget(widgetA.name, widgetA.version);
        System.out.println("Does A == D?");
        //System.out.println((widgetA == widgetD?"Yes":"No"));

        System.out.println("Does A .equals D?");
        //System.out.println((widgetA.equals(widgetD)?"Yes":"No"));


        Widget widgetF = new Widget(widgetA);
        System.out.println("Does A == F?");
        //System.out.println((widgetA == widgetF?"Yes":"No"));

        System.out.println("Does A .equals F?");
        //System.out.println((widgetA.equals(widgetF)?"Yes":"No"));

        Widget widgetG = (Widget) widgetA.clone();
        System.out.println("Does A == G?");
        //System.out.println((widgetA == widgetG?"Yes":"No"));

        System.out.println("Does A .equals G?");
        //System.out.println((widgetA.equals(widgetG)?"Yes":"No"));

    }

    private static class Widget implements Cloneable {
        private String name;
        private int version;

        private Widget(String name, int version) {
            this.name = name;
            this.version = version;
        }

        private Widget(Widget source) {
            //TODO implement a copy constructor

        }

        @Override
        protected Widget clone() throws CloneNotSupportedException  {
            // TODO implement the cloneable interface
            return (Widget)super.clone();
        }
    }
}
