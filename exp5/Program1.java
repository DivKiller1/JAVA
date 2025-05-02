class SuperClass {
    private String member = "VINEET";
    
    public String accessMember() {
        System.out.println("Inside Super Class");
        return this.member;
    }
}

class SubClass extends SuperClass {
    public void subAccessMember() {
        System.out.println("Inside Sub Class");
        
        String mem = super.accessMember(); 
        System.out.println("Member of a Super Class is: " + mem);
    }
}

public class Program1 {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.subAccessMember();
    }
}
