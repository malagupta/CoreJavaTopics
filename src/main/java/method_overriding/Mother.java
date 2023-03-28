package method_overriding;

public class Mother {

    // Instance methods
    public void developApplications() {
        System.out.println("Plan the project");
        System.out.println("Code using COBOL");
        System.out.println("Test");
    }
    private void secret() { }
    void subclassesInSamePackage() { }
    protected void allSubclasses() { }

    public void baseClassPublicMethod(String aValue) {
        //
    }

    // Static methods
    static public void staticPublic() { }
    static private void staticPrivate() { }
    static void staticDefault() { }
    static protected void staticProtected() { }

}
