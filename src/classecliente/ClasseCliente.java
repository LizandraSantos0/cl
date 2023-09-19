package classecliente;
import java.util.Optional;

public class ClasseCliente {
	
		private String nome;
		private String sobrenome;
		private String email;
		private String telefone;
		private double saldo;
		
		public ClasseCliente(String nome, String sobrenome, String email, String telefone, double saldo)  { 
		 try {
			this.nome = nome;
			this.sobrenome = sobrenome;
			this.email = email;
			this.telefone = telefone;
		    this.saldo = saldo;
		} catch(Exception e) {
	       
			System.err.println("Dado invalido: " + e.getMessage());
		}
		}
		
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getSobrenome() {
			return sobrenome;
		}

		public void setSobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getTelefone() {
			return Optional.ofNullable(telefone).orElse("Número não informado");
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		
		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
	       
		public void visualizar() {
			System.out.println("Nome: " + nome);
			System.out.println("Sobrenome: " + sobrenome);
			System.out.println("Email: " + email);
			System.out.println("Telefone: " + telefone);
		    System.out.println("Saldo: " + saldo);
				
			}


}

