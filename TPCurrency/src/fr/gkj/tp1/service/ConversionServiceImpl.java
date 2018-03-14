package fr.gkj.tp1.service;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.Calendar;

import org.tempuri.ConverterSoap;
import org.tempuri.ConverterSoapProxy;

import fr.gkj.tp1.business.Devise;

public class ConversionServiceImpl implements ConversionService {

	@Override
	public double convert(double montant, Devise deviseIN, Devise deviseOUT) {
		ConverterSoap ct = new ConverterSoapProxy();
		
		Calendar today = Calendar.getInstance();
		
		//convertir un montant de type double en bigdecimal
		BigDecimal mt = new BigDecimal(montant);
		BigDecimal res = new BigDecimal(0);
		
		try {
			res = ct.getConversionAmount(deviseIN.getCode(), deviseOUT.getCode(),today,mt);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		//retourne une valeur de type bigdecimal en double 
		return res.doubleValue();
		
	
	}

}
