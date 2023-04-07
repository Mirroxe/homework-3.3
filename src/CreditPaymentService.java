public class CreditPaymentService {
    public int calculate (int creditAmount, int creditTerm,double creditRate){
        int creditTermMonth = creditTerm * 12; // перевод года в месяцы
        double creditRateMonth = creditRate / 100 / 12; // процентная ставка за месяц
        double coefficient = (creditRateMonth * Math.pow(1 + creditRateMonth, creditTermMonth)) / (Math.pow(1 + creditRateMonth, creditTermMonth) - 1); // формула аннуитетного платежа
        int monthlyPayment = (int) (creditAmount * coefficient); // месячный платеж в целых числах
        return (int) monthlyPayment; // возвращаем результат вычислений
    }
}
