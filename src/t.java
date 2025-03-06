abstract class testabstract {
    int a=0;
    public abstract void test();
}
class test extends testabstract{
        @Override
        public void test(){
            System.out.println(a);
        }
    }
public class t{
    public static void main(String[] args) {
        test tt=new test();
        tt.test();
    }
}


