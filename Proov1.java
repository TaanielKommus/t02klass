public class Proov1 {
	public static void main(String[] args){

		Soiduhind takso1= new Soiduhind("Euro Takso", 1.98, 0.48, 10);
		Soiduhind takso2= new Soiduhind("Amigo Takso", 2, 0.4, 8);
		Soiduhind takso3= new Soiduhind("Inter Takso", 2.05, 0.35, 12);

		System.out.println(takso1.toString());
		System.out.println(takso2.toString());
		System.out.println(takso3.toString());

	}
}
