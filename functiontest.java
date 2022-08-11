package Transporttest;

import java.util.Scanner;

public class functiontest {
    public void bus_start()//버스 정보 확인 인터페이스
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("몇 개의 버스를 생성하시겠습니까?");
        int num=sc.nextInt();
        Bus[] Buslist=new Bus[num];

        for(int i=0;i<num;i++)
        {
            Buslist[i] = new Bus();
        }

        check_duple(Buslist);
        while(true)
        {


            System.out.println("1. 승객 탑승");
            System.out.println("2. 주유");
            System.out.println("3. 상태 변경");
            System.out.println("4. 전 단계로");


            int command = sc.nextInt();

            if(command==1)
            {
                if(Buslist.length==0)
                {
                    System.out.printf("버스를 생성해 주세요.");
                    break;
                }
                else
                {
                    System.out.printf("승객 수를 입력하세요: ");
                    int people=sc.nextInt();
                    Buslist[0].set_info(people);
                }
            }
            else if(command==2)
            {
                System.out.println("주유하실 양을 알려주세요: ");
                int fill=sc.nextInt();
                Buslist[0].add_fuel(fill);
            }
            else if(command==3)
            {
                System.out.println("변경할 상태를 알려주세요.");
                System.out.println("1. 운행중 2. 차고지행");
                int status = sc.nextInt();
                if(status==1){
                    Buslist[0].stateChange("운행중");
                }
                else if(status==2)
                {
                    Buslist[0].stateChange("차고지행");
                }
            }
            else if(command==4)
            {
                break;
            }
            else {
                System.out.println("숫자를 잘못입력하셨습니다.");
            }

        }
    }
    public void taxi_start()//택시 정보 확인 인터페이스
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("몇 개의 택시를 생성하시겠습니까?");
        int num=sc.nextInt();
        taxi[] Taxilist=new taxi[num];

        for(int i=0;i<num;i++)
        {
            Taxilist[i] = new taxi();
        }

        check_duple(Taxilist);

        Taxilist[0].get_info();

        while(true)
        {
            System.out.println("1. 정보 입력");
            System.out.println("2. 주유");
            System.out.println("3. 결제");
            System.out.println("4. 전단계로");

            int command = sc.nextInt();

            if(command==1)
            {
                if(Taxilist.length==0)
                {
                    System.out.printf("택시를 생성해 주세요.");
                    break;
                }
                else
                {
                    System.out.println("승객 수를 입력하세요. ");
                    int people=sc.nextInt();

                    System.out.println("목적지를 입력하세요. ");
                    String desti = sc.next();

                    System.out.println("목적지 거리를 입력하세요. ");
                    int far=sc.nextInt();

                    Taxilist[0].set_info(people,desti,far);
                }
            }
            else if(command==2)
            {
                System.out.println("주유하실 양을 알려주세요. ");
                int fill=sc.nextInt();
                Taxilist[0].add_fuel(fill);
            }
            else if(command==3)
            {
                System.out.println("결제 하시겠습니까? Y/N");
                String YN = sc.next();
                YN=YN.toLowerCase();
                if(YN.equals("y"))
                {
                    Taxilist[0].paid();
                }

            }
            else if(command==4)
            {
                break;
            }
            else {
                System.out.println("숫자를 잘못입력하셨습니다.");
            }

        }
    }
    public void check_duple(Bus[] pClass)//버스 번호 중복 확인
    {
        boolean find=false;

        for(int i=0;i<pClass.length;i++){
            System.out.println((i+1)+"번 차의 번호는 "+pClass[i].get_num());
        }
        for(int j=0;j<pClass.length-1;j++)
        {
            for(int k=j+1;k<pClass.length;k++)
            {
                if(pClass[j].get_num()==pClass[k].get_num())
                {
                    find=true;
                    break;
                }
            }
        }
        if(find==true)
        {
            System.out.println("중복된 번호가 있습니다.");
        }
        else {
            System.out.println("중복된 번호가 없습니다.");
        }
    }
    public void check_duple(taxi[] pClass)//택시 번호 중복 확인(오버로딩)
    {
        boolean find=false;
        for(int i=0;i<pClass.length;i++){
            System.out.println((i+1)+"번 차의 번호는 "+pClass[i].get_num());
        }
        for(int j=0;j<pClass.length-1;j++)
        {
            for(int k=j+1;k<pClass.length;k++)
            {
                if(pClass[j].get_num()==pClass[k].get_num())
                {
                    find=true;
                    break;
                }
            }
        }
        if(find==true)
        {
            System.out.println("중복된 번호가 있습니다.");
        }
        else {
            System.out.println("중복된 번호가 없습니다.");
        }
    }
}
