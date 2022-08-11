package Transporttest;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        functiontest f=new functiontest(); //함수모음클래스 선언
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("1. 버스");
            System.out.println("2. 택시");
            System.out.println("3. 종료");
            int command = sc.nextInt();
            System.out.println(command);
            if(command==1)
            {
                f.bus_start();
            }
            else if(command==2)
            {
                f.taxi_start();
            }
            else if(command==3)
            {
                break;
            }
            else {
                System.out.println("잘못 입력하셨습니다.");
            }

        }






    }
}
