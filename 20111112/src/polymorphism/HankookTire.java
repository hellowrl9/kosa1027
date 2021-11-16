package polymorphism;
//              B                 A  ; a = b
public class HankookTire extends Tire { // tire = HankookTire
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	@Override
	public boolean roll() { // ¿À¹ö¶óÀÌµù
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "HankookTire ¼ö¸í : " +
						(maxRotation - accumulatedRotation) + "È¸");
			return true;
		}else {
			System.out.println("*** " + location + 
					" HankookTire ÆãÅ© ***");
			return false;
		}
	}
}
