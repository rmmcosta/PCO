#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "Animal.c"

Cat* newCat(char name[15], int age, float weight, int purrLevel, float fluffiness) {
	Cat tempCat;
	tempCat._animal = *newAnimal(name, age, weight);
	tempCat._purrLevel = purrLevel;
	tempCat._fluffiness = fluffiness;
	tempCat._this = (Cat*) malloc(sizeof(tempCat));
	*tempCat._this = tempCat;
	return tempCat._this;
}


void destroyCat(Cat *ptrA){
	Cat c = *ptrA;
	destroyAnimal(c._animal._this);
	free(c._this);
}

int equalsCat(Cat *ptrA1, Cat *ptrA2){
	Cat a1 = *ptrA1;
	Cat a2 = *ptrA2;
	return (	equalsAnimal(a1._animal._this,a2._animal._this)
				&& a1._purrLevel == a2._purrLevel
				&& a1._fluffiness == a2._fluffiness
			) ? 1:0;
}

char* getCatName(Cat *ptrA){
	Cat c = *ptrA;
	return getAnimalName(c._animal._this);
}

int getCatAge(Cat *ptrA){
	Cat c = *ptrA;
	return getAnimalAge(c._animal._this);
}

float getCatWeight(Cat *ptrA){
	Cat c = *ptrA;
	return getAnimalWeight(c._animal._this);
}

int getCatPurrLevel(Cat *ptrA){
	Cat c = *ptrA;
	return c._purrLevel;
}

float getCatFluffiness(Cat *ptrA){
	Cat c = *ptrA;
	return c._fluffiness;
}

void printCat(Cat *ptrA){
	Cat c = *ptrA;
	if(c._animal._name == NULL)
		return;
	printf("\n\n== Cat ==");
	printAnimal(c._animal._this);
	printf("\nPurrLevel: %d", c._purrLevel);
	printf("\nFluffiness: %.2f\n", c._fluffiness);
}
