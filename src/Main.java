public class Main {
    public static void main(String[] args) {
        deskphone d1 = new deskphone("123254345");
        deskphone d2 = new deskphone("56789");

        d1.incomingCall("12345");
        if(d1.isRinging()){
            d1.answerCall();
        }
        else{
            System.out.println("NO incoming or Wrong Number");
        }
        //Recieving a call
    }
}