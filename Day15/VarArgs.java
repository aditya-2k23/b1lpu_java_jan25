package Day15;

public class VarArgs {
    public static void demo(String str,int... arg){
        System.out.println("the values i have received in var arg are ");
        for(var e : arg)System.out.println(e);
    }
    // using mehtod overloading also we can achive what vararg are doing but the issue with is that we have to
    // write duplicate code which will be not good
    public static void main(String[] args) {
        demo("Mohit");
        demo("Mohit",1);
        demo("mohit",1,2,3,4,5,6,7,8,9);
    }
}
