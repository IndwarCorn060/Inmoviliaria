package clases;

public enum EnumTipoVivienda {
	
	CASA("casita"),
	PISO("bloque"),
	ADOSADO("baldosa"),
	CHALET("de ricos"),
	DUPLEX("tambien de ricos");
	
	private String descripcionPropiedad;
	
	private EnumTipoVivienda(String des) {
		this.descripcionPropiedad = des;
	}
	
	public String getTipo() {
		return this.descripcionPropiedad;
	}

}
