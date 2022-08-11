package Transporttest;

public class taxi extends transport{
    String destination="";
    int distance=1;
    int basePrice=3000;
    int pricePermile=1000;
    int pocket=0;
    int taxinum=0;
    String state="일반";
    taxi()
    {
        //true는 일반 false는 운행불가
        this.taxinum=this.num+1;
        this.num+=1;
        this.maxPassenger=4;
    }

    public void get_info()
    {

        System.out.println("주유량 :"+this.fuel);
        System.out.println("상태: "+this.state);
    }
    @Override
    public void set_info(int n){
        if(this.state=="일반")
        {
            this.currentPassenger+=n;
            if(this.currentPassenger>this.maxPassenger)
            {
                this.currentPassenger=0;
                this.maxPassenger=4;
                System.out.println("최대 승객 수 초과");
            }
            else {
                this.maxPassenger-=this.currentPassenger;
                this.state="운행중";
                System.out.println("탑승 승객 수 :"+this.currentPassenger);
                System.out.println("잔여 승객 수 :"+this.maxPassenger);
                System.out.println("기본 요금 확인 :"+this.basePrice);
                System.out.println("목적지 :"+this.destination);
                System.out.println("목적지까지 거리 :"+this.distance+"km");
                System.out.println("지불할 요금: "+(this.basePrice+(this.distance)*this.pricePermile));
                System.out.println("상태 :"+this.state);
            }
        }
        else
        {
            System.out.printf("운행이 불가능한 상태");
        }


    }


    public void set_info(int n,String destinate,int distance)
    {

        if(this.state=="일반")
        {
            this.currentPassenger+=n;
            if(this.maxPassenger-n<0)
            {
                System.out.println("최대 승객 수 초과");
                this.currentPassenger=0;
                this.maxPassenger=4;

            }
            else {
                this.maxPassenger-=n;
                this.destination=destinate;
                this.distance=distance;
                this.state="운행중";
                System.out.println("탑승 승객 수 :"+this.currentPassenger);
                System.out.println("잔여 승객 수 :"+this.maxPassenger);
                System.out.println("기본 요금 확인 :"+this.basePrice);
                System.out.println("목적지 :"+this.destination);
                System.out.println("목적지까지 거리 :"+this.distance+"km");
                System.out.println("지불할 요금: "+(this.basePrice+(this.distance-1)*this.pricePermile));
                System.out.println("상태 :"+this.state);
            }
        }
        else
        {
            System.out.printf("운행이 불가능한 상태");
        }


    }
    public void paid()
    {
        this.pocket+=basePrice+(this.distance-1)*this.pricePermile;
        System.out.println("누적 요금 : "+this.pocket +"원");
        this.state="일반";
    }
    @Override
    public void add_fuel(int n)
    {
        this.fuel+=n;
        System.out.println("주유량 :"+this.fuel);
        if(this.fuel<10) {
            System.out.println("주유가 필요합니다.");
            this.state="운행불가";
            if(this.fuel<=0)
            {
                this.fuel=0;
            }
            System.out.println("상태 : 운행불가");
        }
        else
        {
            this.state="일반";
        }

    }
    @Override
    public int get_num(){
        return this.taxinum;
    }

}
