package youmzeyna;

public class Directeur implements IEntreprise {

	private int indice;
	private int salairebase;
	private int bonus;


	public Directeur(int indice, int salairebase, int bonus) {
		super();
		this.indice = indice;
		this.salairebase = salairebase;
		this.bonus = bonus;
	}


	public int getIndice() {
		return indice;
	}


	public void setIndice(int indice) {
		this.indice = indice;
	}


	public int getSalaireDirecteur() {
		return indice*salairebase+bonus;
	}


	public void setSalairebase(int salairebase) {
		this.salairebase = salairebase;
	}


	public int getBonus() {
		return bonus;
	}


	public void setBonus(int bonus) {
		this.bonus = bonus;
	}



	@Override
	public void accept(IVisitor v) {
		// TODO Auto-generated method stub
		v.VisitDirecteur(this);
	}

}
