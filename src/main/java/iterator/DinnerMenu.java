package iterator;

import java.util.Iterator;

/**
 * Created by AdrainHuang on 2018/8/2.
 */
public class DinnerMenu implements Menu{
	static final int MAX_ITEMS = 3;
	int numberOfItems = 0;
	MenuItem[] menuItems;

	public DinnerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		addItem("D1",11);
		addItem("D2",12);
		addItem("D3",13);
	}

	public void addItem(String name,double price){
		MenuItem menuItem = new MenuItem(name, price);
		if(numberOfItems >= MAX_ITEMS){
			System.err.println("Sorry , menus is full! can't add item to menu");
		}else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}

	public Iterator createIterator() {
		return new DinnerMenuIterator(menuItems);
	}
}
