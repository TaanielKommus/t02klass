public class Soiduhind{
	String firmanimi;
	double a, b, c;

	public Soiduhind(String firmanimi, double alustamine, double tariif, double km){

		this.firmanimi = firmanimi;
		a=alustamine;
		b=tariif;
		c=km;
	}
		public double hind(){
			return Math.round(b*c+a);
		}

		public String toString(){

			return c+" km läbimiseks "+firmanimi+"ga läheb sul maksma ca "+hind()+" eurot!";

		}
}
