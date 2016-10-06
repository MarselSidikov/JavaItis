package ru.itis;

public class Main {

    public double div(int x, int y) {
        return x / y;
    }
    public static void main(String[] args) {

        // try - помечаем блок кода, в котором необходимо
        // обработать исключительную ситуцию

        try {
            double divResult = 7 / 0;
            System.out.println(divResult);
        }
        // catch - действия при перехвате определенной ошибки
        catch (ArithmeticException e) {
            System.out.println("Div by zero!! Stop it! " + e.getMessage());
            return;
        }
        // блок finally выполняется в любом случае, независимо от того
        // как мы обрабатываем ошибку
        finally {
            System.out.println("I'm always run");
        }

        System.out.println("Hello");

    }
}
