public class deskphone implements telephone {
    String myPhoneNo;
    boolean ringing;

    public deskphone(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
        this.ringing = false;
    }

    @Override
    public boolean powerOn() {
        System.out.println("Always On");
        return true;
    }

    @Override
    public void makeCall(String phoneNo) {
        System.out.println("Calling" +phoneNo);
    }

    @Override
    public void incomingCall(String PhoneNo) {
        if(myPhoneNo.equals(PhoneNo)){
            ringing=true;
            System.out.println("Incoming Call");
        }
        else{
            System.out.println("Wrong Number");
        }
        //System.out.println("Recieving call");
    }

    @Override
    public void answerCall() {
        System.out.println("Ansering the call");
        ringing = false;
    }

    @Override
    public void rejectCall() {
        System.out.println("Rejecting the Call");
        ringing = false;
    }

    @Override
    public boolean isRinging() {
        if(ringing){
            System.out.println("phone is Ringing");

        }
        return ringing;
    }
}
