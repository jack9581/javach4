package test_32;
public class test_32 {

	public static  void main(String[] args) {
		Vehicle[] vc=new Vehicle[2];
		vc[0]=new Car(1234,20.5);
		vc[1]=new Plane(232);
		for(int i=0 ; i<vc.length;i++)
			if(vc[i]instanceof Car)
			{
				 System.out.println("��"+(i+1)+"�Ӫ���OCar���O");
				 System.out.println("��"+(i+1)+"�Ӫ��󤣬OCar���O");
			}
		}
	
	static abstract   class Vehicle
	{
		protected int speed;
		public void setSpeed(int s)
		{
			speed =s;
			 System.out.println("�N�t�׳]��"+speed+"�F");
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
			System.out.println("�Ͳ��F���l��"+num+"�A�T�o�q��"+gas);
		}
		public void setCar(int n,double g)
		{
			num=n;
			gas=g;
			System.out.println("�N�����]��"+num+"�N�T�o�q�]��"+gas);
		}
		void show()
		{
			System.out.println("�����O"+num);
			System.out.println("�T�o�q�O"+gas);
			System.out.println("�t�׬O"+speed);
		}
	}
	 static class Plane extends Vehicle
	{
		private int flight;
		public Plane(int f)
		{
			flight=f;
			System.out.println("�Ͳ��F"+flight+"�Z��������");
		}
		void show()
		{
			System.out.println("�������Z���O"+flight);
			System.out.println("�t�׬O"+speed);
		}
	}
	
}