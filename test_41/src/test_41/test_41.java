package test_41;

public class test_41 {

	public static void main(String[] args) {
		Car car1=new Car(1234,20.5);
		car1.vshow();
		car1.mshow();

	}
	 interface ivehicle
		{
			void vshow();
		}
	 interface imaterial
		{
			void mshow();
		}
	 static class Car implements ivehicle,imaterial
		{
			protected  int num;
			protected  double gas;
			public Car(int n,double g)
			{
				num=n;
				gas=g;
				System.out.println("生產了車子為"+num+"，汽油量為"+gas+"的車子");
			}
			public void vshow()
			{
				System.out.println("車號是"+num);
				System.out.println("汽油量是"+gas);
			}
			public void mshow()
			{
				System.out.println("車子的材料是鐵");
			}
			
		}

}
