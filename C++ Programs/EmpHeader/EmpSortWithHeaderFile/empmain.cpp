//empmain.cpp in these file we simply call the functions

#include "util.h"
#include "emp.h"

int main()
{

	emp earr[2];
	earr[0].accept();
	earr[1].accept();
	sort(earr,2);
	earr[0].display();
	earr[1].display();
	return 0;
}

