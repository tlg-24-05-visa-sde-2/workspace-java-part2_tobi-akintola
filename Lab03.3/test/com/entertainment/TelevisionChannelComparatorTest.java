package com.entertainment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TelevisionChannelComparatorTest {
    private TelevisionChannelComparator comparator;
    private Television tv1;
    private Television tv2;
    
    
    //need 3 things:
    //two television objects, tv1, and tv2
    //tv1 has a channel of 3 (default)
    //tv2 has a channel of 3
    //also independent agent i.e. the comparator object

    @Before
    public void setUp() {
        comparator = new TelevisionChannelComparator();
        tv1 = new Television();
        tv2 = new Television();
    }

    @Test
    public void name() {
    }
}