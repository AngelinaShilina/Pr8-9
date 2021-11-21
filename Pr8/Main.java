import java.util.Scanner; // Импорт стандартного класса Scanner, использующегося для считывания данных.
import java.util.HashMap; // Импорт стандартного класса HashMap, реализующего интерфейс ассоциативного массива.

public class Main // Класс, реализующий отображение из домашних животных.
{
    public static void main(String[] args) // Основная функция.
    {
        HashMap<String, Pet> hashMap = new HashMap<>(); // Объявление объекта hashMap класса HashMap.
        Scanner input = new Scanner(System.in); // Объявление объекта input класса Scanner.

        // Получение набора котов.
        System.out.println("Введите кол-во котов:");
        int size_arrayCats = input.nextInt(); // Считывание введённого числа и его запись в переменную size_arrayCats.
        String[] arrayCats = new String[size_arrayCats]; // Создание массива arrayCats типа String размера size_arrayCats.
        System.out.println("Вводите имена котов через пробел:");
        for (int i = 0; i < size_arrayCats; i++)
        {
            arrayCats[i] = input.next(); // Заполнение массива arrayCats считанными элементами.
        }
        System.out.print("Получен набор котов:");
        for (int i = 0; i < size_arrayCats; i++)
        {
            System.out.print(" " + arrayCats[i]);
            hashMap.put(arrayCats[i], new Cat(arrayCats[i])); // Добавление элементов массива arrayCats в ассоциативный массив hashMap.
        }
        System.out.println();

        // Получение набора собак.
        System.out.println("Введите кол-во собак:");
        int size_arrayDogs = input.nextInt(); // Считывание введённого числа и его запись в переменную size_arrayDogs.
        String[] arrayDogs = new String[size_arrayDogs]; // Создание массива arrayDogs типа String размера size_arrayDogs.
        System.out.println("Вводите имена собак через пробел:");
        for (int i = 0; i < size_arrayDogs; i++)
        {
            arrayDogs[i] = input.next(); // Заполнение массива arrayDogs считанными элементами.
        }
        System.out.print("Получен набор собак:");
        for (int i = 0; i < size_arrayDogs; i++)
        {
            System.out.print(" " + arrayDogs[i]);
            hashMap.put(arrayDogs[i], new Dog(arrayDogs[i])); // Добавление элементов массива arrayDogs в ассоциативный массив hashMap.
        }
        System.out.println();

        // Получение набора сов.
        System.out.println("Введите кол-во сов:");
        int size_arrayOwls = input.nextInt(); // Считывание введённого числа и его запись в переменную size_arrayOwls.
        String[] arrayOwls = new String[size_arrayOwls]; // Создание массива arrayOwls типа String размера size_arrayOwls.
        System.out.println("Вводите имена сов через пробел:");
        for (int i = 0; i < size_arrayOwls; i++)
        {
            arrayOwls[i] = input.next(); // Заполнение массива arrayOwls считанными элементами.
        }
        System.out.print("Получен набор сов:");
        for (int i = 0; i < size_arrayOwls; i++)
        {
            System.out.print(" " + arrayOwls[i]);
            hashMap.put(arrayOwls[i], new Owl(arrayOwls[i])); // Добавление элементов массива arrayOwls в ассоциативный массив hashMap.
        }
        System.out.println(); // Переход на следующую строку.

        System.out.println("Создано отображение полученного набора:");
        System.out.println(hashMap); // Отображение полученного набора.

        // Добавление новых элементов.
        hashMap.put("!Кузя!", new Cat("Кузя"));
        System.out.println("Добавлен кот Кузя. Его ключ: \"!Кузя!\".");
        hashMap.put("!Бобик!", new Dog("Бобик"));
        System.out.println("Добавлен пёс Бобик. Его ключ: \"!Бобик!\".");
        hashMap.put("!София!", new Owl("София"));
        System.out.println("Добавлен София. Его ключ: \"!София!\".");



        System.out.println("Создано отображение после добавления элементов:"); // Вывод в консоль "Создано отображение после добавления элементов:".
        System.out.println(hashMap); // Отображение после добавления новых элементов.
    }
}