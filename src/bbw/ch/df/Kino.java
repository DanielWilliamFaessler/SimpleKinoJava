package bbw.ch.df;

public class Kino {
    private String name;
    private Film film1 = new Film("Shrek",200.00);
    private Film film2 = new Film("Donkey",2000000000.00);
    private Film film3 = new Film("Alibaba return of the dictatorship",20.20);
    private Film filme[] = {
            film1,
            film2
        };

    private Saal saal1 = new Saal(filme,"Erwachsenensaal",20);

    private Saal saele[] = {
        saal1
    };

    public Kino(String name) {
        this.name = name;
    }

    public void saeleAnzeigen(){
        for (Saal saal:saele) {
            System.out.println(saal.getName()+": ");
            saal.filmeAnzeigen();
        }
    }
}
