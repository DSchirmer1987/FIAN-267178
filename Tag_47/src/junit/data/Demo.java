package junit.data;

public class Demo {

	public static void main(String[] args) {
		VCard vc = new VCard("Daniel", "dozent@dozent.de");
		
		vc.export("daniel2.vcf");
	}

}
