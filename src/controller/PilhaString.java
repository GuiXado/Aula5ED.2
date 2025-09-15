package controller;

import br.gui.pilhastring.*;

public class PilhaString {

	public void processoPilha(String[] vetor) {
		Pilha pilha = new Pilha();
		Pilha pilha1 = new Pilha();

		for (String v : vetor) {
			pilha.push(v);
		}

		try {
			System.out.println(pilha.pop()); // W
			pilha1.push(pilha.pop()); // L
			pilha.pop(); // H
			pilha1.push(pilha.pop()); // B
			System.out.println(pilha.pop()); // R
			pilha1.push("M"); // M
			pilha1.push(pilha.pop()); // G
			pilha.pop(); // J
			pilha1.push("K"); // k

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println("Só para converência");
			System.out.println(pilha1.pop());
			System.out.println(pilha1.pop());
			System.out.println(pilha1.pop());
			System.out.println(pilha1.pop());
			System.out.println(pilha1.pop());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
