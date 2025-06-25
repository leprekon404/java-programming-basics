package org.javaguru.student_anton_krivonogov.lesson_3.level_7;

public class BankAccount {
    private String owner;
    private int money;

    BankAccount(String owner,int money) {
        this.owner = owner;
        this.money = money;
    }

    String getOwner() {
        return owner;
    }

    int getMoney() {
        return money;
    }
}

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String owner = bankAccount.getOwner();
        int money = bankAccount.getMoney();
        System.out.println("Owner = " + owner);
        System.out.println("Money = " + money);
    }

}
