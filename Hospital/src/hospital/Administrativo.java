package hospital;

public class Administrativo {
	private int codigo;
	private String Nome;
	
	public Administrativo() {
		
	}

	public Administrativo(String nome, int codigo) {
		this.Nome = nome;
		this.codigo = codigo;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
}
