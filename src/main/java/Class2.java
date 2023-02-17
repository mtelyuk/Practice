public class Class2 implements NewInterface {

    public static void main(String[] args) {

        NewInterface name1 = new Class2();

        name1.method3();
        name1.method4(3);


    }

    @Override
    public void method3() {

    }

    @Override
    public Boolean method4(int num) {
        return null;
    }
}
