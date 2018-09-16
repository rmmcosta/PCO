#include "Animal.h"

int main(){
	Animal a=newAnimal("freddy",10);
	run(a);
	setVelocity(a, 15);
	run(a);
	return 0;
}
