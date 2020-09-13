package main;

import javax.swing.JOptionPane;

import controller.ThreadVetor;

public class Principal {
	public static void main(String[] args) {
		int op=0;
		int[] vetor= new int [1000];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i]=(int) (Math.random()*101);
		}
		while (op!=9){	
			op=Integer.parseInt(JOptionPane.showInputDialog("insira 1 para percorer com forearch \n insira 2 para percorer com for \n 9 para sair"));
			if (op !=9){
				Thread tvet = new ThreadVetor(op,vetor);
				tvet.start();
			}
		}
	}
}

