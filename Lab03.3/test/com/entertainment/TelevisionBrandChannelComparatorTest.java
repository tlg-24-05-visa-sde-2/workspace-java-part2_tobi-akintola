package com.entertainment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TelevisionBrandChannelComparatorTest {
    private TelevisionBrandChannelComparator comparator;
    private Television tv1;
    private Television tv2;
    

    @Before
    public void setUp() {
        comparator = new TelevisionBrandChannelComparator();
        tv1 = new Television("Sony");
        tv2 = new Television("Sony");
    }

    @Test
    public void name() {
    }
}