# Lesson
 * An outer class can not be static class in Java
 * An inner class can be a static class (similar to static methods and variables)
 * When instantiating a non - static inner class, an instance of the outer class is needed.
 * Example `OuterClass.InnerClass2 obj2 = new OuterClass().new InnerClass2()`
 * An inner class instance is always associated with the outer class instance. So the inner class can access all variables of outer classes 
 * When instantiating a static inner class, no instance of the outer class is associated
 * Example `OuterClass.InnerClass1 obj1 = new OuterClass.InnerClass1();`
 * Inner static class can not access output class members
 