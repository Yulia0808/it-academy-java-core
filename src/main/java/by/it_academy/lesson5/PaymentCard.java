package by.it_academy.lesson5;

public class PaymentCard {

    private double balance;

    PaymentCard(double balance) {

        this.balance = balance;
    }

    public String toString() {
        String info = "The card has a balance of " + balance;
        return info;
    }

    void eatAffordably() {
        if (balance - 2.6 > 0)
            balance -= 2.6;
    }

    void eatHearty() {
        if (balance - 4.6 > 0)
            balance -= 4.6;
    }

    void addMoney(double amount) {
        if (amount >= 0)
            balance += amount;
    }

    public static void main(String[] args) {
        PaymentCard paymentCard = new PaymentCard(10);

        System.out.println("check balance: " + paymentCard);


        paymentCard.eatAffordably();
        System.out.println("check eatAffordably: = " + paymentCard);

        paymentCard.eatHearty();
        System.out.println("check eatHearty: = " + paymentCard);

        paymentCard.eatAffordably();
        System.out.println("check eatAffordably if balance < 2.6: = " + paymentCard);

        paymentCard.eatHearty();
        System.out.println("check eatHearty if balance < 4.6: " + paymentCard);

        paymentCard.addMoney(5);
        System.out.println("check addMoney: = " + paymentCard.toString());

        paymentCard.addMoney(-100);
        System.out.println("check addMoney if count negative: = " + paymentCard);
    }
}

