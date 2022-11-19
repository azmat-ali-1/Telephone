public interface telephone {


    public  boolean powerOn();
    public void makeCall(String phoneNo);
    public void incomingCall(String phoneNo);
    public  void answerCall();
    public void rejectCall();
    public boolean isRinging();
}
