package clases;

public class Vivienda extends Propiedad {
	
	private EnumTipoVivienda tipoVivienda;
	private int numBa�os;
	private int numDorm;

	public Vivienda(int cod, String direccion, float metros, String descripcion, float precio,
			EnumTipoVivienda tipoVivienda, int numBa�os, int numDorm) {
		super(cod, EnumTipoPropiedad.VIVIENDA, direccion, metros, descripcion, precio);
		this.tipoVivienda=tipoVivienda;
		this.numBa�os=numBa�os;
		this.numDorm=numDorm;
	}
	
	public Vivienda(Propiedad pro, EnumTipoVivienda tipoVivienda, int numBa�os, int numDorm) {
		super(pro.getCodigo(),pro.getTipo(),pro.getDireccion(),pro.getMetrosCuadrados(),pro.getDescripcion(),pro.getPrecio());
		this.tipoVivienda=tipoVivienda;
		this.numBa�os=numBa�os;
		this.numDorm=numDorm;
	}

	public EnumTipoVivienda getTipoVivienda() {
		return tipoVivienda;
	}

	public int getNumBa�os() {
		return numBa�os;
	}

	public int getNumDorm() {
		return numDorm;
	}

	public void setTipoVivienda(EnumTipoVivienda tipoVivienda) {
		this.tipoVivienda = tipoVivienda;
	}

	public void setNumBa�os(int numBa�os) {
		this.numBa�os = numBa�os;
	}

	public void setNumDorm(int numDorm) {
		this.numDorm = numDorm;
	}
	
	@Override
	public String toString() {
		return super.toString()+
					"\n\ttipo de vivienda: "+this.getTipoVivienda()+
					"\n\tnumero de dormitorios: "+this.getNumDorm()+
					"\n\tnumero de banos: "+this.getNumBa�os();
	}

}
