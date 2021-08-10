package main;

public class MonitorUtil {
	private static ThreadLocal<Long> t1 = new ThreadLocal<>();
	public static void start() {
		t1.set(System.currentTimeMillis());
	}
	public static void finish(String methodName) {
		Long t2 = System.currentTimeMillis();
		System.out.println(methodName + "ºÄÊ±" + (t2 - t1.get()) + "ms");
	}
}
