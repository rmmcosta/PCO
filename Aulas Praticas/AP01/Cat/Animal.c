#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "Animals.h"

Animal* newAnimal(char name[15], int age, float weight) {
	Animal tempAnimal;
	tempAnimal._name = NULL;
	tempAnimal._name = (char*) malloc (sizeof(name)+1);
	strcpy(tempAnimal._name,name);
	tempAnimal._age = age;
	tempAnimal._weight = weight;
	tempAnimal._this = (Animal*) malloc(sizeof(tempAnimal));
	*tempAnimal._this = tempAnimal;
	return tempAnimal._this;
}


void destroyAnimal(Animal *ptrA){
	Animal a = *ptrA;
	free(a._this);
}

int equalsAnimal(Animal *ptrA1, Animal *ptrA2){
	Animal a1 = *ptrA1;
	Animal a2 = *ptrA2;
	return (a1._name == a2._name && a1._age == a2._age && a1._weight == a2._weight) ? 1:0;
}

char* getAnimalName(Animal *ptrA){
	Animal a = *ptrA;
	return a._name;
}

int getAnimalAge(Animal *ptrA){
	Animal a = *ptrA;
	return a._age;
}

float getAnimalWeight(Animal *ptrA){
	Animal a = *ptrA;
	return a._weight;
}

void printAnimal(Animal *ptrA){
	Animal a = *ptrA;
	if(a._name == NULL)
		return;
	printf("\n\n== Animal ==");
	printf("\nName: %s", a._name);
	printf("\nAge: %d", a._age);
	printf("\nWeight: %0.2f\n", a._weight);
}
