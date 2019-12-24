package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	// main é o metodo principal de uma class executavel em java
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno(); 
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno? ");
		String idade = JOptionPane.showInputDialog("Qual a idade? ");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento? ");
		String rg = JOptionPane.showInputDialog("Registo Geral? ");
		String numeroCPF = JOptionPane.showInputDialog("Qual é o CPF? ");
		String nomeMae = JOptionPane.showInputDialog("Nome da Mãe? ");
		String nomePai = JOptionPane.showInputDialog("Nome do Pai? ");
		String matricula = JOptionPane.showInputDialog("Data da Matricula? ");
		String serie = JOptionPane.showInputDialog("Qual a série? ");
		String nomeEscola = JOptionPane.showInputDialog("Nome da Escola? ");
		
		String nota1 = JOptionPane.showInputDialog("Nota 1");
		String nota2 = JOptionPane.showInputDialog("Nota 2");
		String nota3 = JOptionPane.showInputDialog("Nota 3");
		String nota4 = JOptionPane.showInputDialog("Nota 4");
		
		String disciplina1 =  JOptionPane.showInputDialog("Disciplina 1");
		String disciplina2 =  JOptionPane.showInputDialog("Disciplina 2");
		String disciplina3 =  JOptionPane.showInputDialog("Disciplina 3");
		String disciplina4 =  JOptionPane.showInputDialog("Disciplina 4");
		

		
		
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
		
		aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
		aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
		aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
		aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));
		
		aluno1.getDisciplina().setDisciplina1(disciplina1);
		aluno1.getDisciplina().setDisciplina2(disciplina2);
		aluno1.getDisciplina().setDisciplina3(disciplina3);
		aluno1.getDisciplina().setDisciplina4(disciplina4);
		
		
	
		System.out.println(aluno1.toString());
		System.out.println("Media do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
		
       
		
	}

}
