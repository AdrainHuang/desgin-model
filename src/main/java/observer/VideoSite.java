package observer;

import java.util.ArrayList;

/**
 * 视频网站
 * Created by AdrainHuang on 2017/5/26.
 */
public class VideoSite implements Subject {

	//观察者列表
	private ArrayList<Observer> userList;
	private ArrayList<String> videos;

	public VideoSite(){
		userList = new ArrayList<Observer>();
		videos = new ArrayList<String>();
	}

	public void registerObserver(Observer o) {
		userList.add(o);
	}

	public void removeObserver(Observer o) {
		userList.remove(o);
	}

	public void notifyAllObservers() {
		for (Observer o : userList){
			o.update(this);
		}
	}

	public void addVideos(String video){
		this.videos.add(video);
		notifyAllObservers();;
	}

	public ArrayList<String> getVideos(){
		return videos;
	}

	public String toString(){
		return videos.toString();
	}
}
