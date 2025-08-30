package solid;

interface Database {
    void save(String data);
}

class MySQLDatabase implements Database {
    public void save(String data) { System.out.println("Saving in MySQL"); }
}

class MongoDBDatabase implements Database {
    public void save(String data) { System.out.println("Saving in MongoDB"); }
}

class UserService {
    private Database db;
    UserService(Database db) { this.db = db; }
    public void saveUser(String data) { db.save(data); }
}

// Usage
public class D {
    public static void main(String[] args) {
        Database db = new MySQLDatabase(); // can easily switch to MongoDB
        UserService service = new UserService(db);
        service.saveUser("John");
    }
}

