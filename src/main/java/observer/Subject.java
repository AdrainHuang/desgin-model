package observer;


/**
 * Created by AdrainHuang on 2017/5/26.
 */
public interface Subject {
	public void registerObserver(Observer o);

	public void removeObserver(Observer o);

	public void notifyAllObservers();
}
