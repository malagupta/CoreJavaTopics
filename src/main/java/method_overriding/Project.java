package method_overriding;

public class Project {
    public static void main(String[] args) {
        final var mother = new Mother();
        //mother.developApplications();

        final var daughter = new Daughter();
        daughter.developApplications();
    }
}
