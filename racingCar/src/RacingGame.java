import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RacingGame {
    private int tryNo;
    private Map<String, Integer> carMap;

    public RacingGame(String carNames, int tryNo) {

        List<String> newCarList = Pattern.compile(",").splitAsStream(carNames)
            .map(carName -> carName.replace(" ", ""))
            .collect(Collectors.toList());
        this.tryNo = tryNo;
    }

    public List<Car> getCars() {
        return null;
    }
    public boolean isEnd(){
        return this.getTryNo() <= 0;
    }

    public int getTryNo(){
        return this.tryNo;
    }

    public void race(){
        this.tryNo -= 1;
    }
}
