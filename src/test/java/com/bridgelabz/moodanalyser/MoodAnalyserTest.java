package com.bridgelabz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	// Test case to analyze sad mood of the user
	@Test
	public void givenMessageWhenProperShouldReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String actualResult = MoodAnalyser.analyseMood("User is Sad");
		Assert.assertEquals("Sad", actualResult);
	}

}