import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;

class MainTest {
    @Test
    void hello(){
        Main main = new Main();
        Assertions.assertEquals("Hello", main.getHello());
    }

    @Test
    void testInitRacing(){
        String carNames = "car1,car2, car3, car4";
        int tryNo = 3;
        RacingGame racingGame = new RacingGame(carNames, tryNo);
        ArrayList<String> carNameList = new ArrayList<String>(Arrays.asList(carNames.split(",")));
        Assertions.assertIterableEquals(carNameList, racingGame.getCars(), "자동차 이름 어려대 입력 초기화 오류");
        Assertions.assertEquals(tryNo, racingGame.getTryNo(), "레이싱 횟수 입력 초기화 오류");
    }

    @Test
    void testCarName(){
        Car car = new Car("newCar");
        Assertions.assertEquals("newCar", car.getName());
    }

    @Test
    void testCarMove(){
        Car car = new Car("newCar");
        car.move(1);
        Assertions.assertEquals(0, car.getPosition(), "랜덤 숫자 1 입력 시, 제자리 오류");
        car.move(7);
        Assertions.assertEquals(1, car.getPosition(), "랜덤 숫자 7 입력 시, 전진 오류");
    }

    @Test
    void testRace(){
        RacingGame racingGame = new RacingGame("name1, name2", 3);
        racingGame.race();
        Assertions.assertEquals(2, racingGame.getTryNo());
    }


    @Test
    void testIsEndGame(){
        RacingGame racingGame = new RacingGame("name1, name2", 3);
        Assertions.assertEquals(false, racingGame.isEnd());
        while(racingGame.isEnd() == false){
            racingGame.race();
        }
        Assertions.assertEquals(true, racingGame.isEnd());
    }
}