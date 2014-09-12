
public class Main {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		

			GastonLagaffe gaston = new GastonLagaffe();

			System.out.println("Debout Gaston ! Il faut trier le courrier !");

			gaston.trierCourrierEnRetard(20);
			
			try

			{

			gaston.rangerBureau();
			throw new Exception("Impossible, l'armoire est déjà pleine !");
			}

			catch(Exception e)

			{
				System.out.println(e.getMessage());
			}
			
			System.out.println("Gaston, Mr. Demesmaeker arrive, faites vite !");

			gaston.faireSignerContrats();
			
			appeler(gaston, "Mr. Boulier");

			appeler(gaston, "Prunelle");

			appeler(gaston, "Jules-de-chez-Smith");
			
			preparerJournal(gaston);
			
			try

			{

			gaston.preparerCafe("Moiselle Jeanne");

			gaston.preparerCafe("Lebrac");

			}

			catch(Exception e)

			{

			System.out.println(e.getMessage());

			}
	}
	
	private static void appeler(GastonLagaffe gaston, String appelant)

	{

	System.out.println("Gaston, " + appelant + " au téléphone !");

	try

	{
		gaston.repondreAuTelephone(appelant);
	}

	catch(Exception e)

	{
		System.out.println("Encore une bonne excuse, j'imagine ?");

		System.out.println(e.getMessage());
	}

	}

	
	private static void preparerJournal(GastonLagaffe gaston)

	{

	System.out.println("Gaston, une commande urgente !");

	try

	{
		gaston.commanderFournitures();
		System.out.println("Déjà terminé ? Il progresse, ce petit...");
	}

	catch(Exception e)

	{
		System.out.println("Gaston, d'où vient cette odeur ?");
		System.out.println("Vite, où est l'extincteur ?");
	}
	}

	

	
	}

	
	

