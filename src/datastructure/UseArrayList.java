
    package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

        public class UseArrayList {

            public static void main(String[] args) {
                /*
                 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
                 * Use For Each loop and while loop with Iterator to retrieve data.
                 * Store all the sorted data into one of the databases.
                 *
                 */
                ArrayList<Integer> numberList = new ArrayList<>();
                numberList.add(100);
                numberList.add(200);
                numberList.add(300);

                //numberList.remove(2);
                //numberList.get(0);

                //iterator
                Iterator iterator = numberList.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());



                }


            }
        }



