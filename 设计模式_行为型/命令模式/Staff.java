package 命令模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月06日 17:36
 */
public class Staff {

    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void executeCommand() {
        for (Command command : commandList) {
            command.execute();
        }
        commandList.clear();
    }
}
