package библиотека;

public class Main {
    public static void main(String[] args) {
        Библиотека б = new Библиотека();

        Книга к1 = new Книга("1", "Война и мир", 1869, "Толстой");
        Книга к2 = new Книга("2", "Гарри Поттер", 1997, "Роулинг");
        Журнал ж1 = new Журнал("3", "National Geographic", 2024, 10);

        б.добавить(к1);
        б.добавить(к2);
        б.добавить(ж1);

        б.показатьВсе();

        System.out.println();
        б.поиск("Война");

        System.out.println();
        б.выдать("Война и мир");
        б.выдать("Гарри Поттер");
        б.выдать("National Geographic");

        System.out.println();
        б.вернуть("Война и мир");

        System.out.println();
        б.сортироватьПоГоду();
    }
}
