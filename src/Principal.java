import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Principal extends Vista {

	public ArrayList<CantanteFamoso> lista = new ArrayList<CantanteFamoso>();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Principal() {
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!txtDisco.getText().isEmpty() && !txtArtista.getText().isEmpty()) {
					lista.add(new CantanteFamoso(txtArtista.getText(), txtDisco.getText()));
					txtDisco.setText(null);
					txtArtista.setText(null);
					
					
//					txtArtistaDisco.setText(txtArtistaDisco.getText() + lista.get(lista.size() - 1).toString());
					
					txtArtistaDisco.setText(null);
					for (int i = 0; i < lista.size(); i++) {
						txtArtistaDisco.setText(txtArtistaDisco.getText() + lista.get(i).toString());
					}
								
					
					// Metodo antiguo
//					String texto = "";
//					for (int i = 0; i < lista.toString().length(); i++) {
//						texto = texto + Character.toString(lista.toString().charAt(i));
//					}
//					texto.replace(',', ' ');
//					txtArtistaDisco.setText(texto);
					
					System.out.println(lista);
					lblMensaje.setText(" ");

				} else {
					lblMensaje.setText("Rellene los campos de texto");
				}
			}
		});

	}

}
