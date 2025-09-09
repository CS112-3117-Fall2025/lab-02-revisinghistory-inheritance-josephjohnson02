/**
 * Main.java - Driver class to demonstrate revised historical examples
 * 
 * @author ???
 * @version ???
 */

public class Main {
	public static void main(String[] args) {
		String tulsaDescription = "A black teenager, who was working as a shoe shiner in downtown Tulsa, Oklahoma, was arrested and accused of assaulting a white woman on a public elevator in broad daylight. A group of white vigilantes, intent on lynching him, and armed black men intent on protecting him gathered at the courthouse. A shot rang out, and the violence began. The riot resulted in 35 square blocks of destruction, including more than 1,250 homes, churches, schools, businesses, a hospital, and a library.";
		Date tulsaDay = new Date(5, 31, 1921);
		HistoricalEvent tulsaRiot = new HistoricalEvent(tulsaDescription, tulsaDay);

		System.out.println("====================================================");
		System.out.println("HISTORICAL EVENT EXAMPLE:");
		System.out.println("====================================================");
		System.out.println(tulsaRiot);
		
		
		String tulsaRevised = "It started with newspaper reports that a black man had assaulted a white elevator operator. He was arrested, and black World War I vets rushed to the courthouse to prevent a lynching. Whites were deputized and handed weapons, the shooting started and then it got out of hand. It was mob rule for two days, and the result was the complete devastation of the entire black community. The white mobs looted the homes and businesses before they set fire to the community. Planes circled mid-air and bombed what was known as Black Wall Street. The National Guard was called out after the governor declared martial law, and imprisoned all blacks that were not already in jail. More than 35 blocks were destroyed, along with more than 1,200 homes, and some 300 people died, mostly Blacks.",
			tulsaCitation = "https://www.smithsonianmag.com/smithsonian-institution/long-lost-manuscript-contains-searing-eyewitness-account-tulsa-race-massacre-1921-180959251/";
		RevisedHistoricalEvent tulsaMassacre = new RevisedHistoricalEvent(tulsaDescription, tulsaDay,
			tulsaRevised, tulsaCitation);
		
		System.out.println("\n====================================================");
		System.out.println("REVISED HISTORICAL EVENT EXAMPLE:");
		System.out.println("====================================================");
		tulsaMassacre.teach();

		// My own object
		System.out.println("\n\n\nMy own example below:\n\n\n");

		String columbusDescription = "Christopher Columbus is a heroic discoverer of the Americas, the first European to visit the \"New World\" as it was called. His first voyage took place in 1492, and he was widely believed to have nobly established peaceful relations with the native population, who welcomed him with open arms.";
		Date columbusDay = new Date(10, 12, 1492);
		String columbusRevised = "While Christopher Columbus' journeys indeed lead to widespread European exploration, the true story reveals that his encounters with the indigenous peoples of the Americas were violent and exploitative. His journeys resulted in centuries of decimation and colonization of North and South America. Furthermore, Columbus was not the first European to visit the \"New World.\" Viking sailors, such as Leif Erikson, had already reached the Americas in the 11th century, centuries before Columbus.",
				columbusCitation = "https://www.history.com/articles/christopher-columbus";

		HistoricalEvent columbusDiscovery = new HistoricalEvent(columbusDescription, columbusDay);
		RevisedHistoricalEvent columbusTruth = new RevisedHistoricalEvent(columbusDescription, columbusDay,
				columbusRevised, columbusCitation);

		System.out.println("====================================================");
		System.out.println("HISTORICAL EVENT EXAMPLE:");
		System.out.println("====================================================");
		System.out.println(columbusDiscovery);

		System.out.println("\n====================================================");
		System.out.println("REVISED HISTORICAL EVENT EXAMPLE:");
		System.out.println("====================================================");
		columbusTruth.teach();
		
		/* 
		// equals() tests
		System.out.println("\n\nequals() method tests:");
		System.out.print("Are the Tulsa and Colombus events the same? ");
		if (columbusDiscovery.equals(tulsaRiot)) {
			System.out.println("Yes.");
		} else {
			System.out.println("No.");
		}

		System.out.print("Are the Colombus and Colombus events the same? ");
		if (columbusDiscovery.equals(columbusDiscovery)) {
			System.out.println("Yes.");
		} else {
			System.out.println("No.");
		}

		System.out.print("Are the Colombus and Revised Colombus events the same? ");
		if (columbusDiscovery.equals(columbusTruth)) {
			System.out.println("Yes.");
		} else {
			System.out.println("No.");
		}

		// getter tests
		System.out.println("\n\ngetter tests:");
		System.out.println(columbusTruth.getDescription()); //the getter from the super class works!
		*/
	}
}