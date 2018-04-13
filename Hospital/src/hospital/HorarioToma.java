package hospital;

import java.util.Date;

public class HorarioToma {
	private Date Datahora;

	public HorarioToma() {
		
	}
	
	public HorarioToma(Date datahora) {
		this.Datahora = datahora;
	}
	
	public Date getDatahora() {
		return Datahora;
	}

	public void setDatahora(Date datahora) {
		Datahora = datahora;
	}
}
