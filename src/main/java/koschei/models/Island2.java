package koschei.models;

public class Island2 {
    private final Wood3 wood;

    //Когда 1 конструктор можно не указывать @Autowired
    public Island2(Wood3 wood) {
        this.wood = wood;
    }

    @Override
    public String toString() {
        return ", на острове дерево " + wood.toString();
    }
}
