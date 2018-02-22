package Frame;

import Frame.annotation.Command;
import Frame.interfaces.Executable;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) throws IOException, IllegalAccessException, InstantiationException, ClassNotFoundException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        File[] commands = new File("src/Frame/Commands").listFiles();

        while (true) {
            String command = bf.readLine();
            for (File file : commands) {
                Class c = Class.forName("Frame.Commands." + file.getName().replace(".java", ""));
                Command a = (Command) c.getDeclaredAnnotation(Command.class);
                String value = a.value();
                Executable executable = (Executable) c.newInstance();

                if (value.equalsIgnoreCase(command)) {
                    executable.execute();
                }
            }
        }
    }
}
