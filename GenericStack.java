package simeon;

import java.util.ArrayList;

public class GenericStack<E> extends ArrayList<E>{                              
	private java.util.ArrayList <E> list = new java.util.ArrayList<>();

	
		public E peek() {
			return get(size()-1);          
		}
		
	
		public void push(E o) {
			add(o);                    
		}
		
	
		public E pop() {
			E o = get(size()-1);
			remove(size()-1);
			return o;                    
		}
		

	@Override
		public String toString() {
			return "stack: " + super.toString();
		}
}
