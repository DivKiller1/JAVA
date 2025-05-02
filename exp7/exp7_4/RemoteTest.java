
interface Remote {
    void powerOn();
    void powerOff();
    void changeChannel(int channel);
}

class Television implements Remote {
    @Override
    public void powerOn() {
        System.out.println("TV is now on");
    }

    @Override
    public void powerOff() {
        System.out.println("TV is off");
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println("Channel changed to " + channel);
    }
}

public class RemoteTest {
    public static void main(String[] args) {
        Remote myRemote = new Television(); 

        myRemote.powerOn();
        myRemote.changeChannel(5);
        myRemote.powerOff();
    }
}
