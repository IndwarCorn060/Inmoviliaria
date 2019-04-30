package clases;

public class Propiedad implements Comparable<Propiedad>{
	
	private static final float GASTOS_GESTION = 150F;
	private static final float PORCENTAJE_BENEFICIO = 0.0075f;
	
	private int codigo;
	private EnumTipoPropiedad tipo;
	private String direccion;
	private float metrosCuadrados;
	private String descripcion;
	private float precio;
	
	public Propiedad(int cod, EnumTipoPropiedad tipo, String direccion, float metros, String descripcion, float precio) {
		this.codigo=cod;
		this.tipo=tipo;
		this.direccion=direccion;
		this.metrosCuadrados=metros;
		this.descripcion=descripcion;
		this.precio=precio;
	}

	public int getCodigo() {
		return codigo;
	}

	public EnumTipoPropiedad getTipo() {
		return tipo;
	}

	public String getDireccion() {
		return direccion;
	}

	public float getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public float getPrecio() {
		return precio;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setTipo(EnumTipoPropiedad tipo) {
		this.tipo = tipo;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setMetrosCuadrados(float metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public float getGastosGestion() {
		return GASTOS_GESTION;
	}

	public float getPorcentajeBeneficio() {
		return PORCENTAJE_BENEFICIO;
	}
	
	private float beneficio() {
		float beneficio;
		if(this.tipo==EnumTipoPropiedad.VIVIENDA) {
			beneficio=this.precio*(this.getPorcentajeBeneficio()+0.0025f)+this.getGastosGestion();
		}
		else {
			if(this.tipo==EnumTipoPropiedad.FINCA) {
				beneficio=this.precio*(this.getPorcentajeBeneficio()+0.005f)+this.getGastosGestion();
			}
			else {
				beneficio=this.precio*this.getPorcentajeBeneficio()+this.getGastosGestion();
			}
		}
		return beneficio;
	}
	
	
	@Override
	public String toString() {
		return this.tipo.getTipo().toUpperCase() + ": "+
				"\n\tBeneficio: "+this.beneficio()+
				"\n\tCodigo: "+this.codigo+
				"\n\tSuperficie: "+this.metrosCuadrados+" metros cuadrados"+
				"\n\tDescripcion: "+this.descripcion+
				"\n\tDireccion: "+this.direccion+
				"\n\tPrecio: "+this.precio+"€";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Propiedad other = (Propiedad) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

	@Override
	public int compareTo(Propiedad arg0) {
		// TODO Auto-generated method stub
		return this.getCodigo()-arg0.getCodigo();
	}

	

}
