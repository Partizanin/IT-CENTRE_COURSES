package BASE.Homework.HomeWork3;

import BASE.Classwork2.Ex1;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created with Intellij IDEA.
 * User:partizanin
 * Date:04.01.14
 * Time: 16:53.
 * To change this template use File|Settings|File Templates.
 */
class MorsKoiBoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер поля");
        int a = sc.nextInt();
        Game(a);
    }

    public static void Game(int size) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[size][size];

        int userY = 0;
        int userX = 0;

        int randX = 5;/*(int) (Math.random() * size);*/
        int randY = 5; /*(int) (Math.random() * size);*/


        for (;;){

       /* System.out.println("Rand x = "+randX);
        System.out.println("Rand y = "+randY);*/

            for (; ; ) {
                try {
                    System.out.println("Input index x: ");
                    userX = sc.nextInt();
                    System.out.println("Input index y :");
                    userY = sc.nextInt();
                } catch (NoSuchElementException e) {
                    System.err.println("You input wrong number");
                }

                if (userX > arr.length || userY > arr.length
                        && userX < arr.length || userY < arr.length) {
                    System.err.println("Your input large number\nPleas try again");
                } else {
                    break;
                }
            }

                if (userX < randX && userY < randY) {

                    for (int i = userX; i <= userX; i++) {
                        for (int j = userY; j <= userY; j++) {

                            arr[userX - 1][userY - 1] += 1;
                            Ex1.printMatrix(arr);
                            System.out.println("Right\nDown");

                        }
                    }

                } else if (userX > randX && userY > randY) {

                    for (int i = userX; i <= userX; i++) {
                        for (int j = userY; j <= userY; j++) {

                            arr[userX - 1][userY - 1] += 1;
                            Ex1.printMatrix(arr);
                            System.out.println("Left\nUp");
                        }
                    }

                } else if (userX > randX && userY < randY) {

                    for (int i = userX; i <= userX; i++) {
                        for (int j = userY; j <= userY; j++) {

                            arr[userX - 1][userY - 1] += 1;
                            Ex1.printMatrix(arr);
                            System.out.println("Left\nDown");

                        }
                    }


                } else if (userX < randX && userY > randY) {

                    for (int i = userX; i <= userX; i++) {
                        for (int j = userY; j <= userY; j++) {

                            arr[userX - 1][userY - 1] += 1;
                            Ex1.printMatrix(arr);
                            System.out.println("Right\nUp");

                        }
                    }


                } else if (userX == randX && userY < randY) {

                    for (int i = userX; i <= userX; i++) {
                        for (int j = userY; j <= userY; j++) {

                            arr[userX - 1][userY - 1] += 1;
                            Ex1.printMatrix(arr);
                            System.out.println("Down");

                        }
                    }


                } else if (userX == randX && userY > randY) {

                    for (int i = userX; i <= userX; i++) {
                        for (int j = userY; j <= userY; j++) {

                            arr[userX - 1][userY - 1] += 1;
                            Ex1.printMatrix(arr);
                            System.out.println("Up");

                        }
                    }


                } else if (userX > randX && userY == randY) {

                    for (int i = userX; i <= userX; i++) {
                        for (int j = userY; j <= userY; j++) {

                            arr[userX - 1][userY - 1] += 1;
                            Ex1.printMatrix(arr);
                            System.out.println("Left");

                        }
                    }


                } else if (userX < randX && userY == randY) {

                    for (int i = userX; i <= userX; i++) {
                        for (int j = userY; j <= userY; j++) {

                            arr[userX - 1][userY - 1] += 1;
                            Ex1.printMatrix(arr);
                            System.out.println("Right");

                        }
                    }


                }

                if (userX == randX && userY == randY) {

                    System.out.println("Your Win!!!");

                    break;
                }
        }

    }
}

