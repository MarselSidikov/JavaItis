
public class SimpleClass {

    public int x;
    public int y;

    public int FieldInt;

    private String privateStringField;


    public SimpleClass() {
        FieldInt = 10;
        privateStringField = "Hello";
    }

    public SimpleClass(int FieldInt, String privateStringField) {
        this.FieldInt = FieldInt;
        this.privateStringField = privateStringField;
    }

    public int calc(int a, int b) {
        return a + b;
    }

    public int mult(int c) {
        return (x + y) * c;
    }

    private void show() {
        System.out.println(privateStringField);
    }
}
