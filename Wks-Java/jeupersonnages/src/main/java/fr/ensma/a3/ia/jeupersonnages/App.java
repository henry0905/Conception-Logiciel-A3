package fr.ensma.a3.ia.jeupersonnages;

import fr.ensma.a3.ia.jeupersonnages.elements.groupement.Troupe;
import fr.ensma.a3.ia.jeupersonnages.elements.groupement.TroupeVideException;
import fr.ensma.a3.ia.jeupersonnages.elements.personnages.Dragon;
import fr.ensma.a3.ia.jeupersonnages.elements.personnages.Guerrier;
import fr.ensma.a3.ia.jeupersonnages.elements.personnages.Ouvrier;
import fr.ensma.a3.ia.jeupersonnages.map.BaseSimple;
import fr.ensma.a3.ia.jeupersonnages.map.ECouleur;

public class App 
{
    public static void main( String[] args )
    {
    	BaseSimple bse1 = new BaseSimple("Winterfell", ECouleur.bleu);
    	System.out.println(bse1);
    	
    	Ouvrier Hodor = new Ouvrier("Hodor",500.0f, 250.0f, bse1);
    	System.out.println(Hodor);
    	Hodor.deplacer(); 
    	
    	Guerrier Eddard = new Guerrier("Eddard",350.0f, 350.0f, bse1);
    	System.out.println(Eddard);
    	Eddard.deplacer();
    	Eddard.aLAttaque(Hodor);
    	
    	BaseSimple bse2 = new BaseSimple("Yunkaï", ECouleur.jaune);
    	System.out.println(bse2);    	
    	Dragon Drogon = new Dragon("Drogon",7000.0f, 1500.0f);
    	System.out.println(Drogon);
    	Drogon.deplacer();
    	
    	Troupe puines = new Troupe("Puines",Hodor);
    	puines.ajouterElement(Eddard);
    	puines.ajouterElement(Drogon);
    	System.out.println(puines);
    	puines.deplacer();
    	
    	try {
			puines.retirerElement(Hodor);
			puines.retirerElement(Eddard);
//			puines.retirerElement(Eddard);
			System.out.println(puines);
			puines.retirerElement(Drogon);
		} catch (TroupeVideException e) {
			puines = null;
			System.gc();
		}
    }
}
