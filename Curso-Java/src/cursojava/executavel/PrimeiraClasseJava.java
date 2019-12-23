package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	// main � o metodo principal de uma class executavel em java
	public static void main(String[] args) {
		
		
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno? ");
		String idade = JOptionPane.showInputDialog("Qual a idade? ");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento? ");
		String rg = JOptionPane.showInputDialog("Registo Geral? ");
		String numeroCPF = JOptionPane.showInputDialog("Qual � o CPF? ");
		String nomeMae = JOptionPane.showInputDialog("Nome da M�e? ");
		String nomePai = JOptionPane.showInputDialog("Nome do Pai? ");
		String matricula = JOptionPane.showInputDialog("Data da Matricula? ");
		String serie = JOptionPane.showInputDialog("Qual a s�rie? ");
		String nomeEscola = JOptionPane.showInputDialog("Nome da Escola? ");
		
		String nota1 = JOptionPane.showInputDialog("Nota 1");
		String nota2 = JOptionPane.showInputDialog("Nota 2");
		String nota3 = JOptionPane.showInputDialog("Nota 3");
		String nota4 = JOptionPane.showInputDialog("Nota 4");
		
		

		Aluno aluno1 = new Aluno(); /* aqui ser� o jo�o */
		
		aluno1.setNome(nome); 
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCPF(numeroCPF);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatriculado(matricula);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
		
		System.out.println("Nome � = " + aluno1.getNome());
		System.out.println("Idade � = " + aluno1.getIdade());
		System.out.println("Data de nascimento � = " + aluno1.getDataNascimento());
		System.out.println("RG � = " + aluno1.getRegistroGeral());
		System.out.println("Numero CPF � = " + aluno1.getNumeroCPF());
		System.out.println("Nome da M�e � = " + aluno1.getNomeMae());
		System.out.println("Nome do Pai � = " + aluno1.getNomePai());
		System.out.println("Data de matricula � = " + aluno1.getDataMatriculado());
		System.out.println("Nome da Escola � = " + aluno1.getNomeEscola());
		System.out.println("S�rie matriculado � = " + aluno1.getSerieMatriculado());
		System.out.println("MEdia da Nota � = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado" ));
		
		
		

		
	}

}
