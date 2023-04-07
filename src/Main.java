public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditAmount = 1_000_000;
        int creditTerm = 1;
        double creditRate = 9.99;
        int payment = service.calculate(creditAmount, creditTerm, creditRate); // вызываем метод calculate, используя заданные выше данные суммы, года и ставки
        System.out.println("Ежемесячный платеж при кредите " + creditAmount + "руб. на " + creditTerm + " год по ставке " + creditRate + "%: " + payment + " руб ");
        creditTerm = 2; // меняем уже существующую переменную
        payment = service.calculate(creditAmount, creditTerm, creditRate); // повторно вызываем метод calculate
        System.out.println("Ежемесячный платеж при кредите " + creditAmount + "руб. на " + creditTerm + " год по ставке " + creditRate + "%: " + payment + " руб ");
        creditTerm = 3;
        payment = service.calculate(creditAmount, creditTerm, creditRate);
        System.out.println("Ежемесячный платеж при кредите " + creditAmount + "руб. на " + creditTerm + " год по ставке " + creditRate + "%: " + payment + " руб ");
    }
}