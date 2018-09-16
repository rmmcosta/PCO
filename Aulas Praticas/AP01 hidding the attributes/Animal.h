typedef struct sAnimal *Animal;

Animal newAnimal(char* name, int vel);
void run(Animal a);
void setVelocity(Animal a, int velocity);

