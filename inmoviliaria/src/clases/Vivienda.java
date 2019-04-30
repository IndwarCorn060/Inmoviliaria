package clases;

public class Vivienda extends Propiedad {
	
	private EnumTipoVivienda tipoVivienda;
	private int numBaños;
	private int numDorm;

	public Vivienda(int cod, String direccion, float metros, String descripcion, float precio,
			EnumTipoVivienda tipoVivienda, int numBaños, int numDorm) {
		super(cod, EnumTipoPropiedad.VIVIENDA, direccion, metros, descripcion, precio);
		this.tipoVivienda=tipoVivienda;
		this.numBaños=numBaños;
		this.numDorm=numDorm;
	}
	
	public Vivienda(Propiedad pro, EnumTipoVivienda tipoVivienda, int numBaños, int numDorm) {
		super(pro.getCodigo(),pro.getTipo(),pro.getDireccion(),pro.getMetrosCuadrados(),pro.getDescripcion(),pro.getPrecio());
		this.tipoVivienda=tipoVivienda;
		this.numBaños=numBaños;
		this.numDorm=numDorm;
	}

	public EnumTipoVivienda getTipoVivienda() {
		return tipoVivienda;
	}

	public int getNumBaños() {
		return numBaños;
	}

	public int getNumDorm() {
		return numDorm;
	}

	public void setTipoVivienda(EnumTipoVivienda tipoVivienda) {
		this.tipoVivienda = tipoVivienda;
	}

	public void setNumBaños(int numBaños) {
		this.numBaños = numBaños;
	}

	public void setNumDorm(int numDorm) {
		this.numDorm = numDorm;
	}
	
	@Override
	public String toString() {
		return super.toString()+
					"\n\ttipo de vivienda: "+this.getTipoVivienda()+
					"\n\tnumero de dormitorios: "+this.getNumDorm()+
					"\n\tnumero de banos: "+this.getNumBaños();
	}

}
