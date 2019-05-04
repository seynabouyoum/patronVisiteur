package youmzeyna;

public class Test {
	public static void main ( String[] args)
	{
		Directeur d = new Directeur(2,50000,250000);
		Calcul visit = new Calcul();
		d.accept(visit);
		System.out.println("le salaire du directeur est "+d.getSalaireDirecteur());
		Commerciaux c = new Commerciaux(25000);
		Calcul v = new Calcul();
		c.accept(v);
		System.out.println("le salaire des commerciaux est "+c.getSalaireCom());
		Ouvrier o = new Ouvrier(500,80,5000);
		Calcul a = new Calcul();
		o.accept(a);
		System.out.println("le salaire des ouvrier est "+o.getSalaireOuvrier());
	}




}
