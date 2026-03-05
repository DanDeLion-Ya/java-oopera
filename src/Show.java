import java.util.ArrayList;

public class Show {
    public String title; // название спектакля
    public int duration; // длительность в минутах
    public String director; // режиссёр
    public ArrayList<Actor> listOfActors; // список актёров

    public Show(String title, int duration, String director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActorInList(Actor newActor) {
        if (!listOfActors.contains(newActor)) {
            listOfActors.add(newActor);
        } else {
            System.out.println("Этот актёр уже играет в спектакле!");
        }
    }

    public void changeActor(String surnameOldActor, Actor newActor) {
        Actor foundActor = null;
        for (Actor actor : listOfActors) {
            if (actor.surname.equals(surnameOldActor)) {
                foundActor = actor;
                break;
            }
        }
        if (foundActor != null) {
            listOfActors.remove(foundActor);
            listOfActors.add(newActor);
        } else {
            System.out.println("Актёр с фамилией " + surnameOldActor + " не найден!");
        }
    }
}
