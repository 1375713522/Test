package temp;

public class Contact {
		private boolean braRule;		//�Ƿ�������

		private boolean addRule;		//�Ƿ��мӷ�
		
		private boolean subRule;		//�Ƿ��м���
		
		private boolean mulRule;		//�Ƿ��г˷�
		
		private boolean divRule;		//�Ƿ��г���
		
		private int  numRule;			//��Ŀ����
		
		private boolean decRule;		//�Ƿ���С��
		
		private int maxRule;			//��Ŀ�����
		
		private int outRule;			//�����ʽ
		
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
