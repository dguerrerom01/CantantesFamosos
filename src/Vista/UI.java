package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UI extends JFrame {

	private JPanel contentPane;
	protected JButton btnAgregar;
	protected JTextField txtArtista;
	protected JTextField txtDisco;
	protected JTextPane txtArtistaDisco;
	protected JLabel lblMensaje;

	/**
	 * Create the frame.
	 */
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JLabel lblArtista = new JLabel("Artista");
		GridBagConstraints gbc_lblArtista = new GridBagConstraints();
		gbc_lblArtista.insets = new Insets(0, 0, 5, 5);
		gbc_lblArtista.gridx = 0;
		gbc_lblArtista.gridy = 0;
		contentPane.add(lblArtista, gbc_lblArtista);

		JLabel lblDiscoConMs = new JLabel("Disco con m\u00E1s ventas");
		GridBagConstraints gbc_lblDiscoConMs = new GridBagConstraints();
		gbc_lblDiscoConMs.insets = new Insets(0, 0, 5, 0);
		gbc_lblDiscoConMs.gridx = 1;
		gbc_lblDiscoConMs.gridy = 0;
		contentPane.add(lblDiscoConMs, gbc_lblDiscoConMs);

		txtArtista = new JTextField();
		GridBagConstraints gbc_txtArtista = new GridBagConstraints();
		gbc_txtArtista.insets = new Insets(0, 0, 5, 5);
		gbc_txtArtista.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtArtista.gridx = 0;
		gbc_txtArtista.gridy = 1;
		contentPane.add(txtArtista, gbc_txtArtista);
		txtArtista.setColumns(10);

		txtDisco = new JTextField();
		GridBagConstraints gbc_txtDisco = new GridBagConstraints();
		gbc_txtDisco.insets = new Insets(0, 0, 5, 0);
		gbc_txtDisco.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDisco.gridx = 1;
		gbc_txtDisco.gridy = 1;
		contentPane.add(txtDisco, gbc_txtDisco);
		txtDisco.setColumns(10);

		btnAgregar = new JButton("Agregar");

		GridBagConstraints gbc_btnAgregar = new GridBagConstraints();
		gbc_btnAgregar.insets = new Insets(0, 0, 5, 0);
		gbc_btnAgregar.gridwidth = 2;
		gbc_btnAgregar.gridx = 0;
		gbc_btnAgregar.gridy = 2;
		contentPane.add(btnAgregar, gbc_btnAgregar);

		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 3;
		contentPane.add(scrollPane, gbc_scrollPane);

		txtArtistaDisco = new JTextPane();
		txtArtistaDisco.setEditable(false);
		scrollPane.setViewportView(txtArtistaDisco);

		lblMensaje = new JLabel(" ");
		GridBagConstraints gbc_lblMensaje = new GridBagConstraints();
		gbc_lblMensaje.gridwidth = 2;
		gbc_lblMensaje.insets = new Insets(0, 0, 0, 5);
		gbc_lblMensaje.gridx = 0;
		gbc_lblMensaje.gridy = 4;
		contentPane.add(lblMensaje, gbc_lblMensaje);
	}

}
