package modulo4.threads;

public class ExemploThread extends Thread {

	private int repeticoes;
	private char caracter;

	public ExemploThread(int repeticoes, char caracter) {
		super();
		this.repeticoes = repeticoes;
		this.caracter = caracter;
	}

	@Override
	public void run() {

		for (int i = 1; i < repeticoes; i++) {
			/*try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			System.out.print(caracter); //Thread.currentThread().getName() + " : " + 
		}
	}

	public int getRepeticoes() {
		return repeticoes;
	}

	public void setRepeticoes(int repeticoes) {
		this.repeticoes = repeticoes;
	}

	public char getCaracter() {
		return caracter;
	}

	public void setCaracter(char caracter) {
		this.caracter = caracter;
	}

}
