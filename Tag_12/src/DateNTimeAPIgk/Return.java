package DateNTimeAPIgk;

public class Return {
	
	private boolean validDate;
	private String rightString;
	private String totalString;

	public Return() {
	}

	public Return(boolean validDate, String rightString, String totalString) {
		super();
		this.validDate = validDate;
		this.rightString = rightString;
		this.totalString = totalString;
	}
	
	public boolean isValidDate() {
		return validDate;
	}

	public void setValidDate(boolean validDate) {
		this.validDate = validDate;
	}

	public String getRightString() {
		return rightString;
	}

	public void setRightString(String rightString) {
		this.rightString = rightString;
	}


	public String getTotalString() {
		return totalString;
	}

	public void setTotalString(String totalString) {
		this.totalString = totalString;
	}

	@Override
	public String toString() {
		return "Return [validDate=" + validDate + ", rightString=" + rightString + ", totalString=" + totalString
				+ ", isValidDate()=" + isValidDate() + ", getRightString()=" + getRightString() + ", getTotalString()="
				+ getTotalString() + "]";
	}
	


}
