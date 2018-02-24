package proxy.cglib;

/**
 * Created by AdrainHuang on 2017/12/9.
 */
public class TestCGLIB {

	public static void main(String[] args) throws ClassNotFoundException {
		GuoYongZun guo = new GuoYongZun();
		GuoYongZun g = (GuoYongZun) new RealEstateAgentCGLIB().getInstance(GuoYongZun.class);
		g.setName("别墅");
		g.getMyPrefence();
	}
}
