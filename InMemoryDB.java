import java.util.HashMap;
import java.util.Map;

public class InMemoryDB {
    private Map<String, Integer> database = new HashMap<String, Integer>();
    private Map<String, Integer> transaction;
    private boolean inTransaction = false;

    public Integer get(String key) {
        return database.get(key);
    }

    public void put(String key, int value) {
        if (!inTransaction) {
            throw new RuntimeException("No transaction in progress");
        } else {
            transaction.put(key, value);
        }
    }

    public void begin_transaction() {
        if (inTransaction) {
            throw new RuntimeException("Transaction already in progress");
        } else {
            inTransaction = true;
            transaction = new HashMap<String, Integer>();
        }
    }

    void commit() {
        if (!inTransaction) {
            throw new RuntimeException("No transaction in progress");
        } else {
            inTransaction = false;
            database.putAll(transaction);
            transaction = null;
        }
    }

    void rollback() {
        if (!inTransaction) {
            throw new RuntimeException("No transaction in progress");
        } else {
            transaction = null;
            inTransaction = false;
        }
    }
}