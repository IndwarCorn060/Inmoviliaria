package clases;

public enum EnumTipoTerreno {
	
	REGADIO("zona regadio"),
	SECANO("Pzona secano"),
	OLIVOS("zona de campo"),
	PANTANO("zona pantanosa");
	
	private String descripcionPropiedad;
	
	private EnumTipoTerreno(String des) {
		this.descripcionPropiedad = des;
	}
	
	public String getTipo() {
		return this.descripcionPropiedad;
	}

}
