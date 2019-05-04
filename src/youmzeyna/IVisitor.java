package youmzeyna;
public interface IVisitor {
	public void VisitDirecteur( Directeur d);
	public void VisitManager( Manager f);
	public void VisitCommerciaux( Commerciaux d);
	public void VisitOuvrier( Ouvrier f);
}
