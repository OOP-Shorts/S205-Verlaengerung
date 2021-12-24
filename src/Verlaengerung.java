public class Verlaengerung {

    private static String[] extend(String[] array, String item) {
        String[] result = new String[array.length + 1];
        System.arraycopy(array, 0, result, 0, array.length);
        result[result.length - 1] = item;
        return result;
    }

    public static void main(String[] args) {
        String[] favorites = new String[0];
        favorites = extend(favorites, "Polarfuchs");
        favorites = extend(favorites, "Erdmännchen");
        favorites = extend(favorites, "Wachtel");
        favorites = extend(favorites, "Eisvogel");
        favorites = extend(favorites, "Siebenschläfer");
        for (String animal : favorites) {
            System.out.println(animal);
        }
    }
}
