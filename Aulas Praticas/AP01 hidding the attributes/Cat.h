#ifndef	CAT_H
#define CAT_H

#include "Animal.h"

typedef struct sCat *Cat;
Cat newCat(char* name, int vel);
void sayMiau(Cat c);
void die(Cat c);
void printLifesLeft(Cat c);
Animal getAnimal(Cat c);

#endif