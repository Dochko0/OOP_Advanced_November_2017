package Frame.Commands;

import Frame.annotation.Command;
import Frame.interfaces.Executable;

@Command(value = "a")
public class A implements Executable{
    @Override
    public void execute(){
        System.out.println("Gosho");
    }
}
