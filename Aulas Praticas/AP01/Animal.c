#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "Animal.h"

AnimalsList _animalsList = NULL;

void NewAnimal(char name[15], int age, int weight) {
	Animal tempAnimal;
	tempAnimal._name = NULL;
	tempAnimal._name = (char*) malloc (sizeof(name)+1);
	strcpy(tempAnimal._name,name);
	tempAnimal._age = age;
	tempAnimal._weight = weight;
	if(_animalsList == NULL){
		tempAnimal._previous = NULL;
	} else {
		tempAnimal._previous = _animalsList;
	}
	_animalsList = (Animal*) malloc(sizeof(tempAnimal));
	if(_animalsList == NULL) 
		return;
	*_animalsList = tempAnimal;
}

void Present(Animal a){
	printf("Hi I am the %s.\nI have %d years and my weight is more or less %.2f.",
	a._name, a._age, a._weight);
}

void DestroyAnimal(){
	Animal *tempPtr = _animalsList;
	Animal tempAnimal = *tempPtr;
	if(_animalsList == NULL)
		return;
	_animalsList = tempAnimal._previous;
	free(tempPtr);
}

void ListAnimals(){
	Animal *tempPtr = _animalsList;
	Animal tempAnimal = *tempPtr;
	while(tempPtr != NULL){
		Present(tempAnimal);
		tempPtr = tempAnimal._previous;
		tempAnimal = *tempPtr;
	}
}

