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
				System.out.println("�Ͳ��F���l��"+num+"�A�T�o�q��"+gas+"�����l");
			}
			public void show()
			{
				System.out.println("�����O"+num);
				System.out.println("�T�o�q�O"+gas);
			}
			public void setCar(int n,double g)
			{
				num=n;
				gas=g;
				System.out.println("�N�����]��"+num+"�N�T�o�q�]��"+gas);
			}
		}
	 static class Plane implements  ivehicle
		{
			private int flight;
			public Plane(int f)
			{
				flight=f;
				System.out.println("�Ͳ��F"+flight+"�Z��������");
			}
			public void show()
			{
				System.out.println("�������Z���O"+flight);
			}
		}
}
