
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
			System.out.println("�������ܵ��Ƿ������������������ʽ��õ�廨����");
			return;
		}
		roseSumNum = roseSumNum - giveRoseNum;
		if(roseSumNum < 0) {
			throw new RoseException("��û��Ǯ���͸��㣬�Բ���");
		}
		System.out.println("�װ��ģ�����"+giveRoseNum+"��õ�廨��");
	}
}
