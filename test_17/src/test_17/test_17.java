package test_17;
public class test_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car cars[]=new Car[2];
		cars[0]=new Car();
		cars[0].setCar(1234, 20.5);
		cars[1]=new RacingCar();
		cars[1].setCar(4567, 30.5);
		for(int i=0 ; i<cars.length;i++)
		cars[i].show();
	}
	static class Car
	{
		protected  int num;
		protected  double gas;
		public Car()
		{
			num=0;
			gas=0.0;
			System.out.println("�Ͳ��F���l");
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
		}
	}
	static class RacingCar extends Car
	{
		private int course;
		public  RacingCar()
		{
			 course=0;
			 System.out.println("�Ͳ��F�ɨ�");
		}
		public void setCourse(int c)
		{
			course=c;
			System.out.println("�N�ɨ��s���]��"+course);
		}
		public void show()
		{
			System.out.println("�ɨ��������O"+num);
			System.out.println("�T�o�q�O"+gas);
			System.out.println("�ɨ��s���O"+course);
		}
	}

}