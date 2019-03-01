
public class Rose {
	private static int roseSumNum;
	
	public Rose(int Rose) {
		setRoseSumNum(Rose);
	}

	public static int getRoseSumNum() {
		return roseSumNum;
	}

	public static void setRoseSumNum(int roseSumNum) {
		Rose.roseSumNum = roseSumNum;
	}
	public void giveRose(int giveRoseNum) throws RoseException{
		if(giveRoseNum < 0) {
			System.out.println("方法接受到非法参数，请给出正数形式的玫瑰花数。");
			return;
		}
		roseSumNum = roseSumNum - giveRoseNum;
		if(roseSumNum < 0) {
			throw new RoseException("我没有钱买花送给你，对不起！");
		}
		System.out.println("亲爱的，送你"+giveRoseNum+"朵玫瑰花！");
	}
}
