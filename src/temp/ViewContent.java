package temp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ViewContent extends JFrame{
	
	private List<String> list = null;
	
	private int fontsize =30;
	
	private int num ;
	public ViewContent(List<String> lis,int num){
		this.list = lis;
		this.num = num;
	}
	
	
	public ViewContent (){}
	
	public void start(){
		
		final JPanel panel = new JPanel(){
			@Override
			public void paint(Graphics g) {
				super.paint(g);
				g.setFont(new Font("����",Font.BOLD,fontsize));
				g.setColor(Color.BLUE);
				
				
				for(int i = 0,y = 0;i<list.size();i++){
					y+=fontsize*2;
					g.drawString(list.get(i), 0, y);
				}
			}
		};
		
		panel.setPreferredSize(new Dimension(800,fontsize*2*num));
		
		
		//�������
		JScrollPane scrollPane = new JScrollPane(panel);		
		
		
		this.getContentPane().add(scrollPane);
		
		
		//�رհ���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//��������С
		this.setSize(800,800);
		
		//����������
		this.setLocationRelativeTo(null);
		
		//���������ӻ�
		this.setVisible(true);
		
	}
}
