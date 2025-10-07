package библиотека;

public class Журнал extends Предмет {
    int выпуск;

    Журнал(String id, String название, int год, int выпуск) {
        super(id, название, год);
        this.выпуск = выпуск;
    }

    public String toString() {
        return название + " (выпуск " + выпуск + ", " + год + ")";
    }
}
