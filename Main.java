import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InMemoryDB db = new InMemoryDB();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter commands (type 'exit' to quit):");

        while (true) {
            String command = scanner.nextLine();
            String[] parts = command.split(" ");

            try {
                switch (parts[0]) {
                    case "get":
                        if (parts.length != 2) {
                            System.out.println("Usage: get <key>");
                        } else {
                            System.out.println("Value: " + db.get(parts[1]));
                        }
                        break;
                    case "put":
                        if (parts.length != 3) {
                            System.out.println("Usage: put <key> <value>");
                        } else {
                            db.put(parts[1], Integer.parseInt(parts[2]));
                            System.out.println("Put: " + parts[1] + " = " + parts[2]);
                        }
                        break;
                    case "begin":
                        db.begin_transaction();
                        System.out.println("Transaction started");
                        break;
                    case "commit":
                        db.commit();
                        System.out.println("Transaction committed");
                        break;
                    case "rollback":
                        db.rollback();
                        System.out.println("Transaction rolled back");
                        break;
                    case "exit":
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Unknown command");
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}