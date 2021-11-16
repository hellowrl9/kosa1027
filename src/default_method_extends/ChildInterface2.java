package default_method_extends;

	public interface ChildInterface2 extends ParentInterface {
		@Override// »ó¼Ó¹ÞÀº default ¸Þ¼­µå ÀçÁ¤ÀÇ
		public default void method2() {
			System.out.println("ChildInterface2-method2");
		}
		public void method3();
	}
