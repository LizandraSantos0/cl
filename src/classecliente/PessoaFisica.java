package classecliente;

public class PessoaFisica extends ClasseCliente {
	
		private String cpf;
	    private String rg;


		
		public PessoaFisica(String nome, String sobrenome, String email, String telefone, double saldo, String cpf,String rg)  {
			super(nome, sobrenome, email, telefone, saldo);
			this.cpf = cpf;
			this.rg = rg;
		}
	    	  
		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getRg() {
			return rg;
		}
		public void setRg(String rg) {
			this.rg = rg;
		}
	      
		@Override
		public void visualizar() {

			super.visualizar();

			System.out.println("Cpf: " + this.cpf);
			System.out.println("Rg: " + this.rg );
		}
	}


