package Main;

/**
 * Created by Marc on 21-08-2016.
 */
public class VariablesAndDataTypes {

    /*
     01: VARIABLES AND DATA TYPES

     A variable is a memory store for data. Since data comes in different forms, we need variables to accommodate them.

     There are two steps to creating a using a variable. First you have to declare it. Java is a statically-typed language,
     which is fancy-speak for the need to declare variables before they can be used, pretty self-explanatory.

     The declaration of a variable occurs we give it a name; all variables must have a reference:
     */

    int name;

    /*
      Note the semicolon at the end of the line. Semicolons are important in Java, because they let the compiler know
      when to compile. The compiler won't compile if the semicolon is not present, so remember to always assure that a
      semicolon is present when you declare variables.

      Now we have declared an Integer variable with the reference "name". Of course, when you do this, it is important
      that you name the variable logically, so that you don't forget what the heck it is used for. Also, references must
      be unique!

      If we want to use this variable, we have to initialize it. This is the next step of creating a variable.
      Initialization is done when we assign a value to the variable by putting the equals sign in between the name and
      the value. If you've already declared the variable, it's only possible do this inside a method:
     */

    void method(){

        name = 5;

    }

    /*
      Remember the semicolon? Yes, those are also used when initializing a variable. They are one of the main courses for
      broken programs, so don't forget them.

      Don't be confused by the method. Essentially, a method where code can being run, where we can change and modify
      variables and data types. The compiler will scream red underlining if you try to assign values to a variable outside
      a method. (Methods are also known as functions in other programming language, but let's try to stick to calling them
      methods.)

      While we are at it, it's important to remember that variables can be declared and initialized in one go; this can
      also be done outside of a method.
     */

    int myAge = 24;

    /*
      This variable is now both declared and initialized, and is ready to be used inside a method.
      Note that we adhere to the rule of giving the variable a relevant name. This is known as Naming Conventions.
      The Naming Convention is part of the general Coding Conventions, which you can probably find better descriptions
      of on Google.

      Another Coding Convention is the use of Camel-Casing. Because you cannot sentences with spaces and weird characters
      as references for variables, we need to concatenate.

      For example: if we have a method that changes the value of our myAge variable, it'd be great coding practice
      to give that method a logical name like "change Marc's age". Again, because we cannot have spaces in references,
      we need to Camel-Case the sentence into "changeMarcAge". When using Camel-Casing, each new word is capitalized,
      but you must still adhere to the conventions of your language:

      In Java, packages, methods and variables are spelled with lowercase, where as classes are capitalized.
      Here's an example:
     */

    String myName = "Marc Jesse";
    int myPhoneNumber = 30317338;

    /*
      Okay, so now that we have roughly covered how to create variables, we must now move on to cover the different
      type of variables, also known as Data Types.

      Lets begin with numbers. Java has different ways of storing numbers, and while some of them may seem useless now,
      they all serve a purpose. The most common variable used to store a number is an Integer.
      Integers can only store numbers with no fractional parts:
     */

    int integerExampleNumber01 = 17;                //Default: 0
    Integer integerExampleNumber02 = 123456789;     //Default: 0

    /*
      Here we use the int declaration. The int the a primitive type of Integer. A primitive type is not composed of other
      data types, where as an object can be and generally is. There's a lot to be said about this subject, but we will have
      to wait with that, until we have covered Objects later on. For now, just know that you can both use Integer and int
      to create an integer variable. The int can hold numbers from -2147483948 to 2147483947 which amounts to 32 bit or 4 bytes.

      Java also supports 3 other Integer-types:
     */

    byte integerExampleNumber03  = 127;             //Default: 0
    short integerExampleNumber04 = 32767;           //Default: 0
    long integerExampleNumber05  = 9223372;         //Default: 0

    /*
      The byte has the smallest range: -128 to 127, which amounts to 8 bit or 1 byte.
      The short can hold up to 16 bytes, -32,435 to 32,767.
      The int fits in here, when comparing size, with it's 32 bit.
      The long is the greatest integer type and ranges from -9,223,372,036,854,775,808 to +9,223,372,036,854,775,807
      which amounts to 64 bit or 8 bytes.

      So why these different types just to store Integers? Well, when you declare the variable, you tell the compiler
      that you are going to need free space in the memory for the variable. So if you know you are going to store a small
      number, there is no reason to use the long. Nowadays computers are like super fast, so it won't matter much in a
      small program, but for big programs and programs that need to perform quickly, it's a good idea to use the Integer-
      type that suits your need, so you don't Bogart the memory.

      So Integers are great right? You can store all your phone numbers and ages of your pets in your program now.
      But what if you need to do some extreme calculations of three-dimensional vectors? Then you'd certainly be
      needing some way of storing numbers with decimals. These are known as Rational Numbers. Java has two types
      you can use for storing such values:
     */

    float rationalNumberExample01 = 23.4f;                  //Default: 0.0f
    double rationalNumberExample02 = 189298723.345345;      //Default: 0.0

    /*
      The Rational numbers guarantee a certain precision, known as the standards. These are implemented so that you
      can be sure the volatile calculations you do in order to keep you nuclear reactor running are correct.
      The float contains an IEEE 754 floating point single-precision, and has a size of 32 bits or 4 bytes.
      The double contains an IEEE 754 floating point double-precision, and has a size of 64 bits or 8 bytes.
      In order to the the compiler the difference between them, the character 'f' is required at the end of a float.
      You can also write 'd' after at the end of the double, but you are not required to. I'm sure the compiler will
      be chuffed if you do tho.

      All these data-types has a default value, which is commented at the end of their examples in the code. The default
      value is used for uninitialized variables.

      Alright. That about covers the numbers. But what about text?
      For text we only use one Data Type, known as the char. Chars care declared in the standard way, but you have to
      encapsulate the value with single quotes. Also don't forget the semicolon!
     */

    char textExample01 = 't';
    char textExample02 = 'G';

    /*
    If you wanna store sentences we use a Class known as String, which can store multiple chars. The String class also
    contains methods for extracting and editing it's contents. The String class can do some pretty complicated stuff,
    so we'll have to touch upon that later. For now, lets just have an example; The value of Strings has to be
    encapsulated with double quotes when initialized.
     */

    String textExample03 = "Hello, World!";
    String textExample04 = "CATS: ALL YOUR BASE ARE BELONG TO US.";

    /*
    That sums up creation of variables and the different data types used in Java.

    -----------------------------------------------------------------------------------------------------------------

    The "HELP ME I'VE NO CLUE WHAT I'M DOING" - section, also known as the TLDR; - section.

    Declaration of a variable occurs when naming it.
    Initialization of a variable occurs when assigning it a value.
    For floats, put f at the end of the value, for doubles, don't.
    The String is a class and not data type.
    Encapsulate a String's value with DOUBLE quotes when assigning it.
    Encapsulate a Char's value with SINGLE quotes when assigning it.
    Remember your darn semicolons.

     */

}
