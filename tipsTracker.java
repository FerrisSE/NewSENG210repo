// comment 1
public class tipsTracker {
	public float tips;
	public float newTips;
	public void printTips() {
		System.out.println("Your current tip balance is: " + tips);
	}


// comment 2 add tip calculator
	public float tipsCalc(float tips, float newTip) {
		tips += newTip;  // total tip calculation
		return tips;  // return current tip balance
	}
}