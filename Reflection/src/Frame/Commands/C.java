package Frame.Commands;

import Frame.annotation.Command;
import Frame.interfaces.Executable;

@Command(value = "exit")
public class C implements Executable {
    @Override
    public void execute(){
        System.exit(0);
    }
}
