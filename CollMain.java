package classwork17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CollMain {

	public static void main(String[] args) {
		
		List list = new MyList();
		//System.out.println(list.size());
		list.add("Hello1");
		//System.out.println(list.size());
		System.out.println(list.get(0));
		//System.out.println(list.get(1));
		list.add("Hello2");
		list.add("Hello3");
		list.add("Hello4");
		System.out.println(list.size());
		System.out.println(list.get(1));
		list.remove("Hello2");
		System.out.println(list.get(1));
		System.out.println(list.size());
		
		
		List list1 = new MyList();
		list1.add(new Dog("A", 3));
		list1.add(new Dog("B", 5));
		list1.add(new Dog("C", 1));
		list1.add(new Dog("D", 12));
		System.out.println(list1.size());
		list1.remove(new Dog("B", 5));
		System.out.println(list1.size());
		System.out.println(list1.get(1));
		System.out.println(list1);
		List<Integer> list2 = new ArrayList<>();
		list2.add(5);
		list2.add(10);
		list2.add(1);
		list2.sort(null);
		System.out.println(list2);
		
		
		List<Dog> listAgain = new ArrayList<>();
		listAgain.add(new Dog("A", 3));
		listAgain.add(new Dog("B", 5));
		listAgain.add(new Dog("C", 1));
		listAgain.add(new Dog("D", 12));
		Comparator<Dog> comparator = new DogComparator();
		listAgain.sort(comparator);
		System.out.println(listAgain);
		
		
		String s1 = "ABC";
		String s2 = new String("ABC");
		System.out.println(s1.compareTo(s2));
	}

}
