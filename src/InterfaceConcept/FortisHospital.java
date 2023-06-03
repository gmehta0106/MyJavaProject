package InterfaceConcept;

public class FortisHospital extends Medical implements USMedical, UKMedical, IndianMedical{
	
	int min_fee = 50;

	@Override
	public void physioservice() {
		System.out.println("US medical.... physioservice");
		
	}

	@Override
	public void cardioservice() {
		System.out.println("US medical.... cardioservice");
		
	}

	@Override
	public void dentalservice() {
		System.out.println("US medical.... dentalservice");
		
	}

	@Override
	public void neuroservice() {
		System.out.println("UK ...neuroservice");
	}

	@Override
	public void pediaService() {
		System.out.println("UK....pediaService");
		
	}

	@Override
	public void oncologyServices() {
		System.out.println("Indian ...oncologyServices");
		
	}

	@Override
	public void orthoServices() {
		System.out.println("Indian ...orthoServices");
		
	}
	//Individual:
			public void medicalTraning() {
				System.out.println("individual of FH...medicalTraning");
			}
			
			//Individual:
			public void medicalClaim() {
				System.out.println("Individual of FortisHospital....medicalClaim");
				
			}

			@Override
			public void emergencyservice() {
				System.out.println("US ...emergencyservice");
				
			}

			@Override// from grand parent interface
			public void covidVaccination() {
				
				System.out.println("WHO ...covidVaccination");
			}
}
