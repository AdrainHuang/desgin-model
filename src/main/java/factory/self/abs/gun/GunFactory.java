package factory.self.abs.gun;

/**
 * Created by AdrainHuang on 2018/3/5.
 */
public class GunFactory extends AbstractGunFactory {
	public Gun getM9Factroy() {
		return new M9Facotry();
	}

	public Gun getM1911Factory() {
		return new M1911Factory();
	}

	public Gun getAkFactory() {
		return new AkFactory();
	}
}
