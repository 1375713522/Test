package temp;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.Book;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.ArrayList;
import java.util.List;

public class PrintOpera implements Printable{
	
	private List<String>question =new ArrayList<String>();
	
	private List<Float>answer = new ArrayList<Float>();
	
		
	@Override
	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex)throws PrinterException {
		
		
		question =DBUtils.getQuestion();
		answer = DBUtils.getAnswer();
		
		int page = question.size()/50+1;
		if(question.size()%50==0)page=question.size()/50;
		
		if(pageIndex>=page)return Printable.NO_SUCH_PAGE;
		
		Graphics2D g2 =(Graphics2D)graphics;
		
		g2.setColor(Color.black);
		
		drawCurrentPageText(g2,pageFormat,pageIndex);
		
		return Printable.PAGE_EXISTS;
	}
	
	private void drawCurrentPageText(Graphics2D g2,PageFormat pageFormat ,int page){
		double x = pageFormat.getImageableX();
		double y = pageFormat.getImageableY();
		
		g2.setFont(new Font("新宋体",Font.PLAIN,7));
		String [][] str = getDrawText();
		int i=0;
		while(i<50){
			y+=16;
			g2.drawString(str[page][i] , (float) x, (float)(y));
			i++;
		}

	}
	
	public String[][] getDrawText(){
		
		int page = question.size()/50+1;
		if(question.size()%50==0)page=question.size()/50;
		int tp=0;
		int total = question.size();
		
		String str[][] = new String[page][50];
		
		
		for(int i=0;i<total;i++){
			str[tp][i%50]=new String("第"+(i+1)+"题"+question.get(i)+"----------答案为"+answer.get(i));
			if((i+1)%50==0)tp++;
		}
		if(question.size()!=page*50){
			for(int i=total;i<page*50;i++){
				str[tp][i%50]=new String("");
			}
		}
		return str;
		
	}
	
	public void write() {
		
		PrinterJob job = PrinterJob.getPrinterJob();

		
		job.setPrintable(new PrintOpera());
		
		try{
			boolean bool = job.printDialog();
			if(bool){
				job.print();
			}else{
				job.cancel();
			}
		}catch(PrinterException e){
			e.printStackTrace();
		}
	}	
	
}
