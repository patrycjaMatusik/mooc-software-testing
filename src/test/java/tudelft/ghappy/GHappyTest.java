package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class GHappyTest {

    @ParameterizedTest(name="{index} => word = ''{0}''")
    @ValueSource(strings = {"xxggxx", "ggxx", "xxgg"})
    public void happyG(String line){
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy(line);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest(name="{index} => word = ''{0}''")
    @ValueSource(strings = {"xxgxx", "gxx", "xxg"})
    public void unhappyG(String line){
        boolean result = new GHappy().gHappy(line);
        Assertions.assertFalse(result);
    }

    @ParameterizedTest(name="{index} => word = ''{0}''")
    @ValueSource(strings = {"xxggyygxx", "ggxgxx", "gxxggy", "xgyyggx"})
    public void happyAndUnhappyG(String line){
        boolean result = new GHappy().gHappy(line);
        Assertions.assertFalse(result);
    }

}
