package tatiscs.test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by AdrainHuang on 2018/1/11.
 */
public class Container {

	private Map<String,Animal> map = new ConcurrentHashMap<String, Animal>();

	private Cat cat;
	private Dog dog;

	public Container(Cat cat, Dog dog) {
		this.cat = cat;
		this.dog = dog;
	}

	public <T extends Animal>T init(){
		map.put("1",cat);
		Animal animal = map.get("1");
		if(animal instanceof Cat ){

		}
		return (T)animal;
	}
}
