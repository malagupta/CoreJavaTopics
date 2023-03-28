package method_overriding;

public class Daughter extends Mother {
    @Override
    public void developApplications() {
        super.developApplications();
        System.out.println("Code using Java");
    }

}
