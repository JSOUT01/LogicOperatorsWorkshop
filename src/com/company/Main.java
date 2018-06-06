package com.company;

public class Main {

    public static void main(String[] args) {
	/*
	    Relational Operators
	    <  - Less than
	    <= - Less than OR equal to
	    >  - Greater than
	    >= - Greater than OR equal to
	    == - Equals
	    != - not equal to

	    Logical Operators
	    && - AND
	    || - OR
	    !  - NOT


	 */

        int a = 2;
        int b = 4;
        int x = 6;
        int y = 1;

        System.out.println("a = 2");
        System.out.println("b = 4");
        System.out.println("x = 6");
        System.out.println("y = 1");

        if (a == x && y + y == a) {
            //will this method run?
            System.out.println("a == x && y + y == a");
        }
        //No, This wil not run because a does NOT equal x even though y + y does equal a.
        if (a == x || y + y == a) {

            //will this method run?
            System.out.println("a == x || y + y == a");
            //Yes, This will run because one of our conditions is true. All you need is a single true condition for an OR operator to be true.
        }

        if (a != x && y + y == a) {
            //will this method run?
            System.out.println("a != x && y + y == a");
            //Yes, This will run because one of our conditions is true. All you need is a single true condition for an OR operator to be true.

        }

        // Less than <
        if (a < b) {
            // Will this method run?
            System.out.println("a < b");
            // yes, this will run because the value of a is less than the value of b
        }

        //Less than or equal to
        if (a < x) {
            System.out.println("a < x");
        }
        if (x > y) {
            System.out.println("x > y");
        }
        if (b > y) {
            System.out.println("b > y");
        }
        if (x > y) {
            System.out.println("x > y");
        }
        if (x != y) {
            System.out.println("x != y");
        }
    }
}