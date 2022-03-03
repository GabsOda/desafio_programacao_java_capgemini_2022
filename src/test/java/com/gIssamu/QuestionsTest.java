package com.gIssamu;

import static org.junit.Assert.assertTrue;

import com.gIssamu.question1.Median;
import com.gIssamu.question2.Counter;
import com.gIssamu.question3.Encryptor;

import org.junit.Test;

public class QuestionsTest {

    @Test
    public void testExampleQuestion1() {
        int[] arr = { 9, 2, 1, 4, 6 };

        int result = Median.median(arr);

        assertTrue(result == 4);
    }

    @Test
    public void testExempleQuestion2() {
        int[] n = { 1, 5, 3, 4, 2 };
        int x = 2;

        int result = Counter.counterRun(x, n);

        assertTrue(result == 3);
    }

    @Test
    public void textExemple1Question3() {
        String entry = "tenha um bom dia";

        String result = Encryptor.ecrypStrings(entry);

        assertTrue(result.equals("taoa eum nmd hbi"));
    }

    @Test
    public void textExemple2Question3() {
        String entry = "ola mundo";

        String result = Encryptor.ecrypStrings(entry);

        assertTrue(result.equals("omd luo an"));
    }
}
