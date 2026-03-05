import java.util.Objects;

public class Actor extends Person {

    public int height; // рост актёра

    public Actor (String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return  "Данные актёра:" +
                " Имя: " + name +
                ", Фамилия: " + surname +
                ", Рост: (" + height +
                ").";
    }

    @Override
    public boolean equals(Object act) {
        if (this == act) return true;
        if (act == null) return false;
        if (this.getClass() != act.getClass()) return false;
        Actor otherActor = (Actor) act;
        return Objects.equals(name, otherActor.name) &&
               Objects.equals(surname, otherActor.surname) &&
               (height == otherActor.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, height, gender);
    }
}

