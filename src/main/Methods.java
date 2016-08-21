package main;

/**
 * Created by Marc on 21-08-2016.
 */
public class Methods {

    /*
    02: METHODS 101

    By now you should know what variable are and how to create them. So let's have a look at how to use them.

    As stated in the previous section, methods are where we can run code, so let's start out with an example. But wait!
    Remember your training! Always use Camel Casing, and adhere to the Coding Conventions. In this case, always name
    your method after what it does, so when other people read your code they don't have to wonder what the heck
    "marcsFacadeMethod1" does.
     */

    void thisMethodDoesNothingAndIsOnlyUsedAsAnExample(){

    }

    /*
    Alright, alright. I might have gone too far with the Naming Conventions, but you get the point.

    Let's have a look a the structure of the method:
    The first part of creating a method is specifying a return type. This can be any of the data type we discussed
    in the previous section, but it can also be a Class. As long as you are specific about specifying, you're golden.
    In this case, we do not want method does not return anything, so we use the "void" return type.
    Next up is naming the method, so we have a reference to it. You know how this part goes, but unlike with the variable,
    the compiler will hate you if you put a semicolon after the name of you method.
    Instead we have the opening and closing parenthesis. Inside these, you can specify what parameters you want the method
    to take when called. Lastly, we have the opening and closing curly-brackets. They specify the scope of the method.
    Now scope is a big subject, which we will only touch lightly upon in this section, just know for now, that whatever's
    inside the curly-brackets will be run during execution, if the method is called, that is.

    Let's make a new method and more fleshed out method. In order to do this, we need some data to put inside it, so
    bring forth the variables:
     */

    byte myAge = 24;

    int myAgeFiveYearsAgo(){

        int result = myAge - 5;

        return result;
    }

    /*
     PRO TIP: Don't ever do this, unless you want to be perceived as a noob.
     Okay so this method is bad for everyone. Why? Well because we're using the a variable outside the method scope
     directly, instead of passing it through as a parameter. So why is this bad you ask? This limits the
     polymorphism of the code, making this method only usable for this exact scenario. When you write code you want to
     have high cohesion and low coupling. Which is fancy-speak for "using hardcoded variables directly is a bad idea".

     So let's do it the right way:
     */

    int ageFiveYearsAgo(int age){

        return age - 5;

    }

    /*
    There! Much better. Now we can use this method to get anybody's age five years ago.
    Notice the return statement. In the previous method, "myAgeFiveYearsAgo", we created and int and then returned that.
    Here, we just return  the result of age - 5.

    Another example:
     */

    int addAges(int firstAge, int secondAge){

        return firstAge + secondAge;

    }

    /*
    Here we have a method with more than one parameter. You can use as many parameters as you like in a method,
    but if you have like 12 different ones, you might want to store them in class, but that's a story for another time.

    Let's run these methods with another method!
     */

    void methodForRunningMethods(){

        byte yourAge = 85; //Please change this number to your own age.

        int myAge5YearsAgo = myAgeFiveYearsAgo();
        System.out.println(myAge5YearsAgo);

        int yourAgeFiveYearsAgo = ageFiveYearsAgo(yourAge);
        System.out.println(yourAgeFiveYearsAgo);

        int myAgePlusYourAge = addAges(myAge, yourAge);
        System.out.println(myAgePlusYourAge);

    }

    /*
     Alright so a lot of stuff is going on here.

     First and foremost:
     System.out.println(); just prints the value to the console. It's primarily used for local debugging,
     So don't forget it, because you'll need it later on. Hotkey/Macro: sout + TAB.

     Secondly, why the heck did I create yourAge as a byte data type variable, when we set the add age params as int?
     The reason I did that was to show you that you Java will accept smaller Integer types when put into bigger ones.
     However you can't put a long into a short. That's like trying to fit a camel through the eye of a needle.

     Thirdly, as you can see, you can initialize a variable with a method call. The variable is happy, as long it gets
     a fitting value.

     Last but not least, as you've probably figured out by now, we're not actually running the method at all.
     The compiler needs an access point to the code - a starting point of sorts. This is known as a Main-method.
     I'll show you what it looks like, but because we haven't talked about classes nor scopes, we can't actually run
     out code with it, with out changing it, so we'll do that in the next section. Here's the main method for now;
     Hotkey/Macro: psvm + TAB.
     */

    public static void main(String[] args) {

    }

    /*
    So you can see that this method has some more code to it:
    The first one is the "public" keyword, which is known as the Access level modifier - again a talk for later.
    The second keyword is the static keyword. Static can be used in both variables and method. Basically static
    means that only one instance of a static field exits, so you can create as many as you want, but there will
    essentially only exist one.

    The annoying thing about the static field is that if you want to run a method inside it, you would have to make
    that method static too. And we don't want to do that. Instead, we can create a class and then call it's methods
    from the main method.
     */


}
