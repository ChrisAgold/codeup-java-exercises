public class Person {
    private String personName;

    public Person (String name) {
        personName = name;
    }

    public String getName() {
        return this.personName;
    }

    public void setName(String name){
        //TODO: change the name property to the passed value
        personName = name;
    }

    // METHODS //

    public void sayHello(){
        //TODO: print a message to the console using the person's name
        System.out.println("Hello " + personName);
    }
}