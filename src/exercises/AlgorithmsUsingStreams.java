package exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AlgorithmsUsingStreams {

	public static long countGoodEggs(List<String> eggs) {
		return eggs.stream()				// 1. create stream
		.filter(egg -> egg.equals("whole")) // 2. intermediate filter operation
		.count();							// 3. terminal operation: reduce to an int
	}

	public static Object findTallest(List<Double> peeps) {
//		return Collections.max(peeps);
		return peeps.stream().sorted(Comparator.reverseOrder()).findFirst().get();
	}

	public static long addStringOfNumbers(String numbers) {
		return numbers
		 	.chars()		
		 	.mapToObj(c -> Character.toString(c))	
			.mapToInt(num -> Integer.parseInt(num))
			.sum();
	}

	public static long countPearls(List<Boolean> oysters) {
		return oysters
				.stream()
				.filter(x -> x == true)
				.count();
	}

	public static String findLongestWord(List<String> words) {
		return words
				.stream()
				.max((word1, word2) -> Integer.compare(word1.length(), word2.length()))
				.get();
	}

	public static List<Double> sortScores(List<Double> results) {
		return results
				.stream()
				.sorted()
				.collect(Collectors.toList());
	}

	public static List<String> sortDNA(List<String> unsortedSequences) {
		return unsortedSequences
				.stream()
				.sorted((dna1, dna2) -> dna1.length() - dna2.length())
				.collect(Collectors.toList());
	}

	public static List<String> sortWords(List<String> words) {
		return words
				.stream()
				.sorted()
				.collect(Collectors.toList());
	}

	public static List<String> getDistinctSpellsInAlphabeticalOrder(List<String> spellsCastThisWeek) {
		return spellsCastThisWeek
				.stream()
				.distinct()
				.sorted()
				.collect(Collectors.toList());
	}

	public static List<String> getBatPhrases(String[] batmanScript) {
		return Arrays.stream(batmanScript)
				.map(str -> str.replace(" ", ""))
				.filter(str -> str.equalsIgnoreCase("bam") || str.equalsIgnoreCase("pow"))
				.map(str -> str.toUpperCase())
				.collect(Collectors.toList());
	}

	public static long countXs(String xString) {
		return xString
				.chars()
				.mapToObj(x -> (char)x)
				.filter(x -> x.equals('x'))
				.count();
	}

	public static int addEven(String string) {
		return string
				.chars()
				.mapToObj(x -> Character.toString(x))
				.mapToInt(n -> Integer.parseInt(n))
				.filter(n -> n % 2 == 0)
				.sum();
	}

	public static double getAverage(int[] numbers) {
		return Arrays.stream(numbers)
				.average()
				.getAsDouble();
	}

	public static long countOccurrences(String[] strArr, String string) {
		return Arrays.stream(strArr)
				.filter(str -> str.equalsIgnoreCase(string))
				.count();
	}
	
	
	
	
	
	

}
