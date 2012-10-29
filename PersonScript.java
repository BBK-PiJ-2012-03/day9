public class PersonScript {

 public static void main(String[] args) {
 PersonScript script = new PersonScript();
 script.launch();
 }
 
 public void launch() {
 Person me = new Person();
 
 System.out.println(me.getInitials("Alex     Roko"));
 
 }
 }