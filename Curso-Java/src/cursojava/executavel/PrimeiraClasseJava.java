package cursojava.executavel;

import java.awt.JobAttributes;
import java.nio.channels.ShutdownChannelGroupException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	// main é o metodo principal de uma class executavel em java
	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 2; qtd++) {

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

			for (int pos = 1; pos <= 3; pos++) {
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
		
		
 		for(int pos = 0; pos < alunos.size(); pos++) {
			Aluno aluno = alunos.get(pos);
			System.out.println("Aluno = "+ aluno.getNome());
			System.out.println("Média do aluno = " +  aluno.getMediaNota());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() );
			System.out.println("-----------------------------------------------------------");
		
		}

	}
}
