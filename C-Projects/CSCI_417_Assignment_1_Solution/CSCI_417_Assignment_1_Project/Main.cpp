#include <stdio.h>
#include <string.h>
#include <ctype.h>

// Functions
void caesar_cypher(char *message, int key);
void get_line(char *sentence);

// Global variables
char alphabet_upper[26] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
char alphabet_lower[26] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
char cipher[50];

int main()
{
	// Function variables
	int key = 13;
	char message[50];
	bool correct = false;
	int input = 0;

	//printf("Please input an encryption key (1-25): ");
	//scanf_s("%s", &key);

	// Input a cypher to decrypt
	printf("Please input a phrase to encrypt: ");
	scanf_s("%s", &message);

	// Get cypher string
	get_line(message);

	if (message != NULL)
	{
		caesar_cypher(message, key);

		printf("Encrypted message: ", cipher);

		getchar;
		getchar;

		return 0;
	}
}

void caesar_cypher(char *message, int key)
{
	// Function variables
	char encypherText[50];
	char character;
	int encypherLength;
	int encypherIndex;
	char encodedCharacter;
	int i;

	// Store cypher into cypherText
	strcpy_s(encypherText, message);
	
	// Find total length of cypher string
	encypherLength = strlen(message);

	// Loop through cypher
	for (i = 0; i <= encypherLength; i++)
	{
		// Local variables
		character = encypherText[i];

		// Check if character is lower case
		if ( isupper(character) )
		{
			// Get enciphered index
			encypherIndex = character - 'A';

			encodedCharacter = ((encypherIndex + key)%26);

			encypherText[i] = alphabet_upper[encodedCharacter];
		}

		// Check if character is lower case
		if ( islower(character) )
		{
			// Get enciphered index
			encypherIndex = character - 'a';

			// Store deciphered character index
			encodedCharacter = ((encypherIndex + key)%26);

			// Apply deciphered character index to alphabet array
			encypherText[i] = alphabet_lower[encodedCharacter];
		}
	}

	// Store into plainText
	encypherText[i] = NULL;

	strcpy_s(cipher,encypherText);
}

void get_line(char *sentence)
{
	int i = 0;
	char character;

	while ( (character = getchar()) && (isprint(character)) )
	{
		sentence[i] = character;
		++i;
	}
	sentence[i] = NULL;
}