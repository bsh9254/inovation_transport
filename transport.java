package Transporttest;

public abstract class transport {
    int maxPassenger=0;
    int currentPassenger=0;
    int price=0;
    static int num=1010;
    int fuel=100;
    int speed=0;


    abstract public void set_info(int n);
    abstract public void add_fuel(int n);
    abstract public int get_num();

    public void speedChange(int speednum)//속도 변경
    {
        if(this.fuel>=10)
        {
            this.speed+=speednum;
        }
        else
        {
            System.out.println("주유량을 확인해 주세요.");
        }
    }
}
