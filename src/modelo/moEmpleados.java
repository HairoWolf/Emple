/**
 * @author Jose Ramon Gallego Velez
 * 
 * @date 08/02/2022
 * 
 * @version: 1
 * 
 * @info: Parte de la ventana de un trabajo en grupo con Javier Tienda 
 * 	y Francisco Fernández
 */
package modelo;

import java.util.ArrayList;

public class moEmpleados {
	private int numTextField;
	private int numButton;
	private int numPanel;
	private int numCombo;
	private HOLA;
	private int numLabel;

	private ArrayList<String> labelTexts = new ArrayList<>();
	private ArrayList<String> puestosCombo = new ArrayList<>();
	private ArrayList<String> buttonsTexts = new ArrayList<>();

	public moEmpleados() {
		fillLabelTexts();
		fillPuestosCombo();
		fillButtonsTexts();
	}

	/*
	 * Metodo donde anadimos a un array los textos de las etiquetas
	 */
	public void fillLabelTexts() {
		labelTexts.add("Nombre");
		labelTexts.add("Puesto");
		labelTexts.add("Sueldo");
	}

	/*
	 * Metodo donde andimos a un array los textos de los botones
	 */
	public void fillButtonsTexts() {
		buttonsTexts.add("Guardar");
		buttonsTexts.add("Búsqueda");
		buttonsTexts.add("Borrar");
		buttonsTexts.add("Modificar");
	}

	/*
	 * Metodo donde andimos a un array los textos de los puestos
	 */
	public void fillPuestosCombo() {
		puestosCombo.add("Director");
		puestosCombo.add("Gerente");
		puestosCombo.add("Empleado");
	}

	/*
	 * Generamos getters y setters
	 */
	public int getNumTextField() {
		return numTextField = 2;
	}

	public void setNumTextField(int numTextField) {
		this.numTextField = numTextField;
	}

	public int getNumButton() {
		return numButton = 4;
	}

	public void setNumButton(int numButton) {
		this.numButton = numButton;
	}

	public int getNumPanel() {
		return numPanel = 6;
	}

	public void setNumPanel(int numPanel) {
		this.numPanel = numPanel;
	}

	public int getNumCombo() {
		return numCombo = 1;
	}

	public void setNumCombo(int numCombo) {
		this.numCombo = numCombo;
	}

	public int getNumLabel() {
		return numLabel = 3;
	}

	public void setNumLabel(int numLabel) {
		this.numLabel = numLabel;
	}

	public ArrayList<String> getLabelTexts() {
		return labelTexts;
	}

	public void setLabelTexts(ArrayList<String> labelTexts) {
		this.labelTexts = labelTexts;
	}

	public ArrayList<String> getPuestosCombo() {
		return puestosCombo;
	}

	public void setPuestosCombo(ArrayList<String> puestosCombo) {
		this.puestosCombo = puestosCombo;
	}

	public ArrayList<String> getButtonsTexts() {
		return buttonsTexts;
	}

	public void setButtonsTexts(ArrayList<String> buttonsTexts) {
		this.buttonsTexts = buttonsTexts;
	}
}
