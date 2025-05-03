package s06.test.mirror;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MirrorTest {

    @Test
    public void testMirrorEnds() {
        Mirror mirror = new Mirror();

        assertEquals("ab", mirror.mirrorEnds("abXYZba"));
        assertEquals("a", mirror.mirrorEnds("abca"));
        assertEquals("aba", mirror.mirrorEnds("aba"));
        assertEquals("", mirror.mirrorEnds("xyz"));
        assertEquals("racecar", mirror.mirrorEnds("racecar"));
    }
}