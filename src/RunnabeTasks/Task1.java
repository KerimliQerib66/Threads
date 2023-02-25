package RunnabeTasks;

public class Task1 implements Runnable {

	@Override
	public void run() {
		StringBuffer sb=new StringBuffer();
		StringBuilder sb1=new StringBuilder();
		for(int i=0;i<30;i++) {
			sb.append(i);
			sb1.append(i);
		}

	}

}
