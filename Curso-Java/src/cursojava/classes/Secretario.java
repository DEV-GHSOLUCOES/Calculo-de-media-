package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

/*Classe filha de Pessoa*/
public class Secretario extends Pessoa implements PermitirAcesso {

	private String experiencia;
	private String nivelCargo;
	private String registro;
	
	private String login;
	private String senha;
	
	public Secretario() {
		
	}
	
	public Secretario(String login,String senha) {
		this.login = login;
		this.senha = senha;
				
	}
	
	

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
   
	@Override
	public double salario() {
		
		return 1800.80 *0.9;
	}

	
	/*Esse é o metodo do contrato de autenticação*/
	
	@Override
	public boolean autenticar(String login, String senha) {
		this.login = login;
		this.senha = senha;
		
		return autenticar();
	}

	@Override
	public boolean autenticar() {
	
		return login.equals("admin") && senha.equals("admin");
	}
	
	

}
