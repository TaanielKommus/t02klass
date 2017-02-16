public class Proov1 {
	public static void main(String[] args){

		Soiduhind[] t=new Soiduhind[3];
		t[0]= new Soiduhind("Euro Takso", 1.98, 0.48, 13);
		t[1]= new Soiduhind("Amigo Takso", 2, 0.4, 13);
		t[2]= new Soiduhind("Inter Takso", 2.05, 0.35, 13);

		for(Soiduhind p: t){
			System.out.println(p);
		}
	}
}

/*
admins-mbp:prg_kt2 admin$ java Proov1
13.0 km läbimiseks Euro Takso-ga läheb sul maksma ca 8.0 eurot!
13.0 km läbimiseks Amigo Takso-ga läheb sul maksma ca 7.0 eurot!
13.0 km läbimiseks Inter Takso-ga läheb sul maksma ca 7.0 eurot!
*/
