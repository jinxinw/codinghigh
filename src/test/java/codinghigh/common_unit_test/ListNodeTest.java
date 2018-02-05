/*
 * Copyright (c) 2018 to Xinwei Jin.
 * All Rights Reserved.
 */

package codinghigh.common_unit_test;

import codinghigh.common.ListNode;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by xinweijin on 2/4/18.
 */
public class ListNodeTest {
    private final int[] DEFAULT_TEST_CASE_ARRAYS = {5, 2, 4, 1, 8, 9, 6};

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void generateSingleLinkedListFromArray_anyinput_shouldGenerateCorrectLinkedList() {
        int[] array = DEFAULT_TEST_CASE_ARRAYS;
        ListNode head = ListNode.generateSingleLinkedListFromArray(array);
        int[] listToArray = ListNode.toArray(head);
        assertArrayEquals(array, listToArray);
    }
}
