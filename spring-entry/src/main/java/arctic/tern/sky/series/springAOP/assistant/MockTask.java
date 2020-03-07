package arctic.tern.sky.series.springAOP.assistant;

/**
 * @author Ocean
 * @date 2020/3/7.
 */
public class MockTask implements ITask {
    @Override
    public void execute() {
        System.out.println("-MoockTask.executed! ");
    }
}
