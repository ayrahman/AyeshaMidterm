package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
 import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		    Queue<String> queue = new LinkedList<String>();
		    queue.add("NY");
		    queue.add("Fl");
		     queue.add("AZ");
		Iterator<String> it = new iterator();
		System.out.println(queue.peek());
		while(it.hasNext()){
			System.out.println(it.next());
		}

		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

	}

	private static class iterator implements Iterator<String> {
		@Override
		public boolean hasNext() {
			return false;
		}

		@Override
		public String next() {
			return null;
		}
	}
}
