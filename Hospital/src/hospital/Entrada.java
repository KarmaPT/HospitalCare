package hospital;

import java.time.LocalDateTime;

public class Entrada {
		private int codigo;
		private Administrativo funcionario;
		private Doente doente;
		private LocalDateTime data_Hora;
		
		public Entrada(int codigo, Administrativo funcionario, Doente doente, LocalDateTime data_Hora) {
			super();
			this.codigo = codigo;
			this.funcionario = funcionario;
			this.doente = doente;
			this.data_Hora = data_Hora;
		}

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public Administrativo getFuncionario() {
			return funcionario;
		}

		public void setFuncionario(Administrativo funcionario) {
			this.funcionario = funcionario;
		}

		public Doente getDoente() {
			return doente;
		}

		public void setDoente(Doente doente) {
			this.doente = doente;
		}

		public LocalDateTime getData_Hora() {
			return data_Hora;
		}

		public void setData_Hora(LocalDateTime data_Hora) {
			this.data_Hora = data_Hora;
		}
		
		
}
