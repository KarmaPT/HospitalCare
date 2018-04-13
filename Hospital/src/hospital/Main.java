package hospital;

import java.time.LocalDateTime;

public class Main {
	private static void precondicoes() {
		//Precondições
		Doente doente = new Doente(1,"Maria");
		RegistoObjetos.inserirDoente(1, doente);
		Administrativo fadmin = new Administrativo("Jose",1);
		RegistoObjetos.inserirAdmin(1, fadmin);
	}
	private static void inserirEntrada() {
		int codigoDoente = 1;
		Doente d = RegistoObjetos.devolverDoente(codigoDoente);
		System.out.println(d.getNome());
		
		int codigoAdmin = 1;
		Administrativo f = RegistoObjetos.devolverAdmin(codigoAdmin);
		System.out.println(f.getNome());
		
		Entrada e = new Entrada(1,f,d, LocalDateTime.now());
		Entrada e1 = new Entrada(2,f,d, LocalDateTime.now());
		RegistoObjetos.inserirEntrada(1, e);
		RegistoObjetos.inserirEntrada(2, e1);
	}
	
	public static void main(String[] args) {
		precondicoes();
		inserirEntrada();
	}
}
