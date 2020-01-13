package cursojava.executavel;

import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cusrsojava.constantes.StatusAluno;

public class PrimeiraClasseJava {

	// main é o metodo principal de uma class executavel em java
	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog("Informe o Login");
		String senha = JOptionPane.showInputDialog("Informe o Senha");
		
		if(login.equalsIgnoreCase("admin") && 
				senha.equalsIgnoreCase("admin")) {

		List<Aluno> alunos = new ArrayList<Aluno>();
		
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

	
		for (int qtd = 1; qtd <= 5; qtd++) {

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ?");
			/*
			 * String idade = JOptionPane.showInputDialog("Qual a idade? "); String
			 * dataNascimento = JOptionPane.showInputDialog("Data de nascimento? "); String
			 * rg = JOptionPane.showInputDialog("Registo Geral? "); String numeroCPF =
			 * JOptionPane.showInputDialog("Qual é o CPF? "); String nomeMae =
			 * JOptionPane.showInputDialog("Nome da Mãe? "); String nomePai =
			 * JOptionPane.showInputDialog("Nome do Pai? "); String matricula =
			 * JOptionPane.showInputDialog("Data da Matricula? "); String serie =
			 * JOptionPane.showInputDialog("Qual a série? "); String nomeEscola =
			 * JOptionPane.showInputDialog("Nome da Escola? ");
			 */

			Aluno aluno1 = new Aluno();

			aluno1.setNome(nome);
			/*
			 * aluno1.setIdade(Integer.valueOf(idade));
			 * aluno1.setDataNascimento(dataNascimento); aluno1.setRegistroGeral(rg);
			 * aluno1.setNumeroCPF(numeroCPF); aluno1.setNomeMae(nomeMae);
			 * aluno1.setNomePai(nomePai); aluno1.setDataMatriculado(matricula);
			 * aluno1.setNomeEscola(nomeEscola); aluno1.setSerieMatriculado(serie);
			 */

			for (int pos = 1; pos <= 1; pos++) {

				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + "?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina " + pos + "?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);

			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");

			if (escolha == 0) {

				int continuarRemovendo = 0;
				int posicao = 1;

				while (continuarRemovendo == 0) {
					String removerDisciplina = JOptionPane.showInputDialog("Qual disciplina 1,2 ou 3? ");
					aluno1.getDisciplinas().remove(Integer.valueOf(removerDisciplina).intValue() - posicao);
					posicao++;
					continuarRemovendo = JOptionPane.showConfirmDialog(null, "Continuar a remover? ");

				}

			}

			alunos.add(aluno1);

		}
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		
		
		for (Aluno aluno : alunos) {
			
			if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			}
			else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			}
			else {
				maps.get(StatusAluno.REPROVADO).add(aluno);
			}
			
		}
		
		System.out.println("----------- Lista dos Aprovados -----------");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {

			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com media de = " + aluno.getMediaNota());
		}

		System.out.println("----------- Lista dos Reprovados -----------");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {

			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com media de = " + aluno.getMediaNota());
		}
		
		System.out.println("----------- Lista dos Recuperação -----------");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {

			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com media de = " + aluno.getMediaNota());
		}
	}
		
	}
}
