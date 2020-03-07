package arctic.tern.sky.series.springAOP.assistant;

/**
 * @author Ocean
 * @date 2020/3/6.
 */
public class IntRange {

    private int start;
    private int end;

    public IntRange(int start, int end){
        this.start = start;
        this.end = end;
    }

    public boolean containsInteger(int value){
        return value >= start && value <end;
    }
}
