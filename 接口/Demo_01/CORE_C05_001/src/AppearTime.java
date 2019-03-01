
public class AppearTime {
	
	interface IClear{
		void clear();
	}
	
	class MyClear implements IClear{
		public void clear() {
			System.out.println("¹þ¹þ");
		}
	}
	
	public static void main(String[] args) {
		
		MyClear myclear = new AppearTime().new MyClear();
		myclear.clear();

	}

}
