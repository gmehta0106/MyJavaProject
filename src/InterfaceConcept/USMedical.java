package InterfaceConcept;

public interface USMedical extends WHO{

	int min_fee = 10;
	boolean isApproved = true;
	public void physioservice();
	
	public void cardioservice();
	
	public void dentalservice();
	
	public void emergencyservice();
		
	
}
