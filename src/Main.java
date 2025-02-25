//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Nota mario = new Nota();
        mario.setNota1(9);
        mario.setNota2(10);

        mario.resultado();

        mario.setNota1(2);

        mario.resultado();
    }
}