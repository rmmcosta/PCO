typedef struct sAnimal{
	char *_name;
	int _age;
	float _weight;
	struct sAnimal *_previous;
} Animal;

typedef Animal *AnimalsList;
