import java.util.HashMap;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Store {


    private HashMap<String, String> data;

    public Store() {
        this.data = new HashMap<>();
    }

    public Store(HashMap<String, String> data) {
        if (data == null) {
            throw new IllegalArgumentException("Mapa nie może być null");
        }
        this.data = data;
    }

    public void set(String key, String value) {
        if (key == null || value == null) {
            throw new IllegalArgumentException("Klucz i wartość nie mogą być null");
        }
        this.data.put(key, value);
    }

    public String get(String key) {
        return this.data.get(key);
    }

    public void remove(String key) {
        if (key == null) {
            throw new IllegalArgumentException("Klucz nie może być null");
        }
        this.data.remove(key);
    }

    public Set<String> keysStartingWith(String prefix) {
        if (prefix == null) {
            throw new IllegalArgumentException("Prefiks nie może być null");
        }
        return this.data.keySet().stream()
                .filter(key -> key.startsWith(prefix))
                .collect(Collectors.toSet());
    }
}

