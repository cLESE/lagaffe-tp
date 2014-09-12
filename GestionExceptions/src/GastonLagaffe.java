public class GastonLagaffe {

	public void trierCourrierEnRetard(int nbLettres)

	{

	System.out.print("Quoi, " + nbLettres + " lettre(s) à trier ? ");

	try

	{

	System.out.println("OK, OK, je vais m'y mettre...");

	if(nbLettres > 2)

	{

	throw new Exception("Beaucoup trop de lettres...");

	}

	System.out.println("Ouf, j'ai fini.");

	}

	catch(Exception e)

	{
		System.out.println("M'enfin ! " + e.getMessage());
		System.out.println("Détails : " + e.toString());
	}

	System.out.println("Après tout ce travail, une sieste s'impose.");

	}

	public void rangerBureau() throws Exception

	{

	System.out.println("Ranger mon bureau ? Si tu insistes...");

	}


	private void ajouterSignature()

	{

	System.out.println("Signez ici, M'sieur Demesmaeker.");

	}

	private void imprimerContrats() throws Exception {

	System.out.println("D'abord, mettre en route l'imprimante.");

	allumerImprimante();

	System.out.println("Voilà, c'est fait !");

	}

	private void allumerImprimante() throws Exception {

	System.out.println("Voyons comment allumer cette machine...");

	throw new Exception("Mais qui a démonté tout l'intérieur ?");

	}



	public void faireSignerContrats()

	{

	try {

		System.out.println("Encore ces contrats ? OK, je les imprime...");
		imprimerContrats();

		System.out.println("A présent une petite signature...");

		ajouterSignature();

		System.out.println("Fantasio, les contrats sont signés !");

	}

	catch (Exception e) {

		System.out.println("M'enfin ! " + e.getMessage());

	}

	}

	public void repondreAuTelephone(String appelant) throws ExceptionMenfin, ExceptionBof

	{

	if(appelant.equals("Mr. Boulier"))

	{
		throw new ExceptionMenfin("Je finis un puzzle.");
	}

	else if(appelant.equals("Prunelle"))
	{

	throw new ExceptionBof("Pas le temps, je suis dé-bor-dé !");

	}

	else

	{

	System.out.println("Allô, ici Gaston, j'écoute...");

	}

	}

	public void commanderFournitures() throws Exception

	{

	System.out.println("D'abord, réchauffer ma morue aux fraises...");

	System.out.println("Heureusement, j'ai réparé mon réchaud à gaz.");

	throw new Exception("Vite, où est l'extincteur ??");

	}


	public void preparerCafe(String personne)

	{

	System.out.println("Un café pour " + personne + " ? OK...");

	System.out.println("D'abord, j'allume la cafetière.");

	System.out.println("Le café chauffe... C'est prêt !");

	if(!personne.equals("Moiselle Jeanne")) {
		System.out.println("J'ai le temps de faire un peu de chimie.");
		throw new Exception("Aïe , je me suis brûlé !");

	}

	System.out.println("J'éteins la cafetière.");

	}




}
