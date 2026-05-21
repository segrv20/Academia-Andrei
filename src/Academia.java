import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.*;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Academia extends JFrame{
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JRadioButton radioButton1;
    private JTextField textField;
    private JTextField textField_1;
    private JRadioButton rdbtn2xPS;
    private JRadioButton rdbtnx3xPS;
    private JRadioButton rdbtn5xPS;
    private JRadioButton rdbtnMensal;
    private JRadioButton rdbtnSemestral;
    private JRadioButton rdbtnAnual;
    private JRadioButton rdbtnBasico;
    private JRadioButton rdbtnIntermediario;
    private JRadioButton rdbtnPremium;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;
    private JLabel lblNewLabel_3;
    private JLabel lblNewLabel_4;
    private JButton btnNewButton;
    private JLabel lblNewLabel_5;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Academia frame = new Academia();
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
    public Academia() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 574, 252);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        GridBagLayout gbl_contentPane = new GridBagLayout();
        gbl_contentPane.columnWidths = new int[]{142, 152, 129, 114, 0};
        gbl_contentPane.rowHeights = new int[]{20, 0, 0, 0, 0, 0, 32, 0};
        gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
        gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        contentPane.setLayout(gbl_contentPane);

        JLabel lblCadastroDeCliente = new JLabel("Cadastro de Cliente");
        lblCadastroDeCliente.setFont(new Font("Tahoma", Font.PLAIN, 19));
        GridBagConstraints gbc_lblCadastroDeCliente = new GridBagConstraints();
        gbc_lblCadastroDeCliente.gridwidth = 2;
        gbc_lblCadastroDeCliente.insets = new Insets(0, 0, 5, 5);
        gbc_lblCadastroDeCliente.anchor = GridBagConstraints.NORTH;
        gbc_lblCadastroDeCliente.gridx = 1;
        gbc_lblCadastroDeCliente.gridy = 0;
        contentPane.add(lblCadastroDeCliente, gbc_lblCadastroDeCliente);

        lblNewLabel_4 = new JLabel("Nome:");
        GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
        gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
        gbc_lblNewLabel_4.gridx = 0;
        gbc_lblNewLabel_4.gridy = 1;
        contentPane.add(lblNewLabel_4, gbc_lblNewLabel_4);

        textField = new JTextField();
        GridBagConstraints gbc_textField = new GridBagConstraints();
        gbc_textField.gridwidth = 3;
        gbc_textField.insets = new Insets(0, 0, 5, 0);
        gbc_textField.fill = GridBagConstraints.HORIZONTAL;
        gbc_textField.gridx = 1;
        gbc_textField.gridy = 1;
        contentPane.add(textField, gbc_textField);
        textField.setColumns(10);

        lblNewLabel_3 = new JLabel("Telefone:");
        GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
        gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
        gbc_lblNewLabel_3.gridx = 0;
        gbc_lblNewLabel_3.gridy = 2;
        contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);

        textField_1 = new JTextField();
        GridBagConstraints gbc_textField_1 = new GridBagConstraints();
        gbc_textField_1.gridwidth = 3;
        gbc_textField_1.insets = new Insets(0, 0, 5, 0);
        gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
        gbc_textField_1.gridx = 1;
        gbc_textField_1.gridy = 2;
        contentPane.add(textField_1, gbc_textField_1);
        textField_1.setColumns(10);

        lblNewLabel_2 = new JLabel("Tipo de plano:");
        GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
        gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
        gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel_2.gridx = 0;
        gbc_lblNewLabel_2.gridy = 3;
        contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);

        rdbtnBasico = new JRadioButton("Básico");
        GridBagConstraints gbc_rdbtnBasico = new GridBagConstraints();
        gbc_rdbtnBasico.anchor = GridBagConstraints.WEST;
        gbc_rdbtnBasico.insets = new Insets(0, 0, 5, 5);
        gbc_rdbtnBasico.gridx = 1;
        gbc_rdbtnBasico.gridy = 3;
        contentPane.add(rdbtnBasico, gbc_rdbtnBasico);

        rdbtnIntermediario = new JRadioButton("Intermediário");
        GridBagConstraints gbc_rdbtnIntermediario = new GridBagConstraints();
        gbc_rdbtnIntermediario.anchor = GridBagConstraints.WEST;
        gbc_rdbtnIntermediario.insets = new Insets(0, 0, 5, 5);
        gbc_rdbtnIntermediario.gridx = 2;
        gbc_rdbtnIntermediario.gridy = 3;
        contentPane.add(rdbtnIntermediario, gbc_rdbtnIntermediario);

        rdbtnPremium = new JRadioButton("Premium pro max 15");
        GridBagConstraints gbc_rdbtnPremium = new GridBagConstraints();
        gbc_rdbtnPremium.anchor = GridBagConstraints.WEST;
        gbc_rdbtnPremium.insets = new Insets(0, 0, 5, 0);
        gbc_rdbtnPremium.gridx = 3;
        gbc_rdbtnPremium.gridy = 3;
        contentPane.add(rdbtnPremium, gbc_rdbtnPremium);

        lblNewLabel_1 = new JLabel("Duração");
        GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
        gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
        gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel_1.gridx = 0;
        gbc_lblNewLabel_1.gridy = 4;
        contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);

        rdbtnMensal = new JRadioButton("Mensal");
        GridBagConstraints gbc_rdbtnMensal = new GridBagConstraints();
        gbc_rdbtnMensal.anchor = GridBagConstraints.WEST;
        gbc_rdbtnMensal.insets = new Insets(0, 0, 5, 5);
        gbc_rdbtnMensal.gridx = 1;
        gbc_rdbtnMensal.gridy = 4;
        contentPane.add(rdbtnMensal, gbc_rdbtnMensal);

        rdbtnSemestral = new JRadioButton("Semestral");
        GridBagConstraints gbc_rdbtnSemestral = new GridBagConstraints();
        gbc_rdbtnSemestral.anchor = GridBagConstraints.WEST;
        gbc_rdbtnSemestral.insets = new Insets(0, 0, 5, 5);
        gbc_rdbtnSemestral.gridx = 2;
        gbc_rdbtnSemestral.gridy = 4;
        contentPane.add(rdbtnSemestral, gbc_rdbtnSemestral);

        rdbtnAnual = new JRadioButton("Anual");
        GridBagConstraints gbc_rdbtnAnual = new GridBagConstraints();
        gbc_rdbtnAnual.anchor = GridBagConstraints.WEST;
        gbc_rdbtnAnual.insets = new Insets(0, 0, 5, 0);
        gbc_rdbtnAnual.gridx = 3;
        gbc_rdbtnAnual.gridy = 4;
        contentPane.add(rdbtnAnual, gbc_rdbtnAnual);

        lblNewLabel = new JLabel("Frequência Semana:");
        GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
        gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
        gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel.gridx = 0;
        gbc_lblNewLabel.gridy = 5;
        contentPane.add(lblNewLabel, gbc_lblNewLabel);

        rdbtn2xPS = new JRadioButton("2x por semana");
        GridBagConstraints gbc_rdbtn2xPS = new GridBagConstraints();
        gbc_rdbtn2xPS.anchor = GridBagConstraints.WEST;
        gbc_rdbtn2xPS.insets = new Insets(0, 0, 5, 5);
        gbc_rdbtn2xPS.gridx = 1;
        gbc_rdbtn2xPS.gridy = 5;
        contentPane.add(rdbtn2xPS, gbc_rdbtn2xPS);

        rdbtnx3xPS = new JRadioButton("3x por semana");
        GridBagConstraints gbc_rdbtnx3xPS = new GridBagConstraints();
        gbc_rdbtnx3xPS.anchor = GridBagConstraints.WEST;
        gbc_rdbtnx3xPS.insets = new Insets(0, 0, 5, 5);
        gbc_rdbtnx3xPS.gridx = 2;
        gbc_rdbtnx3xPS.gridy = 5;
        contentPane.add(rdbtnx3xPS, gbc_rdbtnx3xPS);

        rdbtn5xPS = new JRadioButton("5x por semana");
        GridBagConstraints gbc_rdbtn5xPS = new GridBagConstraints();
        gbc_rdbtn5xPS.anchor = GridBagConstraints.WEST;
        gbc_rdbtn5xPS.insets = new Insets(0, 0, 5, 0);
        gbc_rdbtn5xPS.gridx = 3;
        gbc_rdbtn5xPS.gridy = 5;
        contentPane.add(rdbtn5xPS, gbc_rdbtn5xPS);

        btnNewButton = new JButton("Calcular");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double valorBase = 0;
                double valorFinal;
                boolean Basico = rdbtnBasico.isSelected();
                boolean Intermediario = rdbtnIntermediario.isSelected();
                boolean Premium = rdbtnPremium.isSelected();

                boolean TresXPS = rdbtnx3xPS.isSelected();
                boolean CincoXPS = rdbtn5xPS.isSelected();

                boolean Semestral = rdbtnSemestral.isSelected();
                boolean Anual = rdbtnAnual.isSelected();

                CustoTotal custo = new CustoTotal(Basico,Intermediario,Premium,TresXPS,CincoXPS,Semestral,Anual);

                valorBase = custo.getCustoPlano();

                valorBase += valorBase * custo.getCustoFrequencia();

                valorFinal = valorBase;

                valorFinal -= valorFinal * custo.getPromoDuracao();

                lblNewLabel_5.setText("Valor Final: R$ " + String.format("%.2f", valorFinal));

            }

        });
        GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
        gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
        gbc_btnNewButton.gridx = 1;
        gbc_btnNewButton.gridy = 6;
        contentPane.add(btnNewButton, gbc_btnNewButton);

        lblNewLabel_5 = new JLabel("Valor Final:");
        GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
        gbc_lblNewLabel_5.insets = new Insets(0, 0, 0, 5);
        gbc_lblNewLabel_5.gridx = 2;
        gbc_lblNewLabel_5.gridy = 6;
        contentPane.add(lblNewLabel_5, gbc_lblNewLabel_5);


}}
