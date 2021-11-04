package second;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Parent {
    public void f() throws IOException, InterruptedException{}
}

class Child extends Parent {
    @Override
    public void f() throws FileNotFoundException{}
}

class ChildB extends Parent {
//    @Override
//    public void f() throws Exception{} //compilation error
}
