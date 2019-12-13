package cursojava.executavel;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {

	//main é o metodo principal de uma class executavel em java
	public static void main(String[] args) {
		
		String nota1 = JOptionPane.showInputDialog("Informe a primeira nota! ");
		String nota2 = JOptionPane.showInputDialog("Informe a segunda nota! ");
		String nota3 = JOptionPane.showInputDialog("Informe a terceira nota! ");
		String nota4 = JOptionPane.showInputDialog("Informe a quarta nota! ");

		double notaNumero1 = Double.parseDouble(nota1);
		double notaNumero2 = Double.parseDouble(nota2);
		double notaNumero3 = Double.parseDouble(nota3);
		double notaNumero4 = Double.parseDouble(nota4);
		
		double media = (notaNumero1 + notaNumero2 + notaNumero3 + notaNumero4) / 2;
		
		if (media >= 70) {
			
			JOptionPane.showMessageDialog(null, "Voce foi aprovado com media " + media);
			
		}
		else {
			
			JOptionPane.showMessageDialog(null, "Voce foi reprovado com media " + media);
		}
		
		
	
		
	}

}
