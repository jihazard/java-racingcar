package racingCar;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class RacingCarTest {
    private Racing racingCar;

    /*
    *   기능 요구사항
        초간단 자동차 경주 게임을 구현한다.
        주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
        사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
        전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
        자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.
    * */


    @Before
    public void setUp() throws Exception {
        racingCar = new Racing();
    }

    @Test
    public void 랜덤만들기() {
        int value = racingCar.makeRandomNumber();
        assertThat(value).isBetween(0, 9);
    }

    @Test
    public void 숫자에따른이동_0또는1() {
        int value = racingCar.nextMoveAndStop();
        assertThat(value).isBetween(0, 1);
    }


}
