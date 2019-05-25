public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl("Black");
        remoteControl.volumeUp();
        remoteControl.volumeUp();
        remoteControl.volumeUp();

        remoteControl.nextChannel();
        remoteControl.nextChannel();

        System.out.println(remoteControl.getCurrentVolume());
        System.out.println(remoteControl.getCurrentChannel());

        remoteControl.setCurrentChannel(30);
        remoteControl.setCurrentVolume(55);

        System.out.println(remoteControl.getCurrentChannel());
        System.out.println(remoteControl.getCurrentVolume());

        System.out.println(remoteControl.getColor());
    }
}
