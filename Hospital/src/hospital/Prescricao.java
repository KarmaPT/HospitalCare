package hospital;

import java.util.Date;
import java.util.ArrayList;

public class Prescricao {
	private Doente doente;
	private Medico medico;
	private Medicamento medicamento;
	
	private Date data;
	
	private ArrayList <HorarioToma> horariosToma;
	
	public Prescricao() {
		horariosToma = new ArrayList<HorarioToma>();
	}
	
	public Prescricao(Medico medico, Doente doente, Medicamento medicamento, Date data, ArrayList<HorarioToma> horariosToma) {
		this.medico = medico;
		this.doente = doente;
		this.medicamento = medicamento;
		this.data = data;
		this.horariosToma = horariosToma;
	}

	public Doente getDoente() {
		return doente;
	}

	public void setDoente(Doente doente) {
		this.doente = doente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public ArrayList<HorarioToma> getHorariosToma() {
		return horariosToma;
	}

	public void setHorariosToma(ArrayList<HorarioToma> horariosToma) {
		this.horariosToma = horariosToma;
	}
	
}