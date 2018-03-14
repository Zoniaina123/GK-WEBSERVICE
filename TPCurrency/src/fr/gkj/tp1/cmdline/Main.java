package fr.gkj.tp1.cmdline;



import fr.gkj.tp1.business.Devise;
import fr.gkj.tp1.service.ConversionService;
import fr.gkj.tp1.service.ConversionServiceImpl;

public class Main {

	public static void main(String[] args) {
		ConversionService service = new ConversionServiceImpl();
		
		double resultat = service.convert(5, Devise.EURO, Devise.Dollar);		
		System.out.println("Resultat: "+resultat);
				
	}

}
