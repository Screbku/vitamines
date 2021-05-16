import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	
	Object[][] obj;
	
	Service serv = new Service();
	
	private static final int NUMBER_COLUMN = 3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public Main() throws IOException {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		add_controls();
	}

	private void add_controls() {
		// TODO Auto-generated method stub
		JComboBox in = new JComboBox();
		in.setModel(new DefaultComboBoxModel(new String[] {"A", "B1", "B2", "B3", "B5", "B6", "B9", "C", "D", "E"}));
		in.setBounds(250, 11, 174, 22);
		contentPane.add(in);
		
		JLabel lblNewLabel = new JLabel("\u0421 \u043A\u0430\u043A\u0438\u043C \u0432\u0438\u0442\u0430\u043C\u0438\u043D\u043E\u043C \u0441\u043E\u0441\u0442\u0430\u0432\u0438\u0442\u044C \u0440\u0430\u0446\u0438\u043E\u043D?");
		lblNewLabel.setBounds(10, 15, 230, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Получить!");
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					
					//new Service(in.getSelectedItem()+"").start().print();
					Map<String, Integer> rateddish = serv.start(in.getSelectedItem()+"");
					String h = serv.print(rateddish);
					String rows[] = h.split("\r\n");
					obj = new Object[rows.length][NUMBER_COLUMN];
					for(int i = 0; i < rows.length; i++) {
						obj[i] = new Object[3];
						String[] tmp = rows[i].split("~");
						for(int r = 0; r < NUMBER_COLUMN; r++) {
							obj[i][r] = tmp[r];
						}
					}
					
					print_buttons();
					
					setContentPane(contentPane);
					
					add_controls();
					
					//repaint();
					revalidate();
					//repaint();
					
					//setContentPane(contentPane);
					
				} catch (IOException e) {
					//out.setText(e.getMessage());
				}
			}
		});
		btnNewButton.setBounds(310, 44, 114, 23);
		contentPane.add(btnNewButton);
		
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Тут могла быть НАША реклама...");
		lblNewLabel_1.setBounds(473, 15, 301, 14);
		contentPane.add(lblNewLabel_1);
	}

	protected void print_buttons() {
		// TODO Auto-generated method stub
		contentPane = new JPanel();
		contentPane.setLayout(null);
		
		int WEIGHT = 300;
		int HEIGHT = 40;
		
		String old = null;
		
		for(int x = 0; x < obj.length; x++) {
			for(int y = 0; y < obj[0].length; y++) {
				if(y==1&&x!=0) {
					JButton tmp = new JButton("Хочу рецепт "+old);
					MyActionListener myActionListener = new MyActionListener(""+obj[x][y]);
					tmp.addActionListener(myActionListener);
					tmp.setSize(WEIGHT-5, HEIGHT-5);
					
					tmp.setLocation(30+y*WEIGHT,70+x*HEIGHT);
					
					//jb[x][y] = tmp;
					
					contentPane.add(tmp);
				}else {
					old = ""+obj[x][y];
					JLabel tmp = new JLabel(obj[x][y]+"");
					tmp.setBounds(30+y*WEIGHT,70+x*HEIGHT,WEIGHT-5,HEIGHT-5);
					contentPane.add(tmp);
				}
				
				
				
			}
		}
		
		
	}
}

class MyActionListener implements ActionListener {
	
	String s;
	
	public MyActionListener(String s) {
		this.s=s.trim();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		// System.out.println("иду на "+s);
		try {
			Desktop.getDesktop().browse(new URI(""+s));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}