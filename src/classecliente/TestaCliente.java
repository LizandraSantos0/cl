package classecliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestaCliente {

	public static void main(String[] args) {
     List<ClasseCliente> clientes = new ArrayList<>();
				
				Optional<String> telefone = Optional.ofNullable("Número não informado");
				
			    ClasseCliente c1 =  new ClasseCliente( "Ana" , "Santos", "Ana@gmail.com", "(11) 96167-9187",1500.00 );
				PessoaFisica p1 = new PessoaFisica("Maria" , "Souza", "Maria@gmail.com", "(11) 94676-9187", 2500.00,"456.927.183-00" ,"49.821.572-6");
				PessoaJuridica p2 = new PessoaJuridica("Pedro" , "Alves", "Pedro@gmail.com", "(11) 91537-9187",1000.00,"Rua das margaridas","54.864.964/001-34");
				
				
				clientes.add(c1);
				clientes.add(p1);
				clientes.add(p2);
				
				    List<ClasseCliente> clientesComSaldoAlto = clientes.stream()
					.filter(cliente -> cliente.getSaldo() > 1000.00 )
					.collect(Collectors.toList());
				    
			    	 for (ClasseCliente cliente : clientesComSaldoAlto) {
					 System.out.println(cliente.getNome());
					 
				 p1.setCpf("456.927.183-00");
				 p1.setRg("49.821.572-6");
				 p2.setEndereço("Rua das margaridas");
				 p2.setCnpj("54.864.964/001-34");
				 c1.setNome("Ana");
				 c1.setSobrenome("Santos");
				 c1.setEmail("Maria@gmail.com");
				 c1.setTelefone("(11) 96167-9187");
				 c1.setSaldo(1500.00);
				 
				 c1.visualizar();
				 p1.visualizar();
				 p2.visualizar();
				 
				 }
			}

	}
