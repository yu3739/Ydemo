package testThree;

/**
 * @author YuZhenni
 * @date 15:59.
 */
public class Telphone {
    float screen;
    float cpu;
    float mem;//成员变量

    public Telphone(){
        System.out.println("无参数的构造方法");
    }

    public Telphone(float newScreen,float newCpu,float newMem){//参数

        if (newScreen <3.5f) {
            System.out.println("自动3.5");
            screen=3.5f;
        }else{
            screen=newScreen;
        }


        screen=newScreen;//用参数给成员变量赋值（把参数的值赋值给成员变量）
        cpu=newCpu;
        mem=newMem;
        System.out.println("有参数的构造方法"+"cpu"+cpu+"screen"+screen+"mem"+mem);
    }
}
