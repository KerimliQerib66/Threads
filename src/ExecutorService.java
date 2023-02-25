import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorService {

	public static void main(String[] args) {
java.util.concurrent.ExecutorService executor=Executors.newSingleThreadExecutor();
executor.submit(new Runnable() {

	@Override
	public void run() {
		for(int i=0;i<20;i++) {
		System.out.println("salam"+i);
	}
	}
});
executor.submit(new Runnable() {

	@Override
	public void run() {
		for(int i=20;i<40;i++) {
System.out.println("salam"+i);
	}
	}
});
executor.submit(new Runnable() {

	@Override
	public void run() {
		for(int i=40;i<60;i++) {
System.out.println("salam"+i);
	}
	}
});
executor.shutdown();
try {
	if(!executor.awaitTermination(1, TimeUnit.NANOSECONDS)) {
		executor.shutdownNow();
	}
}
catch(InterruptedException e) {
	//executor.shutdownNow();
	//Thread.currentThread().interrupt();
}
	}

}
