package temp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Stack;

public class Topic{
	
	private Contact contact = null;
	private static Map<Integer,Character>symB = new HashMap<Integer,Character>();
	
	private  Map<Integer,Integer>braLeft = new HashMap<Integer,Integer>();
	private  Map<Integer,Integer>braRight = new HashMap<Integer,Integer>();	
	private static Random random = new Random();
	private  int digitalNum;			//数字个数
	private  Object [] digitalNr = new Object [50]; 
	private  char [] symArr = new char [50-1];		//符号的值
	private  int symNum;
	private  int braNum;								//括号个数
	
	private List<String> list = new ArrayList<String>();
	
	public void setContact(Contact con){
		this.contact = con;
	}
	
	public Topic(){}
	
	public Topic(Contact con){
		this.contact= con;
	}
	
	private void numGene(){
		if(contact.isDecRule())return ;
		digitalNum = (int)(Math.random()*10)+2;
		
		for(int i = 0; i < digitalNum; i++){
			digitalNr[i] = (int)(Math.random()*contact.getMaxRule());
		}
	}
	
	private void numFGene(){
		if(!contact.isDecRule())return ;
		digitalNum = (int)(Math.random()*10)+2;
		
		for(int i = 0; i < digitalNum; i++){
			digitalNr[i] = (float)(Math.random()*contact.getMaxRule());
		}
	}
	
	private void symGene(){
		symB.clear();
		symNum=0;
		if(contact.isAddRule())
			symB.put(symNum++, '+');
		if(contact.isSubRule())
			symB.put(symNum++, '-');
		if(contact.isMulRule())
			symB.put(symNum++, '*');
		if(contact.isDivRule())
			symB.put(symNum++, '/');
		
		for(int j = 0; j<digitalNum-1; j++){
			symArr[j]=symB.get(random.nextInt(symNum));
		}
	}
	
	private void braGene(){
		braLeft.clear();
		braRight.clear();
		if(!contact.isBraRule())return ;
		braNum = random.nextInt(digitalNum-1);
		int braLPostion,braRPostion;
		
		for(int i = 0; i<braNum ; i++){
			braLPostion = random.nextInt(digitalNum-1);
			while(braRight.get(braLPostion)!=null){	
				braLPostion = random.nextInt(digitalNum-1);
			}
			braLeft.put(braLPostion,braLeft.get(braLPostion)==null?1:(braLeft.get(braLPostion)+1));
			
			braRPostion = random.nextInt(digitalNum-1-braLPostion)+braLPostion+1;
			
			while(braLeft.get(braRPostion)!=null){
				braRPostion = random.nextInt(digitalNum-1-braLPostion)+braLPostion+1;
			}
			
			braRight.put(braRPostion, braRight.get(braRPostion)==null?1:(braRight.get(braRPostion)+1));
		}
		Stack<Integer> sta = new Stack<Integer>();
		sta.clear();
		int ans = -1;
		for(int i = 0; i<digitalNum ;i++){
			Integer left = braLeft.get(i);
			while(left!=null &&left!=0){
				sta.push(i);
				left--;
			}
			Integer right = braRight.get(i);
			while(right!=null&&right!=0){
				int cnt = sta.peek()*digitalNum+i;
				if(cnt==ans){
					braRight.put(i,braRight.get(i)-1);
					braLeft.put(sta.peek(),braLeft.get(sta.peek())-1);
				}
				sta.pop();
				ans=cnt;
				right--;
			}
		}
		if(ans == digitalNum-1){
			braLeft.put(0, braLeft.get(0)-1);
			braRight.put(digitalNum-1,braRight.get(digitalNum-1)-1);
		}
		
		
	}
	
	private String assGene(){
			StringBuffer sb = new StringBuffer();
			for(int i = 0 ;i<digitalNum; i++){
				while(braLeft.get(i)!=null&&braLeft.get(i)!=0){
					sb.append("(");
					braLeft.put(i,braLeft.get(i)-1);
				}
				sb.append(digitalNr[i]);
				
				while(braRight.get(i)!=null&&braRight.get(i)!=0){
					sb.append(")");
					braRight.put(i, braRight.get(i)-1);
				}
				if(i!=digitalNum-1){
					sb.append(symArr[i]);
					if(symArr[i]=='/'){
						while(Math.abs(Float.parseFloat(digitalNr[i+1].toString()))<10e-6){
							if(contact.isDecRule())
								digitalNr[i+1] = (float)(Math.random()*contact.getMaxRule());
							else 
								digitalNr[i+1] = (int)(Math.random()*contact.getMaxRule());
							
						}
					}
				}
			}
			return sb.toString();		
	}
	
	private void NumMethod(){
		list.clear();
		for(int i= 0;i <contact.getNumRule();i++){
			numGene();
			numFGene();
			symGene();
			braGene();
			list.add(assGene());
		}
	}
	
	public List<String> UseMethod(){
		NumMethod();
		return list;
	}
	
	private void OneMethod(){
		numGene();
		numFGene();
		symGene();
		braGene();
	}
	
	public String getOne(){
		OneMethod();
		return assGene();
	}
	
	
}