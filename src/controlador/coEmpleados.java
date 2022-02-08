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
package controlador;

import vista.viEmpleados;

public class coEmpleados {
	private viEmpleados v = new viEmpleados();

	public coEmpleados() {

		// llamamos a los metodos donde creamos cada elemento
		v.createPanels();
		v.createLabels();
		v.createTextFields();
		v.createButtons();
		v.createCombo();

		// llamamos a los metodos donde anadimos textos a los elementos
		v.editCombo0();
		v.editLabel();

		// llamamos a los metodos para anadir los elementos a cada panel
		v.addPanel2();
		v.addPanel3();
		v.addPanel4();
		v.addPanelDatos();
		v.addPanelButtons();
		v.addGeneralPanel();

		// llamamos a metodo donde andimos el panel a la ventana
		v.modWindow();

		// llamamos a metodo de configuracion de la ventana
		v.confWindow();
	}
}
