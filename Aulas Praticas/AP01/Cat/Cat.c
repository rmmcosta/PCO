#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "Cat.h"

Cat* newCat(char name[15], int age, float weight, int purrLevel, float fluffiness) {
	Cat tempCat;
	tempCat._name = NULL;
	tempCat._name = (char*) malloc (sizeof(name)+1);
	strcpy(tempCat._name,name);
	tempCat._age = age;
	tempCat._weight = weight;
	tempCat._purrLevel = purrLevel;
	tempCat._fluffiness = fluffiness;
	tempCat._this = (Cat*) malloc(sizeof(tempCat));
	*tempCat._this = tempCat;
	return tempCat._this;
}


void destroyCat(Cat *ptrA){
	Cat c = *ptrA;
	free(c._this);
}

int equalsCat(Cat *ptrA1, Cat *ptrA2){
	Cat a1 = *ptrA1;
	Cat a2 = *ptrA2;
	return (	a1._name == a2._name 
				&& a1._age == a2._age 
				&& a1._weight == a2._weight 
				&& a1._purrLevel == a2._purrLevel
				&& a1._fluffiness == a2._fluffiness
			) ? 1:0;
}

char* getCatName(Cat *ptrA){
	Cat c = *ptrA;
	return c._name;
}

int getCatAge(Cat *ptrA){
	Cat c = *ptrA;
	return c._age;
}

float getCatWeight(Cat *ptrA){
	Cat c = *ptrA;
	return c._weight;
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
	if(c._name == NULL)
		return;
	printf("\n\n== Cat ==");
	printf("\nName: %s", c._name);
	printf("\nAge: %d", c._age);
	printf("\nWeight: %.2f", c._weight);
	printf("\nPurrLevel: %d", c._age);
	printf("\nFluffiness: %.2f\n", c._fluffiness);
}
