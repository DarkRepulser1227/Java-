
public class Jurassic {
	class animal{
		public animal() {
			
		}
		public void act() {
			System.out.println("��ֻ������ˮ��ϴ�˸��裡");
		}
	}
	class Dinosaur extends animal{
		public Dinosaur() {
			super();
		}
		public void act() {
			System.out.println("��ֻ�����Ե���׽��������֮����ˮ��ϴ�˸��裡");
		}
	}
	public static void main(String[] args) {
		Jurassic jur = new Jurassic();
		Dinosaur din = jur.new Dinosaur();
		din.act();
	}
}
