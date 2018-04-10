public class C2
{

    public static void main(String[] args) {
        C1 hello = new C1("Craig");
        C1 herro = hello;


        hello.setName("Krug");

        System.out.println(hello.getName());
        System.out.println(herro.getName());
    }
}