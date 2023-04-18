import java.util.List;

public enum BlackList {
    TERRORISTS(List.of("Scott McCall", "Deyzi Lower")),
    EXSTREMISTS(List.of("Tereza Swan", "Stive Stelinski")),
    OTMYVALSHIK(List.of("Paul Hale", "Lily Rose"));


    private List <String> list;

    BlackList(List<String> list) {
        this.list = list;
    }

    public List<String> getList() {
        return list;
    }
}
