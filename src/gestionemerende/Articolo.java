package gestionemerende;

public class Articolo {
	
	protected static String codice;
	private String descrizione;
	private static double costoUnitario;
	protected static double apportoCalorico;
	
	
	public Articolo(String codice, String descrizione, double costoUnitario,
			double apportoCalorico) {
		super();
		this.codice = codice;
		this.descrizione = descrizione;
		this.costoUnitario = costoUnitario;
		this.apportoCalorico = apportoCalorico;
	}


	public String getCodice() {
		return codice;
	}


	public String getDescrizione() {
		return descrizione;
	}


	public double getCostoUnitario() {
		return costoUnitario;
	}


	public double getApportoCalorico() {
		return apportoCalorico;
	}


	

}
