package singleton.test;

import org.junit.Test;
import singleton.hungry.Hungry;
import singleton.lazy.LazyOne;
import singleton.lazy.LazyTwo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/**
 * Created by AdrainHuang on 2018/3/7.
 */
@SuppressWarnings("Duplicates")
public class ThreadSafeTest {

	@Test
	public  void testHungry() {
		int count = 100;
		final CountDownLatch latch = new CountDownLatch(count);

		final Set<Hungry> syncSet = Collections.synchronizedSet(new HashSet<Hungry>());
		long start = System.currentTimeMillis();
		for (int i = 0 ; i<count;i++) {
			new Thread(){
				@Override
				public void run() {
					syncSet.add(Hungry.getInstance());
				}
			}.start();
			latch.countDown();
		}

		try {
			latch.await();
			System.out.println("用时:"+(System.currentTimeMillis()-start));
			System.out.println(syncSet.size());
			for(Hungry h:syncSet){
				System.out.println(h);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 线程不安全
	 */
	@Test
	public void testLazyOne(){
		int count = 200;
		final CountDownLatch latch = new CountDownLatch(count);

		final Set<Object> syncSet = Collections.synchronizedSet(new HashSet<Object>());
		long start = System.currentTimeMillis();
		for (int i = 0 ; i<count;i++) {
			new Thread(){
				@Override
				public void run() {
					syncSet.add(LazyOne.getInstance());
				}
			}.start();
			latch.countDown();
		}

		try {
			latch.await();
			System.out.println("用时:"+(System.currentTimeMillis()-start));
			System.out.println(syncSet.size());
			for(Object h:syncSet){
				System.out.println(h);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testLazyTwo(){
		int count = 5000;
		final CountDownLatch latch = new CountDownLatch(count);

		final Set<Object> syncSet = Collections.synchronizedSet(new HashSet<Object>());
		long start = System.currentTimeMillis();
		for (int i = 0 ; i<count;i++) {
			new Thread(){
				@Override
				public void run() {
					syncSet.add(LazyTwo.getInstance());
				}
			}.start();
			latch.countDown();
		}

		try {
			latch.await();
			System.out.println("用时:"+(System.currentTimeMillis()-start));
			System.out.println(syncSet.size());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testLazyThree(){
		int count = 5000;
		final CountDownLatch latch = new CountDownLatch(count);

		final Set<Object> syncSet = Collections.synchronizedSet(new HashSet<Object>());
		long start = System.currentTimeMillis();
		for (int i = 0 ; i<count;i++) {
			new Thread(){
				@Override
				public void run() {
					syncSet.add(LazyTwo.getInstance());
				}
			}.start();
			latch.countDown();
		}

		try {
			latch.await();
			System.out.println("用时:"+(System.currentTimeMillis()-start));
			System.out.println(syncSet.size());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
