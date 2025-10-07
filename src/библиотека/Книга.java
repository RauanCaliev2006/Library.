package библиотека;

public class Книга extends Предмет {
    String автор;
    boolean выдана = false;

    Книга(String id, String название, int год, String автор) {
        super(id, название, год);
        this.автор = автор;
    }

    void выдать() {
        if (!выдана) {
            выдана = true;
            System.out.println("Книга \"" + название + "\" выдана.");
        } else {
            System.out.println("Книга уже выдана!");
        }
    }

    void вернуть() {
        if (выдана) {
            выдана = false;
            System.out.println("Книга \"" + название + "\" возвращена.");
        } else {
            System.out.println("Эта книга не выдана.");
        }
    }

    public String toString() {
        return название + " (" + автор + ", " + год + ")";
    }
}
