import java.util.Scanner;


public abstract class comfortandstructure {
	
	static Scanner scanner = new Scanner(System.in);
	static PrivateRente1 privatePension = new PrivateRente1();
	private static int auswahl;
	private static int zahl1;
	
	private static int auswahl1;

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Selector();
	}
	
	public static void Selector()
	{
		
		System.out.println("Willkommen in der Auswahlphase der Versicherungsrechner, wähle zwischen den Zahlen 1. Führerschein, 2. Eigene Bude oder 3. Private Rente");
		auswahl = scanner.nextInt();
		System.out.println("Ich hätte auch die "  +  auswahl  + " genommen, bringt dir aber noch nichts");
		
		if(auswahl == 1)
		{
			DriverLicense();
		}
		if(auswahl == 2)
		{
			OwnHouse();
		}
		if(auswahl == 3)
		{
			privatePension.alleMethoden();
		}
	}
	
	public static void DriverLicense()
	{
		System.out.println("WIllkommen bei der Führerschein Versicherung");
		System.out.println("Wenn Sie zurück zum Auswahlmenü wollen, dann drücken Sie jetzt die 1, wenn nicht drücken Sie die 2");
		auswahl1 = scanner.nextInt();
		if(auswahl1 == 1)
		{
			Selector();
		}
		if(auswahl1 == 2)
		{
			System.out.println("Geben Sie jetzt ihren Betrage in");
			zahl1 = scanner.nextInt();
			System.out.println("Hey" + zahl1 + "also");
		}
	}
	
	public static void OwnHouse()
	{
		System.out.println("WIllkommen bei der Versicherung, die dir deine eigene Bude garantiert!");
	}
	public static void PrivatePension()
	{
		System.out.println("WIllkommen bei der Versicherung für Private Pension!");
	}

}
