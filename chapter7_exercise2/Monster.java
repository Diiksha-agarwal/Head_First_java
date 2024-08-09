class Monster {
//---------------------------------------candidate-1-----------------------------------------------
/*
    boolean frighten(int d) {
        System.out.println("arrrgh");
        return true;
    }
*/
//------------------------------------------output-----------------------------------------------
    // candidate pair one gives correct output after error free compilation.


//---------------------------------------candidate-2-----------------------------------------------
/*
    boolean frighten(int x) {
        System.out.println("arrrgh");
        return true;
    }
*/
//--------------------------------------------output-----------------------------------------------
    // candidate pair two gives compilation error as in part b the return type is changed without 
    //change in argument list , hence its neither overriding nor overloading.


//---------------------------------------candidate-3-----------------------------------------------
/*
    boolean frighten(int x) {
        System.out.println("arrrgh");
        return false;
    }
*/
//--------------------------------------------output-----------------------------------------------
    // candidate pair three gives incorrect output as the frighten method is not overriden in part b. 


//---------------------------------------candidate-4-----------------------------------------------
/*
    boolean frighten(int z) {
        System.out.println("arrrgh");
        return true;
    }
*/
//--------------------------------------------output-----------------------------------------------
    // candidate pair four gives incorrect output as the frighten method is not overriden in part b
    //but instead its overloaded for argument of byte side. Since the function is called for int the
    //inherited version will be called. 
    
}