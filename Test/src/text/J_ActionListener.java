package text;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
public class J_ActionListener implements ActionListener{
	int m_count = 0;
	
	public void actionPerformed(ActionEvent e)
	{
		JButton b= (JButton)e.getSource();
		b.setText("����" + (++m_count) + "��");		
	}
}

//public class J_Button1 extends JFrame
//{
//	public J_Button1()
//	{
//		super("�����¼�����");
//		Container c = getContentPane();
//		JButton b = new JButton("����0��");
//		J_ActionListener a = new J_ActionListener();
//		b.addActionListener(a);
//		c.add(b, BorderLayout.CENTER);
//	}
//	
//	public static void main(String args[])
//	{
//		J_Button1 app = new J_Button1();
//		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		app.setSize(100, 80);
//		app.setVisible(true);
//	}
//}
