package main;

/**
 * Created by marcj_000 on 21/08/2016.
 */
public class ClassesAndScopes {


    /*
    03: Classes and Scopes
    Yaay! You made it this far. Give yourself a pat on the shoulder. So hopefully you understand something about variables,
    data types and methods. Now the real agony begins, because you have to know about classes and scopes, and this'll
    probably end up being a long section, so bear with me.

    Java is an Object Oriented Language. Objects? Yes. To answer that we need to know about Classes.
    So what the actual dogfart are they? As we have seen in earlier sections, we have variables and methods.
    Classes are simply a collection of such, but in a coherent and structured way.

    So Lets write a coherent and structured class.
    But before we begin doing that, I need to explain that were already inside a class, as you can see up top.
    What we're going to do now is write a class within a class. This is know as an inner class. For now, you don't need
    to do that, so I don't need to tell you what it is and how it differs from an outer class.
     */

    public static class Person {

        private int age;
        private String name;
        private String address;
        private int phoneNumber;

        /*
        So here, were writing a Person class. A Person can now have an age, name, address and phone number.

        Note: These are your fields, and you always want to put them up top, after you class declaration.
        Although you when you declare local, or intermediate variables, just create them when you need them.

        So far we have no way of assigning any of these values to a Person. Enter the Constructor:
         */

        public Person(int age, String name, String address, int phoneNumber) {
            this.age = age;
            this.name = name;
            this.address = address;
            this.phoneNumber = phoneNumber;
        }

        /*
        Alright, so there's our constructor. When creating a new object we assign it values through the parameters,
        and then assign them to our local variables inside the class. Hold on. Local?? Local variable are the ones
        inside your class, and you use the keyword "this" to access them when using the same names in the constructor's
        parameters, as done here. It has to do with the scope, that we still haven't talked about.

        Okay, so I probably can't procrastinate anymore. We are going to have to talk about the scope.

        So you can see, that up top this the outer class, we have the keyword "Public". It defines the if and how this
        class can be accessed. Public means that the class and it's methods is accessible to outside classes.
        Anything marked as "Private" is not. So why? Maybe you have a method that only needs to be run inside the
        class. It's then made Private to avoid confusion when accessing the object from the outside.
        There will be examples of this later in this section.


        Anywhozzle. We can now create a Person object using our constructor. Let's add some methods to the Person class.
        The most common method to have in a class, are the Getters and Setters:

         */

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        /*
        The concept of Getters and Setters exists, so you can access the variables from the outside of the class.
        Get returns the variables value, and Set changes it according to the parameter in the method.

        Another common method is the toString method. It is primarily used for debugging.
        A toString method returns the name of the variables and their assigned values into to one complete string:
         */

        @Override
        public String toString() {
            return "Person{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    ", address='" + address + '\'' +
                    ", phoneNumber=" + phoneNumber +
                    '}';
        }

        /*
        Uh-oh! See the @Override tag? So now I accidentally introduced another concept of Java to you: Interfaces.
        Interfaces are closely tied to Inheritance. Those topics are a bit advanced for now, so we'll just ignore
        that tag.

        Alright lastly, lets add our own method:
         */

        public void speak(){
            String sentence = "Hi, my name is " + name + ". I am " + age + " old, and my address is " + ". " +
                    "You can reach me at " + phoneNumber;
        }

        /*
        There. Now out person can speak. So lets try making a Person object:
         */

    }

    public static void main(String[] args) {

        Person examplePerson = new Person(32, "Marc", "SomeAddress 8, 2300s Copenhagen", 55500055);
        examplePerson.speak();

        /*
        Notice that you call a method from an object by putting a period in between the reference to the person and
        the reference to the method. Remember the parenthesis after the method reference and the semicolon.
         */

    }


}
