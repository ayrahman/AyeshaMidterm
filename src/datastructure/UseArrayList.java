package datastructure;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {

		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

        ArrayList<Object> arrayList = new ArrayList<>();

        arrayList.add("Egg");
        arrayList.add(1, "Cheese");
        arrayList.add("Begle");
        arrayList.add("Topping");

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(arrayList.size() - 1));
        arrayList.remove("Topping");
        System.out.println(arrayList.get(arrayList.size() - 1));

        System.out.println();

        for (Object s : arrayList) {
            System.out.println(s);

        }
        System.out.println();

        Iterator it = arrayList.iterator();
        while (it.hasNext())
            System.out.println(it.next());
            }
	    }
