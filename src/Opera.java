public class Opera extends MusicalShow {
    public int choirSize;

    public Opera (String musicAuthor, String librettoText, int choirSize) {
        super(musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
