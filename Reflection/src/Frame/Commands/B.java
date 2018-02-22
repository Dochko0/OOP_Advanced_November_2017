package Frame.Commands;

import Frame.annotation.Command;
import Frame.interfaces.Executable;

@Command(value = "b")
public class B implements Executable{
    @Override
    public void execute(){
        System.out.println("Pesho");
    }
}
