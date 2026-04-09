package factory;

public class Barco implements Transport{

	@Override
	public void entregar() {
		 System.out.println("[Barco] Entregando por mar.");
		
	}

}
