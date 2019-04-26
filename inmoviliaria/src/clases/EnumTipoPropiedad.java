package clases;

public enum EnumTipoPropiedad {
	
	LOCAL("Local comercial"),
	APARCAMIENTO("Plaza de aparcamiento"),
	VIVIENDA("Vivienda"),
	FINCA("Finca rústica"),
	SOLAR("Solar");
	
	private String descripcionPropiedad;
	
	private EnumTipoPropiedad(String des) {
		this.descripcionPropiedad = des;
	}
	
	public String getTipo() {
		return this.descripcionPropiedad;
	}

}
