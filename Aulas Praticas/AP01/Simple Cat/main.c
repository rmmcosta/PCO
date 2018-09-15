#include <stdio.h>
#include "Cat.c"

int main(){
	Cat *c1 = newCat("Tareco",12,3.4,3,3.1);
	Cat *c2 = newCat("Pantufa",1,12.3,2,2.7);
	printCat(c1);
	printCat(c2);
	printf("\nc1==c1? %s", (equalsCat(c1,c1) == 1) ? "yes":"no");
	printf("\nc1==c2? %s", (equalsCat(c1,c2) == 1) ? "yes":"no");
	return 0;
}
