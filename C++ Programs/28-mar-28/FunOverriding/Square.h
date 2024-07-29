#include "Shape.h"

class Square : public Shape
{
private:
    float len;

public:
    void Accept();
    
    float CalArea();
    float CalPeri();
};

