package cursojava.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor {

	public static void main(String[] args) {
		
		
		String Posicoes = JOptionPane.showInputDialog("Quantas posi�oes o Array deve ter? ");
		
		
		double[] notas = new double[Integer.parseInt(Posicoes)];
		
		
		for (int pos = 0; pos < notas.length; pos++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da posi��o " + pos);
			notas[pos] = Double.valueOf(valor);
		}
		
	
		for (int pos = 0; pos < notas.length; pos++) {
			
			System.out.println(" Nota " + (pos + 1) + " � " + notas[pos]);
		}
		
		
		
		

	}

}
