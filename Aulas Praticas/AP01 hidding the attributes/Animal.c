#include "Animal.h"
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

struct sAnimal {
	int _velocity;
	char _name[16];	
};

Animal newAnimal(char *name, int vel){
	Animal a = (Animal)malloc(sizeof(struct sAnimal));
	strcpy(a->_name,name);
	a->_velocity = vel;
	return a;
}

void run(Animal a){
	printf("\n%s Running at %d\n", a->_name, a->_velocity);
}

void setVelocity(Animal a, int vel){
	a->_velocity = vel;
}
