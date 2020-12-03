package test_38;
public class test_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ivehicle[] vc=new  ivehicle[2];
		vc[0]=new Car(1234,20.5);
		vc[1]=new Plane(232);
		for(int i=0 ; i<vc.length;i++)
			vc[i].show();
	}
	 interface ivehicle
	{
		int weight =1000;
		void show();
	}
	 static class Car implements ivehicle
		{
			protected  int num;
			protected  double gas;
			public Car(int n,double g)
			{
				num=n;
				gas=g;
				System.out.println("生產了車子為"+num+"，汽油量為"+gas+"的車子");
			}
			public void show()
			{
				System.out.println("車號是"+num);
				System.out.println("汽油量是"+gas);
			}
			public void setCar(int n,double g)
			{
				num=n;
				gas=g;
				System.out.println("將車號設為"+num+"將汽油量設為"+gas);
			}
		}
	 static class Plane implements  ivehicle
		{
			private int flight;
			public Plane(int f)
			{
				flight=f;
				System.out.println("生產了"+flight+"班次的飛機");
			}
			public void show()
			{
				System.out.println("飛機的班次是"+flight);
			}
		}
}
