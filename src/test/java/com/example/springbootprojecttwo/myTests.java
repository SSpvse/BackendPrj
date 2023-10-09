package com.example.springbootprojecttwo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class myTests {

    @Test
    public void testServiceDelete() {
        PartRepository partR = new PartRepository();
        partR.addPartByName("cat");
        int listSize = partR.parts.size();
        partR.addPart(new Part("frog", 11));
        partR.deletePart(11);
        assertThat(partR.parts.size() == listSize);
    }

}
