package absFactory;

/**
 * Created by AdrainHuang on 2017/5/25.
 */
interface KitchFactory{
	public Food getFood();
	public TableWare getTableWare();

	/**
	 * Created by AdrainHuang on 2017/5/25.
	 */
	interface TableWare{
		public String getToolName();
	}

	/**
	 * Created by AdrainHuang on 2017/5/25.
	 */
	interface Food {
		public String getFoodName();
	}
}
