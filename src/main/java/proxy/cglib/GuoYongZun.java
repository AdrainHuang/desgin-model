package proxy.cglib;

/**
 * Created by AdrainHuang on 2017/12/9.
 */
public class GuoYongZun {

	private String name;

	public void getMyPrefence(){
		System.out.println("我的兴趣是" + name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {

		return name;
	}
}
