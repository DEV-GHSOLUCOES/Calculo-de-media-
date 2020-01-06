package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	// main é o metodo principal de uma class executavel em java
	public static void main(String[] args) {
		
		
		
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
		
		Aluno aluno1 = new Aluno(); 
		
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
		
		for(int pos = 1; pos <= 3; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + "?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina " + pos + "?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
				
		}	
		
		int escolha  =  JOptionPane.showConfirmDialog(null, "Deseja remover algu8ma disciplina? ");
		
		if (escolha == 0) {
			String removerDisciplina = JOptionPane.showInputDialog("Qual disciplina 1,2 ou 3? ");
			aluno1.getDisciplinas().remove(Integer.valueOf(removerDisciplina).intValue() -1);
			
		}
		
		
		
		System.out.println(aluno1.toString());
		System.out.println("Media do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
		
       
		
	}

}
