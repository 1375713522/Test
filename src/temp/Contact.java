package temp;

public class Contact {
		private boolean braRule;		//是否有括号

		private boolean addRule;		//是否有加法
		
		private boolean subRule;		//是否有减法
		
		private boolean mulRule;		//是否有乘法
		
		private boolean divRule;		//是否有除法
		
		private int  numRule;			//题目数量
		
		private boolean decRule;		//是否有小数
		
		private int maxRule;			//题目最大数
		
		private int outRule;			//输出方式
		
		public Contact (){
			this.braRule = false;
			this.addRule = false;
			this.subRule = false;
			this.mulRule = false;
			this.divRule = false;
			this.numRule = 10;
			this.decRule = false;
			this.maxRule = 10;
			this.outRule = 1;
		}
		
public Contact(boolean braRule, boolean addRule, boolean subRule, boolean mulRule, boolean divRule, int numRule,
				boolean decRule, int maxRule, int outRule) {
			super();
			this.braRule = braRule;
			this.addRule = addRule;
			this.subRule = subRule;
			this.mulRule = mulRule;
			this.divRule = divRule;
			this.numRule = numRule;
			this.decRule = decRule;
			this.maxRule = maxRule;
			this.outRule = outRule;
		}



//		private List<String> list = new ArrayList<String>();

		public boolean isBraRule() {
			return braRule;
		}

		public void setBraRule(boolean braRule) {
			this.braRule = braRule;
		}

		public boolean isAddRule() {
			return addRule;
		}

		public void setAddRule(boolean addRule) {
			this.addRule = addRule;
		}

		public boolean isSubRule() {
			return subRule;
		}

		public void setSubRule(boolean subRule) {
			this.subRule = subRule;
		}

		public boolean isMulRule() {
			return mulRule;
		}

		public void setMulRule(boolean mulRule) {
			this.mulRule = mulRule;
		}

		public boolean isDivRule() {
			return divRule;
		}

		public void setDivRule(boolean divRule) {
			this.divRule = divRule;
		}

		public int getNumRule() {
			return numRule;
		}

		public void setNumRule(int numRule) {
			this.numRule = numRule;
		}

		public boolean isDecRule() {
			return decRule;
		}

		public void setDecRule(boolean decRule) {
			this.decRule = decRule;
		}

		public int getMaxRule() {
			return maxRule;
		}

		public void setMaxRule(int maxRule) {
			this.maxRule = maxRule;
		}

		public int getOutRule() {
			return outRule;
		}

		public void setOutRule(int outRule) {
			this.outRule = outRule;
		}
		
}
