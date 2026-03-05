public class MusicalShow {
    public String musicAuthor;
    public String librettoText;

    public MusicalShow (String musicAuthor, String librettoText) {
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibrettoText() {
        System.out.println(librettoText);
    }
}
