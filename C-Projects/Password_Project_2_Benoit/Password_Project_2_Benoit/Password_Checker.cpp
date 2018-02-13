/*    Project:        Project_2_Benoit
*    Description:    This program receives a password input and checks for several parameters:
*                    -If the password is long enough
*                    -Contains at least a lowercase, uppercase, and digit
*                    -Contains a special character
*                    -Contains no whitespace
*                    -Contains no words from a dictionary
*                    -Does not have three or more consecutive english characters
*                    -Does not have three or more consecutive characters from a standard keyboard
*                    -Does not contain any consecutive characters from the username
*
*    Programmer:        Garrett Benoit
*/

#include <stdio.h>
#include <ctype.h>
#include <string.h>
#include <stdlib.h>

void passwordCheck(char *password);
void passwordFileCheck(char *password);
void passwordConsecutiveAlphabetCharacters(char *password);
void passwordConsecutiveKeyboardCharacters(char *password);
void passwordConsecutiveUsernameCharacters(char *password);

int main()
{
    char s1[20];
    char name[8] = "Garrett";

    printf("Username: Garrett\n");
    printf("Please enter a password: ");
    scanf("%s", &s1[0]);

    // If the password is long enough, run passwordCheck()
    if (strlen(s1) < 10)
    {
        printf("\nPassword length too short.  Please enter a password at least 10 characters in length: ");
    }
    else
    {
        passwordCheck(s1);
        passwordFileCheck(s1);
        passwordConsecutiveAlphabetCharacters(s1);
        passwordConsecutiveKeyboardCharacters(s1);
        passwordConsecutiveUsernameCharacters(s1);
    }

    getchar();
    getchar();

    system("pause");
    return 0;
}

void passwordCheck(char *password)
{
    // Local Variables
    int num_upper_case_characters = 0;
    int num_lower_case_characters = 0;
    int num_digits = 0;
    int num_special_characters = 0;
    int num_non_special_characters = 0;
    int num_white_space_characters = 0;
    int n = strlen(password);
	int i = 0;

    for(i=0; i<=n-1; i++)
    {
        // Check for lower case characters
        if(islower(password[i]))
        {
            num_lower_case_characters++;
        }
        // Check for upper case characters
        if(isupper(password[i]))
        {
            num_upper_case_characters++;
        }
        // Check for digits
        if(isdigit(password[i]))
        {
            num_digits++;
        }
        // Check for special characters
        if(isalnum(password[i]) && (isprint(password[i])))
        {
            num_non_special_characters++;
        }
        // Check for whitespace
        if (!isprint(password[i]))
        {
          num_white_space_characters++;
        }

		num_special_characters = n - num_non_special_characters;
    }

	printf("Upper Case Characters: %d\n", num_upper_case_characters);
	printf("Lower Case Characters: %d\n", num_lower_case_characters);
	printf("Digits: %d\n", num_digits);
	printf("Special Characters: %d\n", num_special_characters);

	// Clearance Check
	if ((num_lower_case_characters > 0) && (num_upper_case_characters > 0))
	{
		if (num_digits > 0)
		{
		  if (num_special_characters > 0)
		  {

		  }
		  else
		  {
			printf("PASSWORD ERROR: Please enter at least one special character\n");
		  }
		}
		else
		{
		  printf("PASSWORD ERROR: Please enter at least one digit\n");
		}
	}
	else
	{
		printf("PASSWORD ERROR: Please enter both upper and lower case letters\n");
	}
}

void passwordFileCheck(char *password)
{
    char *words[1000];
	FILE *fp;

	fp = fopen("dictionary.txt", "r");

	printf("%s", fp);

    if (fp == NULL)
    {
		// Unable to open dictionary File
		printf("Dictionary file not found.\n");
		perror("Error");
		//exit(1);
    }

	/*while (fscanf(fp, "%s", words) != EOF)
	{
		for (int i = 0; i < sizeof(fp); i++)
		{
			if (strcmp(password, words[i]) == 0)
			{
				// Password contains a word in the dictionary
				printf("PASSWORD ERROR: Password contains the word: %s", words[i]);
			}
		} 
	}*/

	fclose(fp);
}

void passwordConsecutiveAlphabetCharacters(char *password)
{
    char bad_strings[24][4] = {"abc","bcd","cde","def","efg","fgh","ghi","hij","ijk","jkl","klm","lmn","mno","nop","opq","pqr","qrs","rst","stu","tuv","uvw","vwx","wxy","xyz"};
    char pwd[50];
    char temp[4];
    char length;

	length = strlen(password);
	strcpy(pwd, password);

    for (int i = 0; i <= length-3; i++)
    {
        temp[0] = pwd[i];
        temp[1] = pwd[i+1];
        temp[2] = pwd[i+2];
        temp[3] = NULL;

        for (int j = 0; j <= 23; j++)
        {
            if (strcmp(temp, bad_strings[j]) == 0)
            {
                printf("PASSWORD ERROR: Password contains consecutive characters: %s\n", bad_strings[j]);
            }
        }
    }
}

void passwordConsecutiveKeyboardCharacters(char *password)
{
    char bad_strings[24][4] = {"qwe","wer","ert","rty","tyu","yui","uio","iop","asd","sdf","dfg","fgh","ghj","hjk","jkl","zxc","xcv","cvb","vbn","bnm","opa","pas","klz","lzx"};
    char pwd[50];
    char temp[4];
    char length = strlen(password);

	strcpy(pwd, password);

    for (int i = 0; i <= length-3; i++)
    {
        temp[0] = pwd[i];
        temp[1] = pwd[i+1];
        temp[2] = pwd[i+2];
        temp[3] = NULL;

        for (int j = 0; j <= 23; j++)
        {
            if (strcmp(temp, bad_strings[j]) == 0)
            {
                printf("PASSWORD ERROR: Password contains consecutive keyboard characters: %s\n", bad_strings[j]);
				break;
            }
        }
    }
}

void passwordConsecutiveUsernameCharacters(char *password)
{
    char bad_strings[6][4] = {"Gar","gar","arr","rre","ret","ett"};
    char pwd[50];
    char temp[4];
    char length = strlen(password);

	strcpy(pwd, password);

    for (int i = 0; i <= length-3; i++)
    {
        temp[0] = pwd[i];
        temp[1] = pwd[i+1];
        temp[2] = pwd[i+2];
        temp[3] = NULL;

        for (int j = 0; j <= 5; j++)
        {
            if (strcmp(temp, bad_strings[j]) == 0)
            {
                printf("PASSWORD ERROR: Password contains consecutive username characters: %s", bad_strings[j]);
            }
        }
    }
}