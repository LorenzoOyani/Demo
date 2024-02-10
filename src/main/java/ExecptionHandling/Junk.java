package ExecptionHandling;

public class Junk extends Throwable {
    void main(){
        try{
            a();
        }catch(HighLevelException e) {
            e.printStackTrace();

        }
    }
    public static void a() throws HighLevelException{
        try{
            b();
        }catch(MidLevelException e){
            throw new HighLevelException(e);
        }

    }
    public static void b() throws MidLevelException {
        c();

    }
    public static void c() throws MidLevelException {
        try{
            d();
        }catch(LowLevelException e) {
            throw new MidLevelException(e);
        }
    }
    public static void d() throws LowLevelException {
        e();
    }

    public static void e() throws LowLevelException {
        throw new LowLevelException();
    }
}
class HighLevelException extends Exception{
    HighLevelException(Throwable cause){
        super(cause);
    }


}
class MidLevelException extends Exception{
    MidLevelException(Throwable cause){super(cause);}

}
class LowLevelException extends Exception{

}
