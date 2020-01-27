package cursojava.classes;


/*Classe filha de Pessoa*/
public class Secretario extends Pessoa {

	private String experiencia;
	private String nivelCargo;
	private String registro;

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	public String getNivelCargo() {
		return nivelCargo;
	}

	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	@Override
	public String toString() {
		return "Secretario [experiencia=" + experiencia + ", nivelCargo=" + nivelCargo + ", registro=" + registro
				+ ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCPF=" + numeroCPF + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}
	
	

}
