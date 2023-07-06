package in.vinayit.util;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class User {

	/*
	 * @Override public Object call() throws Exception {
	 * System.out.println(Thread.currentThread().getName()); return null; }
	 */
	/*
	 * public static void main(String[] args) { ExecutorService executorService =
	 * Executors.newFixedThreadPool(20); for(int i=1;i<=20;i++) {
	 * executorService.submit(new User()); } }
	 */

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(10);
		for(int i = 1;i<=10;i++) {
			service.submit(new Callable<Object>() {
				public Object call() throws Exception {
					System.out.println(Thread.currentThread().getName());
					return null;
				}
			});
		}
	}
}
