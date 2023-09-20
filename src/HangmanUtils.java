import java.util.ArrayList;
import java.util.Random;

public class HangmanUtils {

    private static ArrayList<String> developmentWords = new ArrayList<>();
    private static ArrayList<String> cars = new ArrayList<>();
    private static ArrayList<String> cities = new ArrayList<>();
    private static ArrayList<String> animals = new ArrayList<>();
    
    static {
        developmentWords.add("JAVASCRIPT");
        developmentWords.add("CASCADING STYLE SHEETS");
        developmentWords.add("AGILE");
        developmentWords.add("POLYMORPHISM");
        developmentWords.add("INHERITANCE");
        developmentWords.add("REACT ROUTING");
        developmentWords.add("HOOKS");
        developmentWords.add("ARRAYS");
        developmentWords.add("LOOPS");
        developmentWords.add("HELLO WORLD");
    }

    static {
        cars.add("BMW");
        cars.add("ARIEL");
        cars.add("VOLKSWAGEN");
        cars.add("LANDROVER");
        cars.add("MERCEDES");
        cars.add("BYD");
        cars.add("TESLA");
        cars.add("KOENIGSEGG");
        cars.add("MCLAREN");
        cars.add("TVR");
    }

    static {
        cities.add("BIRMINGHAM");
        cities.add("LONDON");
        cities.add("SWINDON");
        cities.add("MANCHESTER");
        cities.add("LEICESTER");
        cities.add("CORNWALL");
        cities.add("BRISTOL");
        cities.add("KETTERING");
        cities.add("NORTHAMPTON");
        cities.add("NEWCASTLE");
        cities.add("LEEDS");
        cities.add("LIVERPOOL");
    }

    static {
        animals.add("LION");
        animals.add("TIGER");
        animals.add("DOG");
        animals.add("CAT");
        animals.add("ELEPHANT");
        animals.add("ANTELOPE");
        animals.add("DONKEY");
        animals.add("HORSE");
        animals.add("COW");
        animals.add("PANDA");
        animals.add("BLOB FISH");
        animals.add("WOLF");
    }

    public static String getDevelopmentWords() {
        Random random = new Random();
        int index = random.nextInt(developmentWords.size());
        return developmentWords.get(index);

    }

    public static String getCarMakes() {
        Random random = new Random();
        int index = random.nextInt(cars.size());
        return cars.get(index);
    }

    public static String getCities() {
        Random random = new Random();
        int index = random.nextInt(cities.size());
        return cities.get(index);
    }

    public static String getAnimals() {
        Random random = new Random();
        int index = random.nextInt(animals.size());
        return animals.get(index);
    }
}
