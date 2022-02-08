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
package vista;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

import modelo.moEmpleados;

public class viEmpleados extends JFrame {
	private ArrayList<JTextField> allTextFields = new ArrayList<>();
	private ArrayList<JButton> allButtons = new ArrayList<>();
	private ArrayList<JPanel> allPanels = new ArrayList<>();
	private ArrayList<JLabel> allLabels = new ArrayList<>();
	private ArrayList<JComboBox> allCombos = new ArrayList<>();

	private moEmpleados m = new moEmpleados();

	public viEmpleados() {
		super("Empleados");
	}

	/*
	 * Metodo para crear todos los paneles
	 */
	public void createPanels() {
		for (int i = 0; i < m.getNumPanel(); i++) {
			JPanel panels = new JPanel();
			allPanels.add(panels);
		}
	}

	/*
	 * Metodo para crear ambos Combos
	 */
	public void createCombo() {
		for (int j = 0; j < m.getNumCombo(); j++) {
			JComboBox combos = new JComboBox();
			allCombos.add(combos);
		}
	}

	/*
	 * Metodo para crear las etiquetas
	 */
	public void createLabels() {
		for (int i = 0; i < m.getNumLabel(); i++) {
			JLabel label = new JLabel();
			allLabels.add(label);
		}
	}

	/*
	 * Metodo para crear los botones
	 */
	public void createButtons() {
		for (int j = 0; j < m.getNumButton(); j++) {
			JButton button = new JButton(m.getButtonsTexts().get(j));
			allButtons.add(button);
		}
	}

	/*
	 * Metodo para crear los textfield
	 */
	public void createTextFields() {
		for (int i = 0; i < m.getNumTextField(); i++) {
			JTextField txtfield = new JTextField(10);
			allTextFields.add(txtfield);
		}
	}

	/*
	 * Metodo para modificar las etiquetas
	 */
	public void editLabel() {
		for (int j = 0; j < m.getNumLabel(); j++) {
			allLabels.get(j).setText(m.getLabelTexts().get(j));
		}
	}

	/*
	 * Metodo para anadir elementos al primer combo
	 */
	public void editCombo0() {
		for (int i = 0; i < m.getPuestosCombo().size(); i++) {
			allCombos.get(0).addItem(m.getPuestosCombo().get(i));
		}
	}

	/*
	 * Metodo para anadir elementos al panel 2
	 */
	public void addPanel2() {
		confPanel(2);
		allPanels.get(2).add(allLabels.get(0));
		allPanels.get(2).add(allTextFields.get(0));
	}

	/*
	 * Metodo para anadir elementos al panel 3
	 */
	public void addPanel3() {
		confPanel(3);
		allPanels.get(3).add(allLabels.get(1));
		allPanels.get(3).add(allCombos.get(0));
	}

	/*
	 * Metodo para anadir elementos al panel 4
	 */
	public void addPanel4() {
		confPanel(4);
		allPanels.get(4).add(allLabels.get(2));
		allPanels.get(4).add(allTextFields.get(1));
	}

	/*
	 * Metodo para anadir todos los paneles a uno comun
	 */
	public void addPanelDatos() {
		confPanel(1);
		for (int i = 2; i <= 4; i++) {
			allPanels.get(1).add(allPanels.get(i));
		}
	}

	/*
	 * Metodo para anadir elementos al panel de botones
	 */
	public void addPanelButtons() {
		confPanel(5);
		for (int j = 0; j < m.getNumButton(); j++) {
			allPanels.get(5).add(allButtons.get(j));
		}
	}

	/*
	 * Metodo para anadir los dos paneles a uno en comun
	 */
	public void addGeneralPanel() {
		confPanel(0);
		allPanels.get(0).add(allPanels.get(1));
		allPanels.get(0).add(allPanels.get(5));
		confWindow();
		
	}

	/*
	 * Metodo para andir el panel general a la ventana
	 */
	public void modWindow() {
		add(allPanels.get(0));
	}

	/*
	 * Metodo para dar caracteristicas a la ventana
	 */
	public void confWindow() {
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}

	/*
	 * Metodo para la configuracion de los paneles
	 */
	public void confPanel(int n) {
		allPanels.get(n).setLayout(new FlowLayout());
	}
}
