package InterfaceConcept;

public class TestHospital {

	public static void main(String[] args) {
		FortisHospital fh = new FortisHospital();
		fh.cardioservice();
		fh.medicalClaim();
		fh.physioservice();
		fh.dentalservice();
		fh.emergencyservice();
		fh.medicalTraning();
		fh.neuroservice();
		fh.oncologyServices();
		fh.orthoServices();
		fh.pediaService();
		fh.physioservice();
		fh.medicalRD();
		System.out.println(USMedical.min_fee);
		System.out.println(fh.min_fee);
		//System.out.println(FortisHospital.min_fee);
		System.out.println(USMedical.isApproved);

		//Top casting- can access only US medical methods 
		USMedical us = new FortisHospital();
		us.physioservice();
		us.cardioservice();
		us.dentalservice();
		us.emergencyservice();
		
		//Top casting
		WHO wh=new FortisHospital();
		wh.covidVaccination();

	}

}
