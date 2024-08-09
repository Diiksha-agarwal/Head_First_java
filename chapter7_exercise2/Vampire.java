class Vampire extends Monster {
//---------------------------------------candidate-1-----------------------------------------------
/*
    boolean frighten(int x) {
        System.out.println("a bite?");
        return false;
    }
*/
//---------------------------------------------output-----------------------------------------------
    // candidate pair one gives correct output after error free compilation.


//---------------------------------------candidate-2-----------------------------------------------
/*
    int frighten(int f) {
        System.out.println("a bite?");
        return 1;
    }
*/
//---------------------------------------------output-----------------------------------------------
    // candidate pair two gives compilation error as in part b the return type is changed without 
    //change in argument list , hence its neither overriding nor overloading.


//---------------------------------------candidate-3-----------------------------------------------
/*
    boolean scare(int x) {
        System.out.println("a bite?");
        return true;
    }
*/
//---------------------------------------------output-----------------------------------------------
    // candidate pair three gives incorrect output as the frighten method is not overriden in part b. 


//---------------------------------------candidate-4-----------------------------------------------
/*
    boolean frighten(byte b) {
        System.out.println("a bite?");
        return true;
    }
*/
//---------------------------------------------output-----------------------------------------------
    // candidate pair four gives incorrect output as the frighten method is not overriden in part b
    //but instead its overloaded for argument of byte side. Since the function is called for int the
    //inherited version will be called. 
}