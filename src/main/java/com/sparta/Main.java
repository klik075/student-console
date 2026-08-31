package com.sparta;

public class Main {
    public static void main(String[] args) {
        problem5(30);
    }
    public static void problem1(int num)
    {
        if(num <= 0)
            return;

        for (int i = 0; i < num; i++)
        {
            for (int j = num; j > i; j--)
            {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void problem2(int num)
    {
        for (int i = 1; i <= num; i++)
        {
            for (int j = num; j > i; j--)
            {
                System.out.print(' ');
            }
            for (int j = 0; j < i; j++)
            {
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void problem3(int num)
    {
        if(num <= 0)
            return;

        int maxStar = problem3Or5GetCurrentStar(num);

        for (int lineNum = 1; lineNum <= num; lineNum++)
        {
            int currentStar = problem3Or5GetCurrentStar(lineNum);
            int halfDiff = (maxStar - currentStar) / 2;

            for (int j = 0; j < halfDiff; j++)
            {
                System.out.print(' ');
            }

            for (int j = 0; j < currentStar; j++)
            {
                System.out.print('*');
            }

            for (int j = 0; j < halfDiff; j++)
            {
                System.out.print(' ');
            }

            System.out.println();
        }
    }
    public static int problem3Or5GetCurrentStar(int i)
    {
        return 1 + ((i - 1) * 2);
    }
    public static void problem4(int num)
    {
        if(num <= 0)
            return;

        for (int i = 0; i < num; i++)
        {
            for (int j = 0; j < num; j++)
            {
                if(i == 0 || i == num - 1 || j == 0 || j == num - 1)
                {
                    System.out.print('*');
                    continue;
                }

                System.out.print(' ');
            }

            System.out.println();
        }
    }
    public static void problem5(int num)
    {
        if(num <= 0)
            return;

        int halfNumIndex = num / 2;
        int maxStar = problem3Or5GetCurrentStar(halfNumIndex + 1);

        for (int index = 0; index < num; index++)
        {
            int lineNum;

            if(num % 2 == 0)
            {
                lineNum = index < halfNumIndex ? index + 1 : num - index;
            }
            else
            {
                lineNum = index <= halfNumIndex ? index + 1 : num - index;
            }

            int currentStar = problem3Or5GetCurrentStar(lineNum);
            int halfDiff = (maxStar - currentStar) / 2;

            for (int j = 0; j < halfDiff; j++)
            {
                System.out.print(' ');
            }

            for (int j = 0; j < currentStar; j++)
            {
                System.out.print('*');
            }

            for (int j = 0; j < halfDiff; j++)
            {
                System.out.print(' ');
            }

            System.out.println();
        }
    }
}