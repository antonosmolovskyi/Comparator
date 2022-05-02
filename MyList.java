package classwork17;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class MyList implements List {

	int currentPosition = 0;
	
	Object[] array = new Object[3];
	
	@Override
	public boolean add(Object e) {
		if(currentPosition == array.length) {
			Object[] tempArray = new Object[array.length*2];
			System.arraycopy(array, 0, tempArray, 0, array.length);
			array = tempArray;
		}
		array[currentPosition] = e;
		currentPosition++;
		return true;
	}
	
	@Override
	public int size() {
		return currentPosition;
	}

	@Override
	public boolean remove(Object o) {
		for (int i = 0; i < currentPosition; i++) {
			if(array[i].equals(o)){
				System.arraycopy(array, i+1, array, i, currentPosition-(i+1));
				array[currentPosition] = null;
				currentPosition--;
				return true;
			}
		}
		return false;
	
	}
	
	
	
	//-------------------------------------------------------------//
	
	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public boolean contains(Object o) {
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object get(int index) {
		return array[Objects.checkIndex(index, currentPosition)];
		
	}

	@Override
	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
