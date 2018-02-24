package observer;

/**
 * Created by AdrainHuang on 2017/5/26.
 */
public class Main {
	public static void main(String[] args) {
		VideoSite vs = new VideoSite();
		vs.registerObserver(new VideoFans("Lilei"));
		vs.registerObserver(new VideoFans("HanMeimei"));
		vs.registerObserver(new VideoFans("XiaoMing"));
		vs.addVideos("Video 1");

	}
}
