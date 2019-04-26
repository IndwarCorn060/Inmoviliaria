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
	
	public Vivienda(Propiedad propiedad, EnumTipoVivienda tipoVivienda, int numBaños, int numDorm) {
		super(propiedad);
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
		return super.toString()+"\n\t tipo de vivienda: "+this.getTipoVivienda();
	}

}
