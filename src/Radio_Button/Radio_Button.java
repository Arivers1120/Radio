package Radio_Button;



	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.JRadioButton;
	import javax.swing.ButtonGroup;
////////////////////////////////////////////////////////////
///////////// Arnold Rivers	/////////////////////////////////
////////////////////////////////////////////////////////////
	///////////////////////////////
	///////////////////////////////
	//////////////////////////////
	public class Radio_Button {

		private JFrame frame;
		private final ButtonGroup buttonGroup = new ButtonGroup();

		
		public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
				public void run() {
				try {
				Radio_Button window = new Radio_Button();
					window.frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}}});}

		
				public Radio_Button() {
					initialize();}

		
		private void initialize() {
			frame = new JFrame();
			frame.setBounds(101, 101, 458, 301);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setBounds(115, 54, 98, 73);
			
			JRadioButton Mediumbutton = new JRadioButton("MEDIUM");
			
			buttonGroup.add(Mediumbutton);
			Mediumbutton.setBounds(0, 26, 93, 23);
			panel.add(Mediumbutton);
			
			JRadioButton Largebutton = new JRadioButton("LARGE");
			
			buttonGroup.add(Largebutton);
			Largebutton.setBounds(0, 52, 93, 23);
			panel.add(Largebutton);
			
			frame.getContentPane().add(panel);
			panel.setLayout(null);
			
			JRadioButton Smallbutton = new JRadioButton("SMALL");
			buttonGroup.add(Smallbutton);
			
			Smallbutton.setBounds(1, 1, 93, 23);
			panel.add(Smallbutton);
			Smallbutton.setSelected(true);
			
			
			
		}
	}

