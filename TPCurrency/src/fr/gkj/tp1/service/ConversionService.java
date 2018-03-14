package fr.gkj.tp1.service;

import fr.gkj.tp1.business.Devise;

public interface ConversionService {
	public double convert(double montant, Devise deviseIN, Devise deviseOUT);
}
