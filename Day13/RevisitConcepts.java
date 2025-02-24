package Day13;

class Student{
    String name;
    // Initilizer block
    {
        System.out.println("inside init block");
    }
    // method or constructor overloading
    Student(){
        System.out.println("constructor");
        /*default const */
    }
    Student(String name){
        this.name = name;
    }
}

public class RevisitConcepts {
    public static void main(String[] args) {
        String str = "    hey my name is mohit   ";
        str = str.trim();
        str = str.toUpperCase();
        str = str.toLowerCase();
        System.out.println(str);
        // str+=" Bisht";
        // to iterate
        for(int i = 0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
        for(var vh : str.toCharArray()){
            System.out.println(vh);
        }
        String str2 = new String("Mohit");
        if(str.equalsIgnoreCase(str2))System.out.println("They are same");
        if(str.contains(str2))System.out.println("yes");

        // else System.out.println("they are not same!");
        // System.out.println("hey my name is "+str);
        // Student obj = new Student();
        // Student obj2 = new Student();
        // Student obj3 = new Student();
    }
}
