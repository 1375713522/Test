package temp;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Verify {
	
	private List<Float> answer = new ArrayList<Float>();
	
	private List<String> list = null;
	
	private Contact contact= null;
	
	private boolean flag = false;
	
	private boolean error =false;

	
	public Verify(){}
		
	public Verify(List lis,Contact conta) {
		this.list = lis;
		this.contact=conta;
		if(contact.isDecRule())flag=true;
		else flag=false;
	}
	
	private void geneAnswer(){
		Stack<Character> sym = new Stack<Character>();
		
		List<Object> outSequence = new ArrayList<Object>();
		
		
		for(int i=0;i<list.size();i++){
			sym.clear();
			outSequence.clear();
			error=false;
			String question = new String(list.get(i));		
			for(int j=0;j<question.length();j++){
				char ch = question.charAt(j);
				if(ch>='0'&&ch<='9'||flag&&ch=='.'){
					StringBuffer stringbuffer = new StringBuffer();
					while((ch=question.charAt(j))>='0'&&ch<='9'||ch=='.'&&contact.isDecRule()){stringbuffer.append(ch);j++;if(j==question.length())break;}
					j--;
					outSequence.add(Float.valueOf(stringbuffer.toString()));
				}else if(ch=='(')
					sym.push(ch);
				else if(ch=='+'||ch=='-'){
					while(!sym.empty()){	
						if(sym.peek()=='(')break;
						outSequence.add(sym.pop());
					}
					sym.push(ch);
				}else if(ch=='*'||ch=='/'){
					while(!sym.empty()){
						char chTop = sym.peek();
						if(chTop=='('||chTop=='+'||chTop=='-')break;
						outSequence.add(sym.pop());
					}
					sym.push(ch);
				}else if(ch==')'){
					while(sym.empty()==false&&sym.peek()!='('){
							outSequence.add(sym.pop());
					}
					if(sym.empty())error=true;
					sym.pop();
					
				}else {
					error=true;
				}
			}
			
			while(!sym.empty()){
				outSequence.add(sym.pop());
			}
//			for(int j=0;j<listOne.size();j++){
//				System.out.print(listOne.get(j));
//			}
//			System.out.println();
			for(int j=0;j<outSequence.size();j++){
				Object obj = outSequence.get(j);
				
				if(obj instanceof Character){
					Float f1,f2;
					if(j-2<0)error=true;
					f1=(Float)outSequence.get(j-2);
					f2=(Float)outSequence.get(j-1);
					Character symbol = (Character)outSequence.get(j);
					if(symbol =='+')outSequence.add(j+1, f1+f2);
					else if(symbol =='-')outSequence.add(j+1,f1-f2);
					else if(symbol =='*')outSequence.add(j+1,f1*f2);
					else if(symbol =='/'){
						outSequence.add(j+1,f1/f2);
						if(f2<2e-6&&f2>-(2e-6)){
							error=true;
							break;
						}
					}
					else {
						error=true;
					}
					outSequence.remove(j);
					outSequence.remove(j-1);
					outSequence.remove(j-2);
					j-=3;
				}
				
			}
			if(outSequence.size()!=1)error=true;
			
			if(error){
				list.add(i+1, new Topic(contact).getOne());
				list.remove(i);
				i--;
			}
			else 
				answer.add((Float)outSequence.get(0));	
		}
	}
		
	public List<Float> UseClazz(){
		geneAnswer();
		return this.answer;
	}
	
	
}
