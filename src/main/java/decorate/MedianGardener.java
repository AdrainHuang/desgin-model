package decorate;

/**
 * Created by AdrainHuang on 2018/3/20.
 */
public class MedianGardener implements Gardener {
	private Gardener gardener;

	public MedianGardener(Gardener gardener) {
		this.gardener = gardener;
	}

	public void clip() {
		gardener.clip();
		System.out.println("中等加工");
	}
}
