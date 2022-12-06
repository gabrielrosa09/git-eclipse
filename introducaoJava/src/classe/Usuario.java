package classe;

public class Usuario {
	
	String nome;
	String email;
	
	public boolean equals(Object objeto) { // Object -> classe m�e do Java
		
		if (objeto instanceof Usuario) { 
			Usuario outro = (Usuario) objeto;
			
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			
			return nomeIgual && emailIgual;
		} else {
			return false;
		}
		
	}

	public int hashCode() {
		return this.nome.length();
	}
	
}
