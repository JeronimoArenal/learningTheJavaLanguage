package factory;

public class Camion implements Transport{

	@Override
	public void entregar() {
		System.out.println("[Camión] Entregando por carretera.");
		
	}

}
