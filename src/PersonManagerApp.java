public class PersonManagerApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Person Manager");
        System.out.println();

        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            String type = Console.getString("Create customer or employee? (c/e): ", "c", "e");
            System.out.println();
            
            String firstName = Console.getString("First name: ");
            String lastName = Console.getString("Last name: ");
            
            Person person;
            if (type.equalsIgnoreCase("c")) {
                String customerNumber = Console.getString("Customer number: ");
                person = new Customer(firstName, lastName, customerNumber);
            } else {
                String ssn = Console.getString("SSN: ");
                person = new Employee(firstName, lastName, ssn);
            } 
            
            Class c = person.getClass();
            System.out.println();
            System.out.println("You entered a new " + c.getName() + ":");
            System.out.println(person.toString());
            System.out.println();

            choice = Console.getString("Continue? (y/n): ", "y", "n");
            System.out.println();
        }
    }

}
