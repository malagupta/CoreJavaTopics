package generics_intro;
import java.util.ArrayList;
import java.util.List;

record UsedPen(String penType) {}
record UsedPencil(String name, double price) {}

public class ProjectSourcing {
    public static void main(String[] args) {
        List<UsedPen, UsedPencil> usedPens = new ArrayList<>();
        usedPens.add(new UsedPen("Ink Pen"));

    }
}