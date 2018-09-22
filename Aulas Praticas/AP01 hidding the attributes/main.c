#include "Animal.h"
#include "Cat.h"

int main(){
	Animal a=newAnimal("freddy",10);
	run(a);
	setVelocity(a, 15);
	run(a);
	Cat c = newCat("rosinha",20);
	sayMiau(c);
	printLifesLeft(c);
	die(c);
	printLifesLeft(c);
	run(getAnimal(c));
	return 0;
}
