package youmzeyna;

public class Commerciaux implements IEntreprise {

	private int primevente;
	//private int salaireManag;

	public Commerciaux(int primevente) {
		super();
		this.primevente = primevente;
	}


	public int getSalaireCom() {
		return primevente+10000;
	}


	public void setPrimevente(int primevente) {
		this.primevente = primevente;
	}


	@Override
	public void accept(IVisitor v) {
		// TODO Auto-generated method stub
		v.VisitCommerciaux(this);
	}

}
