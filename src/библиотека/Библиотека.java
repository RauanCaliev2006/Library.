package библиотека;

import java.util.ArrayList;

public class Библиотека {
    ArrayList<Предмет> список = new ArrayList<>();

    void добавить(Предмет п) {
        список.add(п);
    }

    void показатьВсе() {
        System.out.println("Все предметы:");
        for (Предмет п : список) {
            System.out.println(" - " + п.название + " (" + п.год + ")");
        }
    }

    void поиск(String слово) {
        System.out.println("Результаты поиска по \"" + слово + "\":");
        for (Предмет п : список) {
            if (п.название.toLowerCase().contains(слово.toLowerCase())) {
                System.out.println("Найдено: " + п.название);
            }
        }
    }

    void выдать(String название) {
        for (Предмет п : список) {
            if (п instanceof Книга && п.название.equalsIgnoreCase(название)) {
                ((Книга) п).выдать();
                return;
            }
        }
        System.out.println("Такой книги нет или это журнал!");
    }

    void вернуть(String название) {
        for (Предмет п : список) {
            if (п instanceof Книга && п.название.equalsIgnoreCase(название)) {
                ((Книга) п).вернуть();
                return;
            }
        }
        System.out.println("Такой книги нет!");
    }

    void сортироватьПоГоду() {
        for (int i = 0; i < список.size() - 1; i++) {
            for (int j = 0; j < список.size() - i - 1; j++) {
                if (список.get(j).год > список.get(j + 1).год) {
                    Предмет tmp = список.get(j);
                    список.set(j, список.get(j + 1));
                    список.set(j + 1, tmp);
                }
            }
        }
        System.out.println("Отсортировано по году:");
        for (Предмет п : список) {
            System.out.println(п.название + " (" + п.год + ")");
        }
    }
}
