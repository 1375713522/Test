package temp;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DBUtils {
		
	static Properties properties = new Properties();
	
	private static String fileDirectory = null;
	
	private static String topoc = null;
	
	private static List<String>question =new ArrayList<String>();
	
	private static List<Float>answer = new ArrayList<Float>();

	
	private DBUtils(){}
	
	
	public static  List<String> getQuestion() {
		return question;
	}

	public static void  setQuestion(List<String> ques) {
		question = ques;
	}

	public static List<Float> getAnswer() {
		return answer;
	}

	public static void setAnswer(List<Float> answ) {
		answer = answ;
	}

	public static String getFileDirectory(){
		return fileDirectory;
	}
	public static String getTopoc() {
		return topoc;
	}

	public static void setTopoc(String topoc) {
		DBUtils.topoc = topoc;
	}
	static {
		try {
			properties.load(new FileReader("conf.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		fileDirectory=properties.getProperty("fileDirectory");
		
		topoc = properties.getProperty("topoc");
	}
}
