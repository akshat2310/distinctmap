import java.util.AbstractMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class main {
    public static Map<String, String> getDetails()
    {
        return Stream.of(
                new AbstractMap.SimpleEntry<>("name", "Manoj"),
                new AbstractMap.SimpleEntry<>("age", "25"),
                new AbstractMap.SimpleEntry<>("gender", "Male")
        )
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    // Return multiple values from a method in Java
    public static void main(String[] args)
    {
        Map<String, String> person = getDetails();

        for (String key : person.keySet()) {
            System.out.println(key + " is " + person.get(key));
        }
    }
}
