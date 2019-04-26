package clases;

import java.awt.*;

import javax.swing.*;

public class Vista extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	private JTextField p1codigo, p1precio, p1superficie, p1direccion;
	private JTextArea p1descripcion;
	private JScrollPane p1descripcionScroll;
	private JComboBox<?> p1tipoPropiedad, p2tipoVivienda, p2numeroDormitorios, p2numeroBanos, p3TipoTerreno;
	private JLabel p1etqtCodigo, p1etqtTipoPropiedad, p1etqtPrecio, p1etqtSuperficie, p1etqtDireccion, p1etqtDescripcion;
	private JLabel p2etqtTipoVivienda, p2etqtNumeroDormitorios, p2etqtNumeroBanos;
	private JLabel p3etqtTipoTerreno, p3etqtSuministroElectrico, p3etqtSuministroAgua, p3etqtDisponeVivienda;
	private JRadioButton p3SEsi, p3SEno, p3SAsi, p3SAno, p3DVsi, p3DVno;
	private ButtonGroup p3SE, p3SA, p3DV;
	private JButton p4GuardarPropiedad, p4BorrarPropiedad, p4LimpiarFormulario;
	
	private JPanel panel, panel1, panel1_1, panel1_1_1, panel1_1_2, panel1_1_3, panel1_1_4, panel1_2, panel1_3, panel3_4;
	private JPanel panel2, panel2_1, panel2_2, panel2_3;
	private JPanel panel3, panel3_1, panel3_2, panel3_3;
	private JPanel panel4;
	
	private void crearPaneles() {
		this.panel = new JPanel();
		this.panel.setLayout(new BoxLayout(this.panel, BoxLayout.Y_AXIS));
		this.panel1 = new JPanel();
		this.panel1.setLayout(new BoxLayout(this.panel1, BoxLayout.Y_AXIS));
		this.panel1.setBorder(BorderFactory.createTitledBorder("Datos Generales"));
		this.panel1_1 = new JPanel();
		this.panel1_1_1 = new JPanel();
		this.panel1_1_2 = new JPanel();
		this.panel1_1_3 = new JPanel();
		this.panel1_1_4 = new JPanel();
		this.panel1_2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		this.panel1_3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		this.panel2 = new JPanel();
		this.panel2.setBorder(BorderFactory.createTitledBorder("Datos especificos para Vivienda"));
		this.panel2_1 = new JPanel();
		this.panel2_2 = new JPanel();
		this.panel2_3 = new JPanel();
		this.panel3 = new JPanel();
		this.panel3.setBorder(BorderFactory.createTitledBorder("Datos especificos para Fincas Rusticas"));
		this.panel3.setLayout(new BoxLayout(this.panel3, BoxLayout.Y_AXIS));
		this.panel3_1 = new JPanel();
		this.panel3_1.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.panel3_2 = new JPanel();
		this.panel3_2.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.panel3_3 = new JPanel();
		this.panel3_3.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.panel3_4 = new JPanel();
		this.panel3_4.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.panel4 = new JPanel();
		this.panel4.setBorder(BorderFactory.createTitledBorder("Operaciones Disponibles"));
	}

	private void crearCromponentesPanel1() {
		//TextField
		this.p1codigo = new JTextField(6);
		this.p1precio = new JTextField("0",10);
		this.p1superficie = new JTextField("0",6);
		this.p1direccion = new JTextField(50);
		//TextArea
		this.p1descripcion = new JTextArea(4,50);
		//ScrollPane
		this.p1descripcionScroll = new JScrollPane(this.p1descripcion);
		//ComboBox
		this.p1tipoPropiedad = new JComboBox<EnumTipoPropiedad>(EnumTipoPropiedad.values());
		this.p1tipoPropiedad.setSelectedItem(EnumTipoPropiedad.FINCA);
		//JLabel
		this.p1etqtCodigo = new JLabel("Codigo:");
		this.p1etqtTipoPropiedad = new JLabel("TipoPropiedad:");
		this.p1etqtPrecio = new JLabel("Precio:");
		this.p1etqtSuperficie = new JLabel("Superficie:");
		this.p1etqtDireccion = new JLabel("Direccion:");
		this.p1etqtDescripcion = new JLabel("Descripcion:");
	}
	
	private void crearCromponentesPanel2() {
		//ComboBox
		this.p2tipoVivienda = new JComboBox<EnumTipoVivienda>(EnumTipoVivienda.values());
		String[] numeroDormitorios = {"0","1","2","3","4","5","6","7","8","9"};
		this.p2tipoVivienda.setEnabled(false);
		this.p2numeroDormitorios = new JComboBox<String>(numeroDormitorios);
		String[] numeroBanos = {"0","1","2","3","4","5","6","7","8","9"};
		this.p2numeroDormitorios.setEnabled(false);
		this.p2numeroBanos = new JComboBox<String>(numeroBanos);
		this.p2numeroBanos.setEnabled(false);
		//JLabel
		this.p2etqtTipoVivienda = new JLabel("Tipo de Vivienda:");
		this.p2etqtNumeroDormitorios = new JLabel("Numero de Dormitorios:");
		this.p2etqtNumeroBanos = new JLabel("Numero de Baños:");
	}
	
	private void crearCromponentesPanel3() {
		//JLabel
		this.p3etqtTipoTerreno = new JLabel("Tipo de Terreno:");
		this.p3etqtSuministroElectrico = new JLabel("Suministro Electrico:");
		this.p3etqtSuministroAgua = new JLabel("Suministro de Agua: ");
		this.p3etqtDisponeVivienda = new JLabel("Dispone de Vivienda:");
		//ComboBox
		this.p3TipoTerreno = new JComboBox<EnumTipoTerreno>(EnumTipoTerreno.values());
		//RadioButton
		this.p3SEsi = new JRadioButton("Si");
		this.p3SEsi.setSelected(true);
		this.p3SEno = new JRadioButton("No");
		this.p3SAsi = new JRadioButton("Si");
		this.p3SAsi.setSelected(true);
		this.p3SAno = new JRadioButton("No");
		this.p3DVsi = new JRadioButton("Si");
		this.p3DVsi.setSelected(true);
		this.p3DVno = new JRadioButton("No");
		//ButtonGroup
		this.p3SE = new ButtonGroup();
		this.p3SA = new ButtonGroup();
		this.p3DV = new ButtonGroup();
		this.p3SE.add(p3SEsi);
		this.p3SE.add(p3SEno);
		this.p3SA.add(p3SAsi);
		this.p3SA.add(p3SAno);
		this.p3DV.add(p3DVsi);
		this.p3DV.add(p3DVno);
	}
	
	private void crearCromponentesPanel4() {
		//JButton
		this.p4GuardarPropiedad = new JButton("Guardar Propiedad");
		this.p4BorrarPropiedad = new JButton("Borrar Propiedad");
		this.p4LimpiarFormulario = new JButton("Limpiar Formulario");
	}
	
	private void crearComponentes() {
		this.crearCromponentesPanel1();
		this.crearCromponentesPanel2();
		this.crearCromponentesPanel3();
		this.crearCromponentesPanel4();
		this.crearPaneles();
	}
	
	public Vista() {
		this.crearComponentes();
		this.add(this.panel);
			this.panel.add(this.panel1);
				this.panel1.add(this.panel1_1);
					this.panel1_1.add(this.panel1_1_1);
						this.panel1_1_1.add(this.p1etqtCodigo);
						this.panel1_1_1.add(this.p1codigo);
					this.panel1_1.add(this.panel1_1_2);
						this.panel1_1_2.add(this.p1etqtTipoPropiedad);
						this.panel1_1_2.add(this.p1tipoPropiedad);
					this.panel1_1.add(this.panel1_1_3);
						this.panel1_1_3.add(this.p1etqtPrecio);
						this.panel1_1_3.add(this.p1precio);
					this.panel1_1.add(this.panel1_1_4);
						this.panel1_1_4.add(this.p1etqtSuperficie);
						this.panel1_1_4.add(this.p1superficie);
				this.panel1.add(this.panel1_2);
					this.panel1_2.add(this.p1etqtDireccion);
					this.panel1_2.add(this.p1direccion);
				this.panel1.add(this.panel1_3);
					this.panel1_3.add(this.p1etqtDescripcion);
					this.panel1_3.add(this.p1descripcionScroll);
			this.panel.add(this.panel2);
				this.panel2.add(this.panel2_1);
					this.panel2_1.add(this.p2etqtTipoVivienda);
					this.panel2_1.add(this.p2tipoVivienda);
				this.panel2.add(this.panel2_2);
					this.panel2_2.add(this.p2etqtNumeroDormitorios);
					this.panel2_2.add(this.p2numeroDormitorios);
				this.panel2.add(this.panel2_3);
					this.panel2_3.add(this.p2etqtNumeroBanos);
					this.panel2_3.add(this.p2numeroBanos);
			this.panel.add(this.panel3);
				this.panel3.add(this.panel3_1);
					this.panel3_1.add(this.p3etqtTipoTerreno);
					this.panel3_1.add(this.p3TipoTerreno);
				this.panel3.add(this.panel3_2);
					this.panel3_2.add(this.p3etqtSuministroElectrico);
					this.panel3_2.add(this.p3SEsi);
					this.panel3_2.add(this.p3SEno);
				this.panel3.add(this.panel3_3);
					this.panel3_3.add(this.p3etqtSuministroAgua);
					this.panel3_3.add(this.p3SAsi);
					this.panel3_3.add(this.p3SAno);
				this.panel3.add(this.panel3_4);
					this.panel3_4.add(this.p3etqtDisponeVivienda);
					this.panel3_4.add(this.p3DVsi);
					this.panel3_4.add(this.p3DVno);
			this.panel.add(this.panel4);
				this.panel4.add(this.p4GuardarPropiedad);
				this.panel4.add(this.p4BorrarPropiedad);
				this.panel4.add(this.p4LimpiarFormulario);
	}

	public void control(Controlador ctr) {
		this.p1codigo.addFocusListener(ctr);
		this.p1precio.addFocusListener(ctr);
		this.p1superficie.addFocusListener(ctr);
		this.p1tipoPropiedad.addItemListener(ctr);
		this.p4GuardarPropiedad.addActionListener(ctr);
		this.p4BorrarPropiedad.addActionListener(ctr);
		this.p4LimpiarFormulario.addActionListener(ctr);
	}

	public JTextField getP1codigo() {
		return p1codigo;
	}

	public JTextField getP1precio() {
		return p1precio;
	}

	public JTextField getP1superficie() {
		return p1superficie;
	}

	public JTextField getP1direccion() {
		return p1direccion;
	}

	public JTextArea getP1descripcion() {
		return p1descripcion;
	}

	public JScrollPane getP1descripcionScroll() {
		return p1descripcionScroll;
	}

	public JComboBox<?> getP1tipoPropiedad() {
		return p1tipoPropiedad;
	}

	public JComboBox<?> getP2tipoVivienda() {
		return p2tipoVivienda;
	}

	public JComboBox<?> getP2numeroDormitorios() {
		return p2numeroDormitorios;
	}

	public JComboBox<?> getP2numeroBanos() {
		return p2numeroBanos;
	}

	public JComboBox<?> getP3TipoTerreno() {
		return p3TipoTerreno;
	}

	public JRadioButton getP3SEsi() {
		return p3SEsi;
	}

	public JRadioButton getP3SEno() {
		return p3SEno;
	}

	public JRadioButton getP3SAsi() {
		return p3SAsi;
	}

	public JRadioButton getP3SAno() {
		return p3SAno;
	}

	public JRadioButton getP3DVsi() {
		return p3DVsi;
	}

	public JRadioButton getP3DVno() {
		return p3DVno;
	}

	public JButton getP4GuardarPropiedad() {
		return p4GuardarPropiedad;
	}

	public JButton getP4BorrarPropiedad() {
		return p4BorrarPropiedad;
	}

	public JButton getP4LimpiarFormulario() {
		return p4LimpiarFormulario;
	}
	
	
	
}
