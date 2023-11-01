package Collection_List;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		System.out.println(v.capacity());
		for(int i=1;i<=10;i++) {
			v.add(i);
		}
		System.out.println(v);
		System.out.println(v.capacity());
		v.add(v.add(11));
		System.out.println(v.capacity());
		System.out.println(v);
	}

}
