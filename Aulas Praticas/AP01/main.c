#include <stdio.h>
#include "Animal.c"

int main(){
	Animal *gato = newAnimal("gato",5,12.34);
	printf("\n%s",getAnimalName(gato));
	printf("\n%d",getAnimalAge(gato));
	printf("\n%0.2f",getAnimalWeight(gato));
	Animal *cao = newAnimal("cao",5,21.56);
	printAnimal(cao);
	Animal *porco = newAnimal("porco",10,50.05);
	printf("\ncao==porco? %s", (equalsAnimal(cao,porco)) == 1 ? "Yes":"No");
	printf("\ncao==cao? %s", (equalsAnimal(cao,cao)) == 1 ? "Yes":"No");
	destroyAnimal(porco);
	printAnimal(porco);
	return 0;
}
