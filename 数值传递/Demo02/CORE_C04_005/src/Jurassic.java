
public class Jurassic {
	class animal{
		public animal() {
			
		}
		public void act() {
			System.out.println("这只动物在水里洗了个澡！");
		}
	}
	class Dinosaur extends animal{
		public Dinosaur() {
			super();
		}
		public void act() {
			System.out.println("这只恐龙吃掉捕捉到的猎物之后在水里洗了个澡！");
		}
	}
	public static void main(String[] args) {
		Jurassic jur = new Jurassic();
		Dinosaur din = jur.new Dinosaur();
		din.act();
	}
}
