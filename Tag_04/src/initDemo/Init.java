package initDemo;

public class Init {
	
	public String name;
	public int alter;
	public static int anzahl;
	private static java.util.Scanner Scanner;
	
	{
		System.out.println("Instanz erzeugt");
	}
	
	static {
		System.out.println("Static Init");
		anzahl++;
		Scanner = new java.util.Scanner(System.in);
	}
	
	public Init() {
		
	}
	
	public Init(String name, int alter) {
		this.name = name;
		this.alter = alter;
		System.out.println("!Konstruktor!");
	}

	@Override
	public String toString() {
		return "Init [name=" + name + ", alter=" + alter + "]";
	}
	
	

}
