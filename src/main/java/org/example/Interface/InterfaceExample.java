package org.example.Interface;

class Phone
{
    public void call() { System.out.println("Phone call"); }
    public void sms() { System.out.println("Phone sending SMS"); }
}

interface ICamera
{
    void click();
    void record();
}

interface IMusicPlayer
{
    void play();
    void stop();
}

class SmartPhone extends Phone implements ICamera,IMusicPlayer
{
    public void videoCall() { System.out.println("Smart Phone video calling"); }

    public void click() { System.out.println("Smart Phone Clicking Photo"); }
    public void record() { System.out.println("Smart Phone recording video"); }
    public void play() { System.out.println("Smart Phone playing music"); }
    public void stop() { System.out.println("Smart Phone stopped playing music"); }

}
public class InterfaceExample
{

    public static void main(String[] args)
    {

//        SmartPhone sp1=new SmartPhone();
//        sp1.call();
//        sp1.click();
//        sp1.play();
        IMusicPlayer sp2=new SmartPhone();
        sp2.play();
        sp2.stop();
//        Phone sp=new SmartPhone(); so here the ref is Phone so we can call only phone class method
//        sp.call();
//        sp.sms();
//        ICamera sp=new SmartPhone();
//        sp.click();
//        sp.record();

    }

}