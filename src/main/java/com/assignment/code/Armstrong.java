package com.assignment.code;

public class Armstrong {
	
    public static void main(String[] args) {

    	Armstrong armstrong = new Armstrong();

        int num = 136;

        if (armstrong.checkArmstrongExample(num))
            System.out.println("\"" + num + "\" is a armstrong.");
        else
            System.out.println("\"" + num + "\" is not a armstrong.");

    }
	public boolean checkArmstrongExample(Integer num) {
		int c = 0, a, temp;
		temp = num;
		while (num > 0) {
			a = num % 10;
			num = num / 10;
			c = c + (a * a * a);
		}
		if (temp == c)
			return true;
		else
			return false;
	}
}