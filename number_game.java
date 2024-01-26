import java.util.Random;
import java.util.Scanner;
class game
{
    int number;
    int inputNo;
    int guess_no=1;
    
    int getGuessNo()
    {
        return guess_no;
    }
    void setGuessNo(int guess_no)
    {
        this.guess_no=guess_no;
    }


    game()
    {
        Random rand= new Random();
        this.number=rand.nextInt(100);
    }

    void userInput()
    {
        System.out.println("which number you want to guess:");
        Scanner s= new Scanner(System.in);
        inputNo=s.nextInt();
    }
    boolean isCorrectNumber()
    {
        if(inputNo==number)
        {
            guess_no++;
            System.out.println("number" +" "+number+ " "+"you have guessed is right in"+guess_no+"attempts");
            return true;
        }
        else if (inputNo <= number)
        {
            System.out.println("number is too low");
        }
        else if(inputNo> number)
        {
            System.out.println("number is to high");
        }
        return false;
    }
}
class number_game
{
    public static void main(String args[])
    {
        game g =new game();
        boolean b = false;
        while(!b)
        {
            g.userInput();
            b=g.isCorrectNumber();
            System.out.println(b);
        }
    }
}

    