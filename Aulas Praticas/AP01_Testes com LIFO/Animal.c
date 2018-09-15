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
	printf("\nprevious:%d",tempAnimal._previous);
	printf("\nNew _animalsList:%d",_animalsList);
}

void Present(Animal a){
	if(a._name == NULL)
		return;
	printf("\nHi I am the %s.\nI have %d years and my weight is more or less %f.",
	a._name, a._age, a._weight);
}

void DestroyLastAnimal(){
	printf("\nBegin destroy last animal");
	if(_animalsList == NULL)
		return;
	Animal *tempPtr = _animalsList;
	printf("\n*tempPtr%d",tempPtr);
	Animal tempAnimal = *tempPtr;
	if(tempPtr == NULL)
		return;
	printf("\n*tempAnimal._previous%d",tempAnimal._previous);
	_animalsList = tempAnimal._previous;
	printf("\n_animalsList:%d",_animalsList);
	free(tempPtr);
}

void DestroyAllAnimals(){
	printf("\n Begin destroying all the animals...");
	Animal tempAnimal = *_animalsList;
	while(_animalsList != NULL){
		printf("\n_animalsList:%d",_animalsList);
		free(_animalsList);
		printf("\nafter destroying _animalsList:%d",_animalsList);
		if(tempAnimal._previous == NULL) {
			printf("\n_animalsList:%d",_animalsList);
			printf("\nNo more animals to destroy...");
			return;
		}
		_animalsList = tempAnimal._previous;
		tempAnimal = *_animalsList;
	}
}

void ListAnimals(){
	Animal *tempPtr = _animalsList;
	Animal tempAnimal = *tempPtr;
	while(tempPtr != NULL){
		printf("\ntempPtr:%d",tempPtr);
		Present(tempAnimal);
		printf("\npresented");
		if(tempAnimal._previous == NULL) {
			printf("\nNo more animals to show...");
			return;
		}
		tempPtr = tempAnimal._previous;
		tempAnimal = *tempPtr;	
	}
}

