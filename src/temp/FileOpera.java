package temp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

public class FileOpera {
		
	private List<String>question = null;
	
	private List<Float> answer =null;
	public FileOpera(){}
	
	public FileOpera(List<String>question , List<Float>answer){
		this.question =question;
		this.answer=answer;	
	}

	public List<String> getQuestion() {
		return question;
	}

	public void setQuestion(List<String> question) {
		this.question = question;
	}

	public List<Float> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Float> answer) {
		this.answer = answer;
	}
	
	public void write(){
		File file = new File(DBUtils.getFileDirectory());
		BufferedWriter bw = null;
		try {
			bw =new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file),"utf-8"));
		}  catch (IOException e) {
			e.printStackTrace();
		}
		for(int i=0;i<question.size();i++){
			try {
				bw.write("第"+(i+1)+"题"+"---"+question.get(i)+"---"+"答案为："+answer.get(i));
				bw.newLine();
				bw.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}		
		}
		try {
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
