package CPU3;

public class Test3 {
	public static void main(String[]args) {
		Mainboard3 mainboard=new Mainboard3();
		Cpu3 I3=new I33();
		Cpu3 I5=new I53();
		Cpu3 I7=new I73();
		mainboard.setCpu(I3);
		mainboard.sum();
		
	}
}
