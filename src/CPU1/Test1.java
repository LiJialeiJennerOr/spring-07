package CPU1;

public class Test1 {
	public static void main(String[]args) {
		Mainboard1 mainboard=new Mainboard1();
		Cpu1 i3=new I31();
		Cpu1 i7=new I71();
		Cpu1 i5= new I51();
		mainboard.setCpu(i3);
		mainboard.method1();
		
	}
}
