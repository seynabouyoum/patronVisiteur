package youmzeyna;

public class Calcul implements IVisitor{
	private int salaire;


	public Calcul() {
		super();
		this.salaire = 0;
	}



	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}


	@Override
	public void VisitDirecteur(Directeur d) {
		// TODO Auto-generated method stub
		this.setSalaire(d.getSalaireDirecteur());


	}

	@Override
	public void VisitManager(Manager f) {
		// TODO Auto-generated method stub
		this.setSalaire(f.getSalaireManage());

	}

	@Override
	public void VisitCommerciaux(Commerciaux d) {
		// TODO Auto-generated method stub
		this.setSalaire(d.getSalaireCom());

	}

	@Override
	public void VisitOuvrier(Ouvrier f) {
		// TODO Auto-generated method stub
		this.setSalaire(f.getSalaireOuvrier());

	}

}
