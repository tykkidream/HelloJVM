package tykkidream.learning.jvm.oom;

import java.util.UUID;

public class JavaVMStackOOM {
	
	private void stackLeakByThread(){
		int i =0;
		while(true){
			Thread thread = new Thread(new Runnable() {
				String aa;
				@Override
				public void run() {
					while(true){
						aa = UUID.randomUUID().toString();
						System.out.println(aa);
						try {
							Thread.sleep(2000L);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			});
			
			thread.start();
			System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) {
		JavaVMStackOOM oom = new JavaVMStackOOM();
		oom.stackLeakByThread();
	}

}
