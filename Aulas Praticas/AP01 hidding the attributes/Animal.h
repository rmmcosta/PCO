#ifndef 	ANIMAL_H
#define 	ANIMAL_H

typedef struct sAnimal *Animal;

Animal newAnimal(char* name, int vel);
void run(Animal a);
void setVelocity(Animal a, int velocity);
char* getName(Animal a);

#endif

