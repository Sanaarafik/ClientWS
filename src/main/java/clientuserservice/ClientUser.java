package clientuserservice;
import clientuserservice.UserService; 
import clientuserservice.UserType; 
import clientuserservice.UserServiceImplService;
public class ClientUser {
	
	 public static void main(String[] args) {
	        UserServiceImplService service = new UserServiceImplService();
	        UserService port = service.getUserServiceImplPort();
	     // Ajouter deux bénévoles
	        addUser(port, "Benevole 1", UserType.BENEVOLE);
	        addUser(port, "Benevole 2", UserType.BENEVOLE);

	        // Ajouter deux validateurs
	        addUser(port, "Validateur 1", UserType.VALIDATEUR);
	        addUser(port, "Validateur 2", UserType.VALIDATEUR);

	        // Ajouter deux demandeurs
	        addUser(port, "Demandeur 1", UserType.DEMANDEUR);
	        addUser(port, "Demandeur 2", UserType.DEMANDEUR);

	        // Récupérer et afficher tous les utilisateurs
	        System.out.println("Liste des utilisateurs :");
	        for (User user : port.getAllUsers()) {
	            System.out.println("User: " + user.getName() + ", Type: " + user.getUserType());
	        }
	    }

	    private static void addUser(UserService port, String name, UserType userType) {
	        User newUser = new User();
	        newUser.setName(name);
	        newUser.setUserType(userType);
	        String response = port.addUser(newUser);
	        System.out.println(response);
	    }

}
	

