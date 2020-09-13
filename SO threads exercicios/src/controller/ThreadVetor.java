package controller;

public class ThreadVetor extends Thread {
	private int[] vetor= new int [1000];
	private int op;
	private int b;
	
	public ThreadVetor(int op,int[] vetor) {
		this.op =op;
		this.vetor=vetor;
	}

	public void run() {
		if ((op%2)==0) {
			
			double tempoini = System.nanoTime();
			for(int i = 0 ; i < vetor.length; i++) {
				b=b+vetor[i];
			}
			double tempofin = System.nanoTime();
			double tempot = tempofin - tempoini;
			tempot = tempot / Math.pow(10, 9);
			System.out.println("tempo for --> " +tempot + "s." );

		}else {
			double tempoini = System.nanoTime();
			for (int i : vetor) {
				b=b+i;
			}
			double tempofin = System.nanoTime();
			double tempot = tempofin - tempoini;
			tempot = tempot / Math.pow(10, 9);
			System.out.println("tempo foreach--> " +tempot + "s." );
		}
	}
	
}
