public class ConnectionDemo {
    
    public static void main(String[] args) {

        Connection connection1 = Connection.getInstance();
        Connection connection2 = Connection.getInstance();
        Connection connection3 = Connection.getInstance();
    }
}

class Connection{

    private static Connection connection;

    private Connection(){
        System.out.println("Connection object created....");
    }

    public static Connection getInstance() {
        if(connection == null){
            connection = new Connection();
        }
        return connection;
    }

}
