package main;

/**
 * Created by marcj_000 on 21/08/2016.
 */
public class Arrays {

    /*
    04 ARRAYS

    It's time we get to know some data structures and arrays seems to be the natural starting point.
    So what's an array? An array is a collection of variables of the same type.
    That means you can have multiple values of String or int in an array.
     */

    int[] iArray;

    /*
    Okay, so right off the bat we have declared an array capable of holding integers.
    You can create arrays of any desired type by just adding the square brackets [] after the type.
    You can use arrays as a field, static field, local variable or parameter.
     */

    String[] sArray;
    Index[] indexArray;

    /*
    Note that all the classes we make can be used in an array or any other collection. Unless they're static.
    If you want to get weird, you can actually also declare an array like this:
     */

    String stringArrayWeird[];

    /*
    But don't, because it looks weird.

    Now lets initialize our array. By the way, initializing is also sometimes known as instantiating.
    I like to use both. Don't let this confuse you.
     */

    void initializeArrayMethod(){

        String[] stringArray = new String[10];

    }

    /*
    The number in the brackets indicates how many values the array can hold.
    You can also instantiate like this:
     */

        int[] intArray = new int[]{ 0,1,2,3,4,5,6,6,7,8,9 };
        String[] stringArray = new String[]{ "John", "Jane", "James", "Dick Cheney" };


    /*
    In this way you also specify the size of the array, and what's in it.

    Arrays can be accessed like this:
     */

    void accessArrayMethod(){

        int integer = intArray[0];

        int arraySize = intArray.length;

    }

    /*
     That will get the first index of the array. In Java we count from 0 and not from 1. This is pretty universal
     when coding, so make sure to remember it.

     The second line in the method above gets the size of the array. This is counted from 1, so when you call it,
     you get the correct size.

     In the next section well get to Iteration and Conditions, so there we'll look at how to loop through an array.

     */


}
