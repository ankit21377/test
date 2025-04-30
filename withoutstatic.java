public class withoutstatic {
    void greeting(){
        System.out.println("hello");
    
    }
    public static void main(String[] args){
        withoutstatic great = new withoutstatic();
        great.greeting();
    }
}
