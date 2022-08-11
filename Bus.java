package Transporttest;

public class Bus extends transport{
    String state="";
    int busnum=1010;
    Bus(){
        this.busnum=this.num+1;
        this.num+=1;
        this.maxPassenger=30;
        this.price=1000;
        this.state="운행중";

    }

    @Override
    public void set_info(int n)//승객 탑승
    {
        if(this.state=="운행중")
        {
            this.currentPassenger+=n;
            if(this.maxPassenger-n<0)
            {
                System.out.println("최대 승객 수 초과");
                this.currentPassenger=0;
                this.maxPassenger=30;
            }
            else
            {
                this.maxPassenger-=n;
                System.out.println("탑승 승객 수: "+n);
                System.out.println("잔여 승객 수: "+this.maxPassenger);
                System.out.println("요금 확인: "+this.price*n);
            }
        }
        else
        {
            System.out.println("운행 중이 아닙니다.");
        }
    }


    @Override
    public void add_fuel(int n)
    {
        this.fuel+=n;

        if(this.fuel<10) {
            System.out.println("주유가 필요합니다.");
            this.state="차고지행";
            if(this.fuel<=0)
            {
                this.fuel=0;
                System.out.println("상태 : 차고지행");
            }
        }

        System.out.println("주유량 :"+this.fuel);


    }
    public void stateChange(String state)
    {

        this.state=state;
    }

    @Override
    public int get_num(){
        return this.busnum;
    }
}
