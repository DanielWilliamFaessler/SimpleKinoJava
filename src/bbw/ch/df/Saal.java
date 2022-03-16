package bbw.ch.df;

public class Saal {
    private Film filme[];
    private String name;
    private int anzSitze;

    public Saal(Film[] filme, String name, int anzSitze) {
        this.filme = filme;
        this.name = name;
        this.anzSitze = anzSitze;
    }

    public void filmeAnzeigen(){
        for (Film film:filme) {
            System.out.println(film.getTitel());
        }
    }

    public String getName() {
        return name;
    }

}
