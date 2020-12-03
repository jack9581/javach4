package test_32;
public class test_32 {

	public static  void main(String[] args) {
		Vehicle[] vc=new Vehicle[2];
		vc[0]=new Car(1234,20.5);
		vc[1]=new Plane(232);
		for(int i=0 ; i<vc.length;i++)
			if(vc[i]instanceof Car)
			{
				 System.out.println("第"+(i+1)+"個物件是Car類別");
				 System.out.println("第"+(i+1)+"個物件不是Car類別");
			}
		}
	
	static abstract   class Vehicle
	{
		protected int speed;
		public void setSpeed(int s)
		{
			speed =s;
			 System.out.println("將速度設為"+speed+"了");
		}
		abstract  void show();
	}
	 static class Car extends Vehicle
	{
		protected  int num;
		protected  double gas;
		public Car(int n,double g)
		{
			num=n;
			gas=g;
			System.out.println("生產了車子為"+num+"，汽油量為"+gas);
		}
		public void setCar(int n,double g)
		{
			num=n;
			gas=g;
			System.out.println("將車號設為"+num+"將汽油量設為"+gas);
		}
		void show()
		{
			System.out.println("車號是"+num);
			System.out.println("汽油量是"+gas);
			System.out.println("速度是"+speed);
		}
	}
	 static class Plane extends Vehicle
	{
		private int flight;
		public Plane(int f)
		{
			flight=f;
			System.out.println("生產了"+flight+"班次的飛機");
		}
		void show()
		{
			System.out.println("飛機的班次是"+flight);
			System.out.println("速度是"+speed);
		}
	}
	
}