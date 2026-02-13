public class Pessoa {
    String showMessage() {
        return "Hello World!!";
    }
    void helloWorld() {
        System.out.println("Hello World!!");
    }

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        System.out.println(pessoa1.showMessage());
        pessoa1.helloWorld();
        //pessoa1.showMessage();

    }

}

