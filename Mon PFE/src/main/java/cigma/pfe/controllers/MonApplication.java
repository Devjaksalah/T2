package cigma.pfe.controllers;

import cigma.pfe.models.Client;
public class MonApplication {

	public static void main(String[] args) {
		ClientController ctrl1 = new ClientController();
		Client client =new Client(1L,"testing");
		ctrl1.save(client);
		
	}

}
