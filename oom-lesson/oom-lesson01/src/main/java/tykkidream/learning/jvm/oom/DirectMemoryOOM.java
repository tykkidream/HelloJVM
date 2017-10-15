package tykkidream.learning.jvm.oom;

import java.lang.reflect.Field;

import sun.misc.Unsafe;

@SuppressWarnings("restriction")
public class DirectMemoryOOM {
	private static final int _1MB = 1024 * 1024;

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Field unsfeField = Unsafe.class.getDeclaredFields()[0];
		unsfeField.setAccessible(true);
		Unsafe unsafe = (Unsafe)unsfeField.get(null);
		while (true) {
			unsafe.allocateMemory(_1MB);
		}
	}

}
