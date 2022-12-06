package RelacionamentoEntreClasses;

public class TesteContato {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("Tyrion");
		// contato.setEndereco("Kings Landing");
		// contato.setTelefone("61 99999-9999");
		
		// criar o objeto endereco
		Endereco end = new Endereco();
		end.setNomeRua("Recanto das Emas");
		end.setNumero("n/a");
		end.setComplemento("-");
		end.setCidade("Brasília");
		end.setEstado("DF");
		end.setCep("999999");
		
		contato.setEndereco(end);
		
		// criar o objeto telefone
		Telefone tel = new Telefone();
		tel.setDdd("61");
		tel.setNumero("99999-9999");
		tel.setTipo("celular");
		
		contato.setTelefone(tel);
		
		System.out.println(contato.getNome());
		
		if (contato != null && contato.getTelefone() != null) {
			System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
		}
	
		if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}

	}

}
