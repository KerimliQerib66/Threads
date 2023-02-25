import RunnabeTasks.Task1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Task1 t=new Task1();
Thread t1=new Thread(t);
Thread t2=new Thread(t);
t1.start();
t2.start();
try {
	t1.join();
	t2.join();

} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
