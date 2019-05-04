package youmeyna;

public class Manager implements IEntreprise {

	private int indice;
	private int salairebase;
	private int prime;

	public Manager(int indice, int salairebase, int prime) {
		super();
		this.indice = indice;
		this.salairebase = salairebase;
		this.prime = prime;
	}


	public int getIndice() {
		return indice;
	}


	public void setIndice(int indice) {
		this.indice = indice;
	}


	public int getSalaireManage() {
		return (salairebase*indice)+prime;
	}


	public void setSalairebase(int salairebase) {
		this.salairebase = salairebase;
	}


	public int getPrime() {
		return prime;
	}


	public void setPrime(int prime) {
		this.prime = prime;
	}


	@Override
	public void accept(IVisitor v) {
		// TODO Auto-generated method stub
		v.VisitManager(this);
	}

}
