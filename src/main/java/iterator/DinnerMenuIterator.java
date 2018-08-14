package iterator;

import java.util.Iterator;

/**
 * Created by AdrainHuang on 2018/8/2.
 */
public class DinnerMenuIterator implements Iterator {
	MenuItem[] items;
	int position = 0;

	public DinnerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	public boolean hasNext() {
		if(position >= items.length || items[position] == null){
			return false;
		}else{
			return true;
		}
	}

	public Object next() {
		MenuItem menuItems = items[position];
		position = position + 1;
		return menuItems;
	}

	public void remove() {

	}
}
