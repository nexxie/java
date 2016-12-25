package com.company;
//
import java.math.BigDecimal;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Bank {
    static BlockingQueue<String> queue = new LinkedBlockingQueue<>();
    static boolean finished = false;


    public static void main(String[] args) throws InterruptedException {

        Account acc1 = new Account(1, "1st", BigDecimal.valueOf(145));
        Account acc2 = new Account(2, "2nd", BigDecimal.valueOf(150));
        Account acc3 = new Account(3, "3d", BigDecimal.valueOf(10));
        Account acc4 = new Account(4, "4th", BigDecimal.valueOf(10));

        new Thread(new Mailer()).start();

        new Thread(() -> transferMoney(acc1, acc2, BigDecimal.valueOf(10))).start();
        new Thread(() -> transferMoney(acc2, acc3, BigDecimal.valueOf(12))).start();
        new Thread(() -> transferMoney(acc4, acc1, BigDecimal.valueOf(30))).start();
        new Thread(() -> transferMoney(acc4, acc3, BigDecimal.valueOf(52))).start();
        finished = true;


//
    }

    private static void transferMoney(Account acc1, Account acc2, BigDecimal amount) {

        Object lock1 = acc1.getId() > acc2.getId() ? acc1 : acc2;
        Object lock2 = acc1.getId() > acc2.getId() ? acc2 : acc1;
        synchronized (lock1) {
            synchronized (lock2) {
                if (acc1.getBalance().doubleValue() < amount.doubleValue()) {
                    queue.add(Thread.currentThread().getName() + " - Enough founds for transaction ");
                    return;
                } else {

                    acc1.setBalance(BigDecimal.valueOf(acc1.getBalance().doubleValue() - amount.doubleValue()));
                    acc2.setBalance(BigDecimal.valueOf(acc1.getBalance().doubleValue() + amount.doubleValue()));
                    queue.add(Thread.currentThread().getName() +" - Transaction complete from : " + acc1.getName() + " to  " +
                            acc2.getName() + " in an amount " + amount + ". New Balance  " + acc1.getName() + " - " + acc1.getBalance() +
                            ", " + acc2.getName() + " - " + acc2.getBalance());
                }

            }
        }
    }
}




