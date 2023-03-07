import java.util.*;

/*Пусть дан список сотрудников: Иван, Пётр, Антон и так далее.
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
Отсортировать по убыванию популярности. */
public class Task2 {
    public static void main(String[] args) {

        // список с именами
        List<String> names = new ArrayList<>();
        names.add("Петров");
        names.add("Иванов");
        names.add("Лебедев");
        names.add("Голубев");
        names.add("Петров");
        names.add("Лебедев");
        names.add("Петров");
        names.add("Пушкин");
        names.add("Котиков");
        names.add("Васильев");

        // словарь в котором будут имена с кол-вом
        Map<String, Integer> countOfNames = new TreeMap<>();

        // заполняем словарь
        for (String name : names) {
            if (countOfNames.containsKey(name)) {
                countOfNames.put(name, countOfNames.get(name) + 1);
            } else {
                countOfNames.put(name, 1);
            }
        }

        System.out.println(countOfNames);

        // переводим словарь в список для будущей сортировки

        // List<String> sortCountNames = new ArrayList<>();

        ArrayList<Integer> dsdfsIntegers = new ArrayList<>();

        List<Integer> ListofKeys = new LinkedList(countOfNames.keySet());
        System.out.println(ListofKeys);
        List<String> ListofValues = new LinkedList(countOfNames.values());
        System.out.println(ListofValues);


        
        // Collections.sort(names);
        // Collections.sort(names);
        System.out.println(names);
    }
}
