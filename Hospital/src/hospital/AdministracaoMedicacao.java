package hospital;

import java.util.Date;

public class AdministracaoMedicacao {
	private Date Datahora;
	private Enfermeiro enfermeiro;
	
	public AdministracaoMedicacao() {
		
	}
	
	public AdministracaoMedicacao(Date datahora, Enfermeiro enfermeiro) {
		this.Datahora = datahora;
		this.enfermeiro = enfermeiro;
	}
	
}
