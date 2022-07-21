package br.com.lojacalcados.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;

public class TelaFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField txtNomeUsuario;
	private JTextField txtSenhaUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFuncionario frame = new TelaFuncionario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaFuncionario() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1106, 771);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlTitulo = new JPanel();
		pnlTitulo.setLayout(null);
		pnlTitulo.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlTitulo.setBackground(new Color(135, 206, 250));
		pnlTitulo.setBounds(10, 11, 1070, 150);
		contentPane.add(pnlTitulo);
		
		JLabel lblicone = new JLabel("");
		lblicone.setHorizontalAlignment(SwingConstants.CENTER);
		lblicone.setIcon(new ImageIcon("C:\\Users\\gustavo.hsfernandes3.SENACEDU\\Documents\\LojadeCalcados\\LojaCalcados\\imagens\\funcionarios(1).png"));
		lblicone.setBounds(10, 11, 139, 139);
		pnlTitulo.add(lblicone);
		
		JLabel lblTituloTelaF = new JLabel("Gerenciar Funcion\u00E1rios");
		lblTituloTelaF.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblTituloTelaF.setBounds(195, 41, 312, 60);
		pnlTitulo.add(lblTituloTelaF);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setIcon(new ImageIcon("C:\\Users\\gustavo.hsfernandes3.SENACEDU\\Documents\\LojadeCalcados\\LojaCalcados\\imagens\\salvar-arquivo.png"));
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSalvar.setBackground(Color.WHITE);
		btnSalvar.setBounds(688, 11, 158, 128);
		pnlTitulo.add(btnSalvar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setIcon(new ImageIcon("C:\\Users\\gustavo.hsfernandes3.SENACEDU\\Documents\\LojadeCalcados\\LojaCalcados\\imagens\\lupa.png"));
		btnConsultar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnConsultar.setBackground(Color.WHITE);
		btnConsultar.setBounds(885, 11, 158, 128);
		pnlTitulo.add(btnConsultar);
		
		JPanel pnldp = new JPanel();
		pnldp.setLayout(null);
		pnldp.setBackground(Color.WHITE);
		pnldp.setBounds(10, 172, 514, 115);
		contentPane.add(pnldp);
		
		JLabel lblNomeCliente = new JLabel("Nome do Funcion\u00E1rio");
		lblNomeCliente.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNomeCliente.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNomeCliente.setBounds(10, 11, 145, 14);
		pnldp.add(lblNomeCliente);
		
		JLabel lblcpf = new JLabel("CPF");
		lblcpf.setHorizontalAlignment(SwingConstants.RIGHT);
		lblcpf.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblcpf.setBounds(109, 36, 46, 14);
		pnldp.add(lblcpf);
		
		JLabel lblDataNascimento = new JLabel("Data nascimento");
		lblDataNascimento.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDataNascimento.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblDataNascimento.setBounds(10, 61, 145, 14);
		pnldp.add(lblDataNascimento);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSexo.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblSexo.setBounds(73, 88, 82, 14);
		pnldp.add(lblSexo);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(165, 8, 339, 20);
		pnldp.add(textField);
		
		JFormattedTextField txtCpf = new JFormattedTextField((AbstractFormatter) null);
		txtCpf.setBounds(165, 33, 339, 20);
		pnldp.add(txtCpf);
		
		JFormattedTextField txtDataNascimento = new JFormattedTextField((AbstractFormatter) null);
		txtDataNascimento.setBounds(165, 60, 162, 20);
		pnldp.add(txtDataNascimento);
		
		JComboBox cboSexo = new JComboBox();
		cboSexo.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Feminino", "Outros"}));
		cboSexo.setFont(new Font("Arial", Font.PLAIN, 16));
		cboSexo.setBounds(165, 85, 162, 22);
		pnldp.add(cboSexo);
		
		JPanel pnlEndereco = new JPanel();
		pnlEndereco.setLayout(null);
		pnlEndereco.setBackground(Color.WHITE);
		pnlEndereco.setBounds(10, 310, 1070, 115);
		contentPane.add(pnlEndereco);
		
		JLabel lblTipo = new JLabel("Tipo Logradouro");
		lblTipo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTipo.setFont(new Font("Arial", Font.PLAIN, 13));
		lblTipo.setBounds(10, 11, 101, 14);
		pnlEndereco.add(lblTipo);
		
		JLabel lblLogradouro = new JLabel("Logradouro");
		lblLogradouro.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLogradouro.setFont(new Font("Arial", Font.PLAIN, 13));
		lblLogradouro.setBounds(10, 36, 101, 14);
		pnlEndereco.add(lblLogradouro);
		
		JLabel lblNumero = new JLabel("N\u00FAmero");
		lblNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumero.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNumero.setBounds(10, 61, 101, 14);
		pnlEndereco.add(lblNumero);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCep.setFont(new Font("Arial", Font.PLAIN, 13));
		lblCep.setBounds(10, 86, 101, 14);
		pnlEndereco.add(lblCep);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBairro.setFont(new Font("Arial", Font.PLAIN, 13));
		lblBairro.setBounds(525, 86, 101, 14);
		pnlEndereco.add(lblBairro);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCidade.setFont(new Font("Arial", Font.PLAIN, 13));
		lblCidade.setBounds(525, 61, 101, 14);
		pnlEndereco.add(lblCidade);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEstado.setFont(new Font("Arial", Font.PLAIN, 13));
		lblEstado.setBounds(525, 36, 101, 14);
		pnlEndereco.add(lblEstado);
		
		JLabel lblCompleto = new JLabel("Complemento");
		lblCompleto.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCompleto.setFont(new Font("Arial", Font.PLAIN, 13));
		lblCompleto.setBackground(Color.WHITE);
		lblCompleto.setBounds(525, 11, 101, 14);
		pnlEndereco.add(lblCompleto);
		
		JComboBox cboLogradouro = new JComboBox();
		cboLogradouro.setBounds(133, 6, 382, 22);
		pnlEndereco.add(cboLogradouro);
		
		JFormattedTextField txtCep = new JFormattedTextField((AbstractFormatter) null);
		txtCep.setBounds(133, 86, 382, 20);
		pnlEndereco.add(txtCep);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(133, 34, 382, 20);
		pnlEndereco.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(133, 60, 382, 20);
		pnlEndereco.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(667, 8, 382, 20);
		pnlEndereco.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(667, 33, 382, 20);
		pnlEndereco.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(667, 58, 382, 20);
		pnlEndereco.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(667, 83, 382, 20);
		pnlEndereco.add(textField_6);
		
		JPanel p = new JPanel();
		p.setLayout(null);
		p.setBackground(Color.WHITE);
		p.setBounds(541, 172, 539, 115);
		contentPane.add(p);
		
		JLabel lblTelefoneResidencial = new JLabel("Telefone Residencial");
		lblTelefoneResidencial.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefoneResidencial.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblTelefoneResidencial.setBounds(10, 11, 145, 14);
		p.add(lblTelefoneResidencial);
		
		JLabel lblTelefoneCelular = new JLabel("Telefone Celular");
		lblTelefoneCelular.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefoneCelular.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblTelefoneCelular.setBounds(10, 36, 145, 14);
		p.add(lblTelefoneCelular);
		
		JLabel lblTelefoneComercial = new JLabel("Telefone Comercial");
		lblTelefoneComercial.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefoneComercial.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblTelefoneComercial.setBounds(10, 62, 145, 14);
		p.add(lblTelefoneComercial);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblEmail.setBounds(10, 90, 145, 14);
		p.add(lblEmail);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(165, 88, 339, 20);
		p.add(textField_7);
		
		JFormattedTextField txtTelefoneResidencial = new JFormattedTextField((AbstractFormatter) null);
		txtTelefoneResidencial.setBounds(165, 9, 339, 20);
		p.add(txtTelefoneResidencial);
		
		JFormattedTextField txtTelefoneCelular = new JFormattedTextField((AbstractFormatter) null);
		txtTelefoneCelular.setBounds(165, 34, 339, 20);
		p.add(txtTelefoneCelular);
		
		JFormattedTextField txtTelefoneComercial = new JFormattedTextField((AbstractFormatter) null);
		txtTelefoneComercial.setBounds(165, 60, 339, 20);
		p.add(txtTelefoneComercial);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 563, 1070, 158);
		contentPane.add(scrollPane);
		
		JPanel pnlEndereco_1 = new JPanel();
		pnlEndereco_1.setLayout(null);
		pnlEndereco_1.setBackground(Color.WHITE);
		pnlEndereco_1.setBounds(10, 436, 1070, 115);
		contentPane.add(pnlEndereco_1);
		
		JLabel lblNomeUsuario = new JLabel("Nome de Usuario");
		lblNomeUsuario.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblNomeUsuario.setBounds(74, 11, 218, 40);
		pnlEndereco_1.add(lblNomeUsuario);
		
		JLabel lblSenhaUsuario = new JLabel("Senha Usuario");
		lblSenhaUsuario.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblSenhaUsuario.setBounds(396, 11, 218, 40);
		pnlEndereco_1.add(lblSenhaUsuario);
		
		JComboBox cboNivelAcesso = new JComboBox();
		cboNivelAcesso.setFont(new Font("Arial", Font.PLAIN, 16));
		cboNivelAcesso.setModel(new DefaultComboBoxModel(new String[] {"Comum", "privil\u00E9gio", "Root"}));
		cboNivelAcesso.setBounds(720, 51, 181, 40);
		pnlEndereco_1.add(cboNivelAcesso);
		
		JLabel lblNivelAcesso = new JLabel("Nivel de Acesso");
		lblNivelAcesso.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblNivelAcesso.setBounds(718, 11, 218, 40);
		pnlEndereco_1.add(lblNivelAcesso);
		
		txtNomeUsuario = new JTextField();
		txtNomeUsuario.setBounds(74, 61, 181, 20);
		pnlEndereco_1.add(txtNomeUsuario);
		txtNomeUsuario.setColumns(10);
		
		txtSenhaUsuario = new JTextField();
		txtSenhaUsuario.setColumns(10);
		txtSenhaUsuario.setBounds(396, 61, 181, 20);
		pnlEndereco_1.add(txtSenhaUsuario);
	}
}
