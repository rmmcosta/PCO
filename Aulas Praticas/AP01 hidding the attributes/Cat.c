#include <stdio.h>
#include "Cat.h"

struct sCat {
	Animal _animal;
	int _numberOfLifes;
};

Cat newCat(char* name, int vel){
	Cat c;
	c->_animal = newAnimal(name, vel);
	c->_numberOfLifes = 7;
	return c;
}

void sayMiau(Cat c){
	Animal a = c->_animal;
	printf("\n%s is saying Miauuuuuu...", getName(a));
}

void die(Cat c){
	switch(c->_numberOfLifes){
		case 1:
			c->_numberOfLifes--;
		case 0:
			printf("\nThe cat is dead!");
			break;
		default:
			c->_numberOfLifes--;
	}
}

void printLifesLeft(Cat c){
	printf("\n%d lifes left!",c->_numberOfLifes);
}

Animal getAnimal(Cat c){
	return c->_animal;
}