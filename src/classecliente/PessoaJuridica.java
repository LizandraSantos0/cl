package classecliente;

public class PessoaJuridica extends ClasseCliente {
	
		private String endereço;
	    private String cnpj;
	   

		public PessoaJuridica(String nome, String sobrenome, String email, String telefone, double saldo, String endereço,String cnpj) {
			super(nome, sobrenome, email, telefone, saldo);
			this.endereço = endereço;
			this.cnpj = cnpj;
		}

		public String getEndereço() {
			return endereço;
		}

		public void setEndereço(String endereço) {
			this.endereço = endereço;
		}

		public String getCnpj() {
			return cnpj;
		}
		public void setCnpj(String cnpj) {
			this.cnpj = cnpj;
		}
		
		@Override
		public void visualizar() {

			super.visualizar();
			System.out.println("Endereço: " + this.endereço);
			System.out.println("Cnpj: " + this.cnpj);
		}
	}


