package junit.tests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;


public class CollectionsTest {
	
	@Test
	public void testList() {
		List<String> liste = new ArrayList<>();
		Collections.addAll(liste, "a", "b", "c", "d", "e");
		liste.removeAll(Arrays.asList("b", "d"));
		
		assertThat(liste, hasSize(3));
		assertThat(liste , both( hasItems("a","c", "e") ).and(not(hasItems("b", "d")) ));
	}
}
