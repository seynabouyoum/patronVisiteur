package youmzeyna;

public class Ouvrier implements IEntreprise {
	private int salhor;
	private int nbh;



	public int getSalaireOuvrier() {
		return salhor*nbh+5000;
	}






	public Ouvrier(int salhor, int nbh, int salaireOuvrier) {
		super();
		this.salhor = salhor;
		this.nbh = nbh;
	}



	@Override
	public void accept(IVisitor v) {
		// TODO Auto-generated method stub
		v.VisitOuvrier(this);
	}

}
