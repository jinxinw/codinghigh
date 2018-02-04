/*
 * Copyright (c) 2018 to Xinwei Jin.
 * All Rights Reserved.
 */

package codinghigh.algorithms.leetcode_unit_test;

import codinghigh.algorithms.leetcode.TwoSum;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by xinweijin on 1/30/18.
 * unit test for TwoSum
 */
public class TwoSumTest {
    private final int[] DEFAULT_TEST_CASE_NUMS_1 = {1, 6, 8, 14, 19, 24};
    private final int DEFAULT_TEST_CASE_TARGET_1 = 22;
    private final int[] DEFAULT_TEST_CASE_NUMS_2 = {6, 1, 8, 24, 19, 14};
    private final int DEFAULT_TEST_CASE_TARGET_2 = 22;
    private TwoSum twoSum = new TwoSum();

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void twoSum1_increaseInputArray_shouldWork() {
        int[] result = {2, 3};
        assertArrayEquals(result, twoSum.twoSum1(DEFAULT_TEST_CASE_NUMS_1, DEFAULT_TEST_CASE_TARGET_1));
    }

    @Test
    public void twoSum2_uniqueElementArray_shouldWork() {
        int[] result = {2, 5};
        assertArrayEquals(result, twoSum.twoSum2(DEFAULT_TEST_CASE_NUMS_2, DEFAULT_TEST_CASE_TARGET_2));
    }
}