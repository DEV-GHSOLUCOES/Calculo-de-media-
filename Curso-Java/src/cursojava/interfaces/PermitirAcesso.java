package cursojava.interfaces;


/*Essa interface sera nosso contrato de  autenticação*/
public interface PermitirAcesso {
	
	 /*Apenas declaração*/
	public boolean autenticar (String login, String senha);
	
	public boolean autenticar();
	

}
