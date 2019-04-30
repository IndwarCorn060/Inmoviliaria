package clases;

public class Fincas extends Propiedad {
	
	private EnumTipoTerreno tipoTerreno;
	private boolean luz;
	private boolean agua;
	private boolean vivienda;
	
	public Fincas(int cod, String direccion, float metros, String descripcion, float precio,
			EnumTipoTerreno tipoTerreno, boolean luz, boolean agua, boolean vivienda) {
		super(cod, EnumTipoPropiedad.FINCA, direccion, metros, descripcion, precio);
		this.tipoTerreno=tipoTerreno;
		this.luz=luz;
		this.agua=agua;
		this.vivienda=vivienda;
	}
	
	public Fincas(Propiedad pro, EnumTipoTerreno tipoTerreno, boolean luz, boolean agua, boolean vivienda) {
		super(pro.getCodigo(),pro.getTipo(),pro.getDireccion(),pro.getMetrosCuadrados(),pro.getDescripcion(),pro.getPrecio());
		this.tipoTerreno=tipoTerreno;
		this.luz=luz;
		this.agua=agua;
		this.vivienda=vivienda;
	}

	public EnumTipoTerreno getTipoTerreno() {
		return tipoTerreno;
	}

	public boolean isLuz() {
		return luz;
	}

	public boolean isAgua() {
		return agua;
	}

	public boolean isVivienda() {
		return vivienda;
	}

	public void setTipoTerreno(EnumTipoTerreno tipoTerreno) {
		this.tipoTerreno = tipoTerreno;
	}

	public void setLuz(boolean luz) {
		this.luz = luz;
	}

	public void setAgua(boolean agua) {
		this.agua = agua;
	}

	public void setVivienda(boolean vivienda) {
		this.vivienda = vivienda;
	}

	@Override
	public String toString() {
		return super.toString()+
				"\n\tTipo de terreno: "+ this.tipoTerreno+
				"\n\tLuz: "+((this.luz)?"Si":"No")+
				"\n\tAgua: "+((this.agua)?"Si":"No")+
				"\n\tVivienda: "+((this.vivienda)?"Si":"No")
				;
	}

}
