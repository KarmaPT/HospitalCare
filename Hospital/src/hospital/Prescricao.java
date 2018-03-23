package hospital;

import java.util.Date;
import java.util.ArrayList;

public class Prescricao {
	protected Doente doente;
	protected Medico medico;
	protected Medicamento medicamento;
	
	protected Date data;
	
	protected ArrayList <HorarioToma> horariosToma;
	
	public Prescricao() {
		horariosToma = new ArrayList<HorarioToma>();
	}
	
	public Prescricao(Medico medico, Doente doente, Medicamento medicamento, Date date, ArrayList<HorarioToma> horariosToma) {
		this.medico = medico;
		this.doente = doente;
		this.medicamento = medicamento;
		this.data = date;
		this.horariosToma = horariosToma;
	}
}