package CPU2;

public class Test2 {
	public static void main(String[]args) {
		Mainboard2 mainboard=new Mainboard2();
		Cpu2 i3=new I32();
		Cpu2 i5=new I52();
		Cpu2 i7=new I72();
		mainboard.setCpu(i7);
		mainboard.method2();
	}

}
