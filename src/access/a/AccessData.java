package access.a;

public class AccessData {

    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("publicMethod 호출" + publicField);
    }

    void defaultMethod() {
        System.out.println("defaultMethod 호출" + defaultField);

    }

    void privateMethod() {
        System.out.println("privateMethod 호출" + privateField);
    }

    // innerAccess() 내부 호출을 보여줌(자기 자신에게 접근하는 것, 모든 곳에 접근 가능)
    public void innerAccess() {
        System.out.println("내부 호출");
        publicField = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();

    }
}
