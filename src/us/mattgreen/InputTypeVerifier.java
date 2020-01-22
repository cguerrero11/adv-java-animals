package us.mattgreen;

public class InputTypeVerifier {
    int micekilled;
    int age;
    boolean nice;
    String name;
    int type;
    public void Verify(int num, String name, boolean good, int type) {
        if (type == 1) {
            this.age = num;
            this.name = name;
        } else if(type == 2){
            this.micekilled = num;
            this.name = name;
        } else if(type == 3){
            this.nice = good;
            this.name = name;
        } else {
            System.out.println("Input is not valid.");
        }
        this.type = type;
    }
}
