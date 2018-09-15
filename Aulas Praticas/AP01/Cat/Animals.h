typedef struct sAnimal{
	char *_name;
	int _age;
	float _weight;
	struct sAnimal *_this;
} Animal;

typedef struct sCat{
	Animal _animal;
	int _purrLevel;
	float _fluffiness;
	struct sCat *_this;
} Cat;
