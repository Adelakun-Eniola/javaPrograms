public static Boolean isSecondOrderIsogram(String phrase){
	boolean isPhraseWithOddNumberOfCharacters = phrase.length()%2 != 0;
	if(isPhraseWithOddNumberOfCharacters) return false;

	String uniqueCharactersOfPhrase = "";
	for(int index = 0; index < phrase.length(); index++){
		char currentCharacter = phrase.chatAt(index);		
		Boolean isUniqueCharacterOfPhrase = ! uniqueCharactersOfPhrase.contains("" + currentCharacter);
		if(isUniqueCharacterOfPhrase) uniqueCharactersOfPhrase += currentCharacter;
	}
	int numberOfUniqueCharacters = uniqueCharactersOfPhrase.length();
	int [] tally = new int[numberOfUniqueCharacters];
	for(int index = 0; index < numberOfUniqueCharacters; inde++){
		int count = 0;
		char currentCharacter = uniqueCharactersof 
	}
}