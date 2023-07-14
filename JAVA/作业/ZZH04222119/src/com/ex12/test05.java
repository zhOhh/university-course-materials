package com.ex12;

import java.util.Random;

import java.util.Random;

public class test05 {

    public static void main(String[] args) {
        Game game = new Game();
        Player player1 = new Player(game);
        Player player2 = new Player(game);

        player1.start();
        player2.start();
    }

}

class Game {
    private int number;
    private boolean guessed;

    public synchronized void setNumber(int number) {
        this.number = number;
        guessed = false;
        notify();
    }

    public synchronized String guess(int guess) throws InterruptedException {
        while (guessed || number == 0) {
            wait();
        }
        if (guess < number) {
            return "猜小了";
        } else if (guess > number) {
            return "猜大了";
        } else {
            guessed = true;
            return "猜对了";
        }
    }
}

class Player extends Thread {
    private Game game;
    private Random random;

    public Player(Game game) {
        this.game = game;
        random = new Random();
    }

    @Override
    public void run() {
        while (true) {
            try {
                int guess = 0;
                String result;
                synchronized (game) {
                    if (guess == 0) {
                        game.wait();
                        guess = random.nextInt(100) + 1;
                        System.out.println(Thread.currentThread().getName() + " 猜测的数是：" + guess);
                        game.notify();
                    } else {
                        result = game.guess(guess);
                        System.out.println(Thread.currentThread().getName() + " " + result);
                        if (result.equals("猜对了")) {
                            break;
                        }
                        game.notify();
                        game.wait();
                    }
                }
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
