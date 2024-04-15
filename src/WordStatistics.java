import java.util.Scanner;

public class WordStatistics {
    public static void main(String[] args) {
        // Створення об'єкту Scanner для зчитування введення з клавіатури
        Scanner scanner = new Scanner(System.in);

        // Запит на введення стрічки від користувача
        System.out.println("Введіть стрічку для аналізу:");

        // Зчитування введеної стрічки
        String inputString = scanner.nextLine();

        // Розділення стрічки на слова за допомогою регулярного виразу
        String[] words = inputString.split("\\s+");

        // Підрахунок кількості слів та символів
        int wordCount = words.length;
        int charCount = 0;

        for (String word : words) {
            charCount += word.length();
        }

        // Виведення результатів
        System.out.println("Кількість слів: " + wordCount);
        System.out.println("Середня кількість символів у словах: " + (wordCount > 0 ? (double) charCount / wordCount : 0));
        System.out.println("Загальна кількість символів: " + charCount);
    }
}