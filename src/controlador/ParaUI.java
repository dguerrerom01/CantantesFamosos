package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Vista.UI;
import modelo.CantanteFamoso;

public class ParaUI extends UI {
	public ArrayList<CantanteFamoso> lista = new ArrayList<CantanteFamoso>();

	public ParaUI() {
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!txtDisco.getText().isEmpty() && !txtArtista.getText().isEmpty()) {
					lista.add(new CantanteFamoso(txtArtista.getText(), txtDisco.getText()));
					txtDisco.setText(null);
					txtArtista.setText(null);
					txtArtistaDisco.setText(null);
					for (int i = 0; i < lista.size(); i++) {
						txtArtistaDisco.setText(txtArtistaDisco.getText() + lista.get(i).toString());
					}
					System.out.println(lista);
					lblMensaje.setText(" ");
				} else {
					lblMensaje.setText("Rellene los campos de texto");
				}
			}
		});

	}
}
