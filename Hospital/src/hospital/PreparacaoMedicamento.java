package hospital;

import java.util.Date;

public class PreparacaoMedicamento {
	private Date Datahora;
	private Enfermeiro enfermeiro;
	
	public PreparacaoMedicamento() {
		
	}
	
	public PreparacaoMedicamento(Date datahora, Enfermeiro enfermeiro) {
		this.Datahora = datahora;
		this.enfermeiro = enfermeiro;
	}

	public Date getDatahora() {
		return Datahora;
	}

	public void setDatahora(Date datahora) {
		Datahora = datahora;
	}

	public Enfermeiro getEnfermeiro() {
		return enfermeiro;
	}

	public void setEnfermeiro(Enfermeiro enfermeiro) {
		this.enfermeiro = enfermeiro;
	}
	
}
