import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        // System.out.println("Поехали!");
        Actor actor1 = new Actor("Константин", "Джекман", Gender.MALE, 172);
        Actor actor2 = new Actor("Хью", "Хабенский", Gender.MALE, 188);
        Actor actor3 = new Actor("Роберта", "Родригесова", Gender.FEMALE, 170);

        Director director1 = new Director("Константин", "Станиславский", Gender.MALE, 16);
        Director director2 = new Director("Кэти", "Митчелл", Gender.FEMALE, 3);

        MusicalShow musicalShow = new MusicalShow("Музыкин", "О - ло - ло");

        Show show = new Show("Властелин колец", 600, "Митчелл", new ArrayList<>());
        Opera opera = new Opera("Музыкин", "Я программирую программу...", 3);
        Ballet ballet = new Ballet("Балалайкин", "Брынь-брынь-брынь...", "Танцоров");

        Show showOpera = new Show("Призрак оперы", 150, "Станиславский", new ArrayList<>());
        Show showBallet = new Show("Лебединое озеро", 120, "Станиславский", new ArrayList<>());

        // Добавление актёров в обычный спектакль
        show.addActorInList(actor1);
        show.addActorInList(actor2);

        // Добавление актёров в Оперу
        showOpera.addActorInList(actor1);
        showOpera.addActorInList(actor2);
        showOpera.addActorInList(actor3);

        // Добавление актёров в Балет
        showBallet.addActorInList(actor1);
        showBallet.addActorInList(actor3);

        // Вывод на экран списка актёров в определённом спектакле
        show.printActors();          // Обычный спектакль
        showOpera.printActors();     // Опера
        showBallet.printActors();    // Балет

        show.changeActor("Джекман", actor3); // Замена одного актёра на другого
        show.printActors();    // Ещё раз вывод списка актёров спектакля

        showBallet.changeActor("Хабенский", actor1); // Замена на несуществующего актёра
        showBallet.printActors();    // Ещё раз вывод списка актёров балета

        //Вывод либретто
        opera.printLibrettoText();     // В опере
        ballet.printLibrettoText();    // В балете
    }
}
