package testTwo;

/**
 * @author YuZhenni
 * @date 12:19.
 */
public class Telphone {
    float screen;
    float cpu;
    float mem;
    int var=4;
    void call(){
        int localVar=1;
        int var=2;
        System.out.println("localVar"+localVar);
        System.out.println("var"+var);
        System.out.println("打电话功能");
    }
    void sendMessage(){
        System.out.println("var"+var);
        System.out.println("screen:"+screen+"cpu"+cpu+"mem"+mem+"发短信功能");

    }
}
