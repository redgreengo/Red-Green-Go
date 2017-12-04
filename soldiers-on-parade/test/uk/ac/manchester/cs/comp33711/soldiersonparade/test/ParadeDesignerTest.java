package uk.ac.manchester.cs.comp33711.soldiersonparade.test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

import uk.ac.manchester.cs.comp33711.soldiersonparade.ParadeDesigner;

public class ParadeDesignerTest {
	
	@Test
	public void shouldReportZeroTurnsNeededForASingleConfigurationOfASingleSoldier(){
		String[] testConfigurations = { ">" };
		int[] expectedTurns = { 0 };
		assertThat(ParadeDesigner.turnsNeededFor(testConfigurations), is(expectedTurns));
	}

}
