package text;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
public class J_Button2 extends JFrame{
	public J_Button2()
	{
		super("�����¼�����");
		Container c = getContentPane();
		JButton b = new JButton("����0��");
		b.addActionListener(new ActionListener()
		{
			int m_count = 0;
			
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();
				b.setText("����" + (++m_count) + "��");
			}
		}
	);
	
	c.add(b, BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		J_Button2 app = new J_Button2();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(100, 80);
		app.setVisible(true);// TODO Auto-generated method stub

	}

}
