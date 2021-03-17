
public class ADSL_Zone_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Usuarios Usuario=new Usuarios(2, "sech@pepe", "sech");
		Mod Mod=new Mod(5, "mod@pepe", "El_Mod", 2);
		administradores Admin=new administradores(0, "admin@pepe", "FAKE_ADMIN", 0, 0, 0);
		
		//Usuario testeo
		Usuario.CambiaCorreo("sech2@pepe");
		Usuario.Incr1();
		Usuario.Decre1();
		
		//Mod testeo
		Mod.del();
		Mod.CambiaCorreo("mod2@pepe");
		Mod.Incr1();
		Mod.Decre1();
		
		//Admin testeo
		Admin.CambiaCorreo("admin2@pepe");
		Admin.CambiarNombre("REAL_ADMIN");
		Admin.banadd();
		Admin.Incr1();
		Admin.Decre1();
		Admin.del();
	}

}
