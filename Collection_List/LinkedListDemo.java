package Collection_List;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("Durga");
		l.add(30);
		l.add(null);l.add("Durga");
		System.out.println(l);
		l.add(0,"Software");
		l.add(0,"vaibhav");
		l.removeLast();
		l.addFirst("wankhede");
		System.out.println(l);
	}

}
