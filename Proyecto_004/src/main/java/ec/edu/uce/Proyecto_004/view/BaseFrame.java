package ec.edu.uce.Proyecto_004.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ec.edu.uce.Proyecto_004.controller.Container;
import ec.edu.uce.Proyecto_004.models.Students;
import ec.edu.uce.Proyecto_004.HibernateDao;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BaseFrame extends JFrame {
	
	private Container container;
	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtLname;
	JComboBox<Integer> cboxEdad;
	private JTextField txtID;
	
	

//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					BaseFrame frame = new BaseFrame();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public BaseFrame() {
		setTitle("INSTITUTE");
		
		container = new Container();
		container.registerDao(Students.class, new HibernateDao<>(Students.class));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 11, 786, 552);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("Nombre");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBounds(84, 33, 143, 29);
		panel.add(lblName);
		
		cboxEdad = new JComboBox<Integer>();
		for (int i = 10; i <= 60; i++) {
		    cboxEdad.addItem(i);
		}
		cboxEdad.setBounds(279, 176, 94, 29);
		panel.add(cboxEdad);
		
		txtName = new JTextField();
		txtName.setBounds(279, 35, 281, 28);
		panel.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblLname = new JLabel("Apellido");
		lblLname.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLname.setBounds(84, 97, 143, 29);
		panel.add(lblLname);
		
		txtLname = new JTextField();
		txtLname.setColumns(10);
		txtLname.setBounds(279, 98, 281, 28);
		panel.add(txtLname);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEdad.setBounds(84, 174, 143, 29);
		panel.add(lblEdad);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				container.createAndSaveEntity(Students.class, new Students(txtName.getText(), txtLname.getText(), (int) cboxEdad.getSelectedItem()));
	
			}
		});
		btnAgregar.setFont(new Font("Myanmar Text", Font.BOLD, 14));
		btnAgregar.setBounds(60, 287, 163, 45);
		panel.add(btnAgregar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int id ;
		        Students student = container.getEntityById(Students.class, Integer.parseInt(txtID.getText()));
				if (student != null) {
		            txtName.setText(student.getName());
		            txtLname.setText(student.getLastName());
		            cboxEdad.setSelectedItem(student.getAge());
		        }
				
			}
		});
		btnConsultar.setFont(new Font("Myanmar Text", Font.BOLD, 14));
		btnConsultar.setBounds(241, 287, 163, 45);
		panel.add(btnConsultar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (txtName != null && txtLname != null && cboxEdad != null && txtID != null) {
		            container.updateEntity(Students.class, new Students(Integer.parseInt(txtID.getText()), txtName.getText(), txtLname.getText(), (int) cboxEdad.getSelectedItem()));
		        }
				
			}
		});
		btnModificar.setFont(new Font("Myanmar Text", Font.BOLD, 14));
		btnModificar.setBounds(424, 287, 163, 45);
		panel.add(btnModificar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int id ;
		        container.deleteEntity(Students.class, Integer.parseInt(txtID.getText()));
				
			}
		});
		btnBorrar.setFont(new Font("Myanmar Text", Font.BOLD, 14));
		btnBorrar.setBounds(600, 287, 163, 45);
		panel.add(btnBorrar);
		
		JLabel lblConsultasId = new JLabel("Consultas ID");
		lblConsultasId.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblConsultasId.setBounds(84, 423, 143, 29);
		panel.add(lblConsultasId);
		
		txtID = new JTextField();
		txtID.setColumns(10);
		txtID.setBounds(279, 423, 281, 28);
		panel.add(txtID);
		
	}
}
