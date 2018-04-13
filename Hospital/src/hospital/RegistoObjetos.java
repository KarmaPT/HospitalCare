package hospital;
	
import java.util.HashMap;

public class RegistoObjetos {
	private static HashMap<Integer, Doente> doentes = new HashMap<Integer, Doente>();
	private static HashMap<Integer, Administrativo> admin = new HashMap<Integer, Administrativo>();
	private static HashMap<Integer, Entrada> entradas = new HashMap<Integer, Entrada>();
	
	public static void inserirDoente(Integer codigo, Doente doente) {
		doentes.put(codigo, doente);
	}
	public static Doente devolverDoente(Integer codigo) {
		return doentes.get(codigo);
	}
	public static void inserirAdmin(Integer codigo, Administrativo func) {
		admin.put(codigo, func);
	}
	public static Administrativo devolverAdmin(Integer codigo) {
		return admin.get(codigo);
	}
	public static void inserirEntrada(Integer codigo, Entrada entrada) {
		entradas.put(codigo, entrada);
	}
	public static Entrada devolverEntrada(Integer codigo) {
		return entradas.get(codigo);
	}
}
