#include <stdio.h>
#include "Animal.c"

int main(){
	DestroyLastAnimal();
	NewAnimal("gato",5,12.0);
	NewAnimal("cao",5,21.0);
	NewAnimal("porco",10,50.0);
	NewAnimal("pombo",1,1.50);
	ListAnimals();
	printf("\nDestroyLastAnimal");
	DestroyLastAnimal();
	ListAnimals();
	printf("\nDestroyAllAnimals");
	DestroyAllAnimals();
	ListAnimals();
	return 0;
}
