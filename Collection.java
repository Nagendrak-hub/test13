package javaPack;

import java.awt.List;
import java.util.ArrayList;

public class Collection {
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("first");
		l.add(11);
		l.add("R");
		l.add("T");
		l.add(null);
		System.out.println(l);
		System.out.println(l.size());
		l.remove(4);
		System.out.println(l);
		System.out.println(l.size());
		l.add(2,"w");
		l.add("naa");
		System.out.println(l);
		System.out.println(l.size());
		
	}

}
