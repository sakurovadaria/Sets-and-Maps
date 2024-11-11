import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        // Задание 1: Печать нечетных чисел
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        printOddNumbers(nums);

        // Задание 2: Печать четных чисел без повторений в порядке возрастания
        printEvenNumbers(nums);

        // Задание 3: Печать уникальных слов
        List<String> words = new ArrayList<>(List.of("apple", "banana", "apple", "orange", "banana", "grape"));
        printUniqueWords(words);

        // Задание 4: Подсчет дублей для каждого уникального слова
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        printWordCounts(strings);
    }

    // Задание 1: Метод для печати нечетных чисел
    public static void printOddNumbers(List<Integer> numbers) {
        System.out.println("Нечетные числа:");
        for (Integer number : numbers) {
            if (number % 2 != 0) { // Проверка на нечетность
                System.out.println(number); // Печать нечетного числа
            }
        }
    }

    // Задание 2: Метод для печати четных чисел без повторений в порядке возрастания
    public static void printEvenNumbers(List<Integer> numbers) {
        Set<Integer> evenNumbersSet = new TreeSet<>(); // Используем TreeSet для автоматической сортировки

        for (Integer number : numbers) {
            if (number % 2 == 0) { // Проверка на четность
                evenNumbersSet.add(number); // Добавляем число в набор (дубликаты будут игнорироваться)
            }
        }

        System.out.println("Четные числа без повторений в порядке возрастания:");
        for (Integer evenNumber : evenNumbersSet) {
            System.out.println(evenNumber); // Печать четного числа
        }
    }

    // Задание 3: Метод для печати уникальных слов
    public static void printUniqueWords(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words); // Используем HashSet для хранения уникальных слов

        System.out.println("Уникальные слова:");
        for (String word : uniqueWords) {
            System.out.println(word); // Печать уникального слова
        }
    }

    // Задание 4: Метод для подсчета дублей для каждого уникального слова
    public static void printWordCounts(List<String> words) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1); // Увеличиваем счетчик для каждого слова
        }

        System.out.println("Количество дублей для каждого уникального слова:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue()); // Печать слова и его количества
        }
    }
}