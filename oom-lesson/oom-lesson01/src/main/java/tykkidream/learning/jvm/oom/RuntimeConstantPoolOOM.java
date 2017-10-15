package tykkidream.learning.jvm.oom;

/*import java.util.ArrayList;
import java.util.List;*/

public class RuntimeConstantPoolOOM {

	public static void main(String[] args) {
		/*
		 * JDK1.7
		 */
		String str1 = new StringBuilder("计算机").append("软件").toString();
		System.out.println(str1.intern() == str1);
		
		String str2 = new StringBuilder("ja").append("va").toString();
		System.out.println(str2.intern() == str2);
		
		String str3 = new StringBuilder("jaAsd").append("vaaaa").toString();
		System.out.println(str3.intern() == str3);
		
		String str4 = new StringBuilder("jaAsd").append("vaaaa").toString();
		System.out.println(str4.intern() == str4);
		
		/*
		 * JDK1.6
		 */
		/*List<String> list = new ArrayList<>();
		int i = 0;
		while(true){
			list.add(String.valueOf(i++).intern());
			System.out.println(i);
		}*/
	}

}
