import java.awt.Desktop;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
	
	Object[][] objects_in_table;
	
	Service service = new Service();
	
	private static final int number_column = 3;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				Main frame = new Main();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

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
		JComboBox<String> in = new JComboBox<>();
		in.setModel(new DefaultComboBoxModel<>(new String[] {"A", "B1", "B2", "B3", "B5", "B6", "B9", "C", "D", "E"}));
		in.setBounds(250, 11, 174, 22);
		contentPane.add(in);
		
		JLabel question_Label = new JLabel("\u0421 \u043A\u0430\u043A\u0438\u043C \u0432\u0438\u0442\u0430\u043C\u0438\u043D\u043E\u043C \u0441\u043E\u0441\u0442\u0430\u0432\u0438\u0442\u044C \u0440\u0430\u0446\u0438\u043E\u043D?");
		question_Label.setBounds(10, 15, 230, 14);
		contentPane.add(question_Label);
		
		JButton getButton = new JButton("Получить!");
		getButton.setFont(new Font("Arial Black", Font.PLAIN, 11));
		getButton.addActionListener(arg0 -> {
			try {
				Map<String, Integer> rateddish = service.start((String) in.getSelectedItem());
				String h = service.print(rateddish);
				String[] rows_in_table = h.split("\r\n");
				objects_in_table = new Object[rows_in_table.length][number_column];
				for(int i = 0; i < rows_in_table.length; i++) {
					objects_in_table[i] = new Object[3];
					String[] tmp = rows_in_table[i].split("~");
					System.arraycopy(tmp, 0, objects_in_table[i], 0, number_column);
				}
				print_buttons();
				setContentPane(contentPane);
				add_controls();
				revalidate();
			} catch (IOException ignored) {}
		});
		getButton.setBounds(310, 44, 114, 23);
		contentPane.add(getButton);

		JLabel ad_Label = new JLabel("Здесь могла быть наша реклама...");
		ad_Label.setBounds(473, 15, 301, 14);
		contentPane.add(ad_Label);
	}

	protected void print_buttons() {
		contentPane = new JPanel();
		contentPane.setLayout(null);
		
		int WEIGHT = 300;
		int HEIGHT = 40;
		
		String dish_name = null;
		
		for(int x = 0; x < objects_in_table.length; x++) {
			for(int y = 0; y < objects_in_table[0].length; y++) {
				if(y==1&&x!=0) {
					JButton tmp = new JButton("Хочу рецепт "+dish_name);
					MyActionListener myActionListener = new MyActionListener((String) objects_in_table[x][y]);
					tmp.addActionListener(myActionListener);
					tmp.setSize(WEIGHT-10, HEIGHT-10);
					tmp.setLocation(30+y*WEIGHT,70+x*HEIGHT);
					contentPane.add(tmp);
				}else {
					dish_name = (String) objects_in_table[x][y];
					JLabel tmp = new JLabel((String) objects_in_table[x][y]);
					tmp.setBounds(30+y*WEIGHT,70+x*HEIGHT,WEIGHT-10,HEIGHT-10);
					contentPane.add(tmp);
				}
			}
		}
	}
}

class MyActionListener implements ActionListener {
	String link;
	public MyActionListener(String link) {
		this.link=link.trim();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
			Desktop.getDesktop().browse(new URI(link));
		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}
	}
}