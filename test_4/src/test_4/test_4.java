package test_4;

public class test_4 {

	public static void main(String[] args) {
	RacingCar rccar1=new RacingCar();
	rccar1.setCar(1234, 20.5);
	rccar1.setCourse(5);
  }
	static class Car
	{
		private  int num;
		private double gas;
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
		void show(int n,double g)
		{
			System.out.println("�����O"+num);
			System.out.println("�T�o�q�O"+gas);
		}
	}
	static class RacingCar extends Car
	{
		private int course;
		public void setCourse(int c)
		{
			course=c;
			System.out.println("�N�ɨ��s���]��"+course);
		}
	}

}
