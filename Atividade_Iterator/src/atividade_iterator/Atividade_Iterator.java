
package atividade_iterator;


public class Atividade_Iterator {

   
    public static void main(String[] args) {
       RegistroNomes nomes = new RegistroNomes();
		System.out.println("Iterando com laço de repetição:");
		for (IteradorNomes it = nomes.criarIterator(); !it.isDone(); it
				.proximoNome()) {
			System.out.println(it.getNome());
		}

		System.out.println("\nIterando de forma manual:");
		IteradorNomes it = nomes.criarIterator();
		System.out.println(it.getNome());
		it.proximoNome();
		System.out.println(it.getNome());
		it.proximoNome();
		System.out.println(it.getNome());
		it.proximoNome();
		System.out.println(it.getNome());
		it.proximoNome();
		System.out.println(it.getNome());

		System.out.println("\nIterando fora dos limites:");
		it.proximoNome();
		System.out.println(it.getNome());
		it.first();
		it.voltarNome();
		System.out.println(it.getNome());
	}
    }
    

