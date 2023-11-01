package Collection_Set;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet h=new HashSet();
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("Z");
		h.add(null);
		h.add(10);
		System.out.println(h);
		h.add(null);//we can not add duplicate value or only once we add null
		System.out.println(h.add("B"));
		System.out.println(h);
	}

}
