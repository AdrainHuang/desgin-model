package iterator;

import java.util.Iterator;

/**
 * Created by AdrainHuang on 2018/8/2.
 */
public class Waitress {
	Menu pancakteHouseMenu;
	Menu dinerMenu;

	public Waitress(Menu pancakteHouseMenu, Menu dinerMenu) {
		this.pancakteHouseMenu = pancakteHouseMenu;
		this.dinerMenu = dinerMenu;
	}

	public void printMenu(){
		Iterator pancakteIterator = pancakteHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();
		System.out.println("MENU\n ----\nBREAKFAST");
		printMenu(pancakteIterator);
		System.out.println("\nlunch");
		printMenu(dinerIterator);
	}

	private void printMenu(Iterator iterator) {
		while(iterator.hasNext()){
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.println(menuItem.getName() + ",");
			System.out.println(menuItem.getPrice());
		}
	}


}
