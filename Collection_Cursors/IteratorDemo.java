package Collection_Cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l =new ArrayList();
		for(int i=0;i<=10;i++) {
			l.add(i);
		}
		System.out.println(l);
		Iterator itr=l.iterator();
		while(itr.hasNext()) {
			Integer Int=(Integer)itr.next();
			if(Int%2==0) {
				System.out.print(Int+" ");
			}else
			{
				itr.remove();
			}
		}
		System.out.println();
		System.out.println(l);

	}

}
