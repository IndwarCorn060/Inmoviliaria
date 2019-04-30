package clases;

import java.awt.event.*;

import javax.swing.JOptionPane;

public class Controlador implements ActionListener, ItemListener, FocusListener {
	
	private Vista mivista;
	private Inmoviliaria lista;
	
	public Controlador(Vista v, Inmoviliaria l) {
		this.mivista = v;
		this.lista = l;
	}
	
	private void setPanel2Enable(boolean f) {
		this.mivista.getP2tipoVivienda().setEnabled(f);
		this.mivista.getP2numeroDormitorios().setEnabled(f);
		this.mivista.getP2numeroBanos().setEnabled(f);
	}
	
	private void setPanel3Enable(boolean f) {
		this.mivista.getP3TipoTerreno().setEnabled(f);
		this.mivista.getP3SEsi().setEnabled(f);
		this.mivista.getP3SEno().setEnabled(f);
		this.mivista.getP3SAsi().setEnabled(f);
		this.mivista.getP3SAno().setEnabled(f);
		this.mivista.getP3DVsi().setEnabled(f);
		this.mivista.getP3DVno().setEnabled(f);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==this.mivista.getP4GuardarPropiedad()) {
			if(this.lista.buscarCod(Integer.parseInt((this.mivista.getP1codigo().getText())))) {
				JOptionPane.showMessageDialog(null, "Este codigo de propiedad ya existe", "Error", JOptionPane.ERROR_MESSAGE);
				this.mivista.getP1codigo().setText("0");
			}
			else {
				//cod tipoPropiedad direccion superficie descripcion precio
				Propiedad aux = new Propiedad(Integer.parseInt(this.mivista.getP1codigo().getText()), 
												(EnumTipoPropiedad) this.mivista.getP1tipoPropiedad().getSelectedItem(), 
												this.mivista.getP1direccion().getText(), 
												Float.parseFloat(this.mivista.getP1superficie().getText()), 
												this.mivista.getP1descripcion().getText(), 
												Float.parseFloat(this.mivista.getP1precio().getText()));
				if(this.mivista.getP1tipoPropiedad().getSelectedItem().equals(EnumTipoPropiedad.FINCA)) {
					//propiedad tipoTerreno electricidad agua vivienda
					aux = new Fincas(aux, 
							(EnumTipoTerreno) this.mivista.getP3TipoTerreno().getSelectedItem(), 
							this.mivista.getP3SEsi().isSelected(), 
							this.mivista.getP3SAsi().isSelected(), 
							this.mivista.getP3DVsi().isSelected());
				}
				else if(this.mivista.getP1tipoPropiedad().getSelectedItem().equals(EnumTipoPropiedad.VIVIENDA)) {
					//propiedad tipoVivienda numBanos numDormitorios
					aux = new Vivienda(aux, 
							(EnumTipoVivienda) this.mivista.getP2tipoVivienda().getSelectedItem(), 
							Integer.parseInt((String)this.mivista.getP2numeroBanos().getSelectedItem()), 
							Integer.parseInt((String)this.mivista.getP2numeroDormitorios().getSelectedItem()));
				}
				//System.out.println(aux);
				System.out.println(this.lista.añadePropiedad(aux));
				JOptionPane.showMessageDialog(null, aux.toString(), "Mensaje", JOptionPane.INFORMATION_MESSAGE);
				System.out.println(this.lista.toString());
			}
		}
		else if(e.getSource()==this.mivista.getP4BorrarPropiedad()) {
			if(this.lista.borra(Integer.parseInt((this.mivista.getP1codigo().getText())))) {
				JOptionPane.showMessageDialog(null, "Propiedad borrada", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
				this.mivista.getP1codigo().setText("0");
			}
			else {
				JOptionPane.showMessageDialog(null, "Este codigo no corresponde a ninguna propiedad", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(e.getSource()==this.mivista.getP4LimpiarFormulario()) {
			this.mivista.iniciarDefecto();
		}
	}


	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		this.setPanel2Enable(false);
		this.setPanel3Enable(false);
		if(e.getStateChange()==ItemEvent.SELECTED&&e.getItem().equals(EnumTipoPropiedad.FINCA)) {
			this.setPanel3Enable(true);
			System.out.println("seleccionado finca");
		}
		else if(e.getStateChange()==ItemEvent.SELECTED&&e.getItem().equals(EnumTipoPropiedad.VIVIENDA)) {
			this.setPanel2Enable(true);
			System.out.println("seleccionado vivienda");
		}
	}

	@Override
	public void focusGained(FocusEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==this.mivista.getP1codigo()) {
			try {
				Integer.parseInt((this.mivista.getP1codigo().getText()));
			}catch(Exception exception) {
				JOptionPane.showMessageDialog(null, "Codigo Erroneo", "Error", JOptionPane.ERROR_MESSAGE);
				this.mivista.getP1codigo().setText("0");
			}
		}
		else if(e.getSource()==this.mivista.getP1precio()) {
			try {
				Float.parseFloat((this.mivista.getP1precio().getText()));
			}catch(Exception exception) {
				JOptionPane.showMessageDialog(null, "Precio Erroneo", "Error", JOptionPane.ERROR_MESSAGE);
				this.mivista.getP1precio().setText("0");
			}
		}
		else if(e.getSource()==this.mivista.getP1superficie()) {
			try {
				Float.parseFloat((this.mivista.getP1superficie().getText()));
			}catch(Exception exception) {
				JOptionPane.showMessageDialog(null, "Superficie Erronea", "Error", JOptionPane.ERROR_MESSAGE);
				this.mivista.getP1superficie().setText("0");
			}
		}
	}

}
