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
				System.out.println("�Ͳ��F���l��"+num+"�A�T�o�q��"+gas+"�����l");
			}
			public void vshow()
			{
				System.out.println("�����O"+num);
				System.out.println("�T�o�q�O"+gas);
			}
			public void mshow()
			{
				System.out.println("���l�����ƬO�K");
			}
			
		}

}