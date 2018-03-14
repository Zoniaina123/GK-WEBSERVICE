package ws;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import metier.Compte;

@WebService(serviceName="BanqueWS")
public class BanqueService {
	@WebMethod(operationName="ConversionEuroToD")
	public double conversion(@WebParam(name="montant") double mt){
		return mt*1.11;
	}
	
	@WebMethod
	public Compte getCompte(@WebParam(name="code") long code){
		return new Compte(code, code*1000, new Date());
	}
	
	@WebMethod
	public List<Compte> getComptes(){
		List<Compte> cptes = new ArrayList<Compte>();
		cptes.add(new Compte(7, 7000, new Date()));
		cptes.add(new Compte(5, 5000, new Date()));
		cptes.add(new Compte(8, 8000, new Date()));
		
		return cptes;
	}

}
