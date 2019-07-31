package com.assignment.code;

public class Armstrong {
	
    public static void main(String[] args) {

    	Armstrong armstrong = new Armstrong();

        int num = 100;

        if (armstrong.checkArmstrongExample(num))
            System.out.println("\"" + num + "\" is a armstrong.");
        else
            System.out.println("\"" + num + "\" is not a armstrong.");

    }
	public boolean checkArmstrongExample(Integer num) {
		int rem,limit=1000, sum = 0; int temp = 0;
		temp = num;
		System.out.print("Armstrong numbers from 1 to N:");
		for (int i = 100; i <= limit; i++)
		{
			num = i;
			while (num > 0)
			{
				rem = num % 10;
				sum = sum + (rem*rem*rem);
				num = num / 10;
			}
	 
			if (sum == i)
			{
				System.out.print(i + " ");
			}
			sum = 0;
		}
		if (temp == sum)
			return true;
		else
			return false;
	}
}