//util.cpp where we write a defination of the declare fumction in util.h

#include "util.h"
void sort(emp arr[], int length)
{
	for(int i=0 ; i < length; i++)
	{
		for(int j = i+1 ; j < length; j++)
		{
		if(arr[i].getsal() > arr[j].getsal()) {
		emp temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		}
		}
	}
}

