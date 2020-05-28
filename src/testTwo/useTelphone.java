package testTwo;

/**
 * @author YuZhenni
 * @date 12:31.
 */
public class useTelphone {

    public static void main(String[] args) {

        Telphone phone=new Telphone();
        phone.call();
        phone.cpu=3.2f;
        phone.mem=6.3f;
        phone.screen=34.4f;
        phone.sendMessage();

    }
}
