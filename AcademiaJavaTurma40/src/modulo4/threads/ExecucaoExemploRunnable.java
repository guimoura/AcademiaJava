package modulo4.threads;

public class ExecucaoExemploRunnable {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Inicio do Main.");
		System.out.println("Nome thread main: " + Thread.currentThread().getName());

		ExemploRunnable er1 = new ExemploRunnable(50, '@');
		ExemploRunnable er2 = new ExemploRunnable(50, '#');
		ExemploRunnable er3 = new ExemploRunnable(50, '$');

		Thread t1 = new Thread(er1);
		Thread t2 = new Thread(er2);
		Thread t3 = new Thread(er3);
		
		t1.setName("T-1");
		t2.setName("T-2");
		t3.setName("T-3");

		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);

		t1.start();
		t2.start();
		t3.start();

		t1.join(10); //se o t1 nao terminar em 10 ms , volta para runnable
		t2.join();
		t3.join();

		for (int i = 0; i < 10; i++) {
			System.out.print("main...");
		}

		System.out.println(t1.getState());

		System.out.println("Final do Main");
	}
}
