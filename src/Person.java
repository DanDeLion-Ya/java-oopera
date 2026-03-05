public class Person {
    public String name; // имя актёра/режиссёра
    public String surname; // фамилия актёра/режиссёра
    public Gender gender; // пол актёра/режиссёра

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }
}