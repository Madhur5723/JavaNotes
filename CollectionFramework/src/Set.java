import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		//2-Set
		//HashSet-display unorderList
		HashSet<Integer> hset=new HashSet<Integer>();
		hset.add(10);
		hset.add(5);
		hset.add(16);
		hset.add(2);
		hset.add(2);//Only display unique value same value will be display once
		System.out.println("HashSet="+hset+"\n");
		///////////////////////////////////////////////////////////////////////////////////
		
		//LinkedHashSet-display is orderList
		LinkedHashSet<Integer> lhset=new LinkedHashSet<Integer>();
		lhset.add(5); 
		lhset.add(2); 
		lhset.add(2); 
		lhset.add(10);//takes unique value only 
		System.out.println("LinkedHashSet"+lhset+"\n");
		/////////////////////////////////////////////////////////////////
		
		//TreeSet-Display in sortedWay and Unique Value
		TreeSet<Integer> tset=new TreeSet<Integer>();
		tset.add(20);
		tset.add(5);
		tset.add(10);
		tset.add(6);
		tset.add(20);
		System.out.println("TreeSet="+tset+"\n");
	 }
}
