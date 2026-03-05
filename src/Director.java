public class Director extends Person {
    public int numberOfShows; // кол-во поставленных спектаклей

    public Director (String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    public void printInfoOfDirector(String name, String surname) {
        System.out.println("Режиссёр спектакля - " + name + surname + " .");
    }

    @Override
    public String toString() {
        return "Режиссёр спектакля - " +
                name + " " +
                surname + ".";
    }
}
