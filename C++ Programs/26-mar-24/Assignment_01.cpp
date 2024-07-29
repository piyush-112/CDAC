#include<iostream>
using namespace std;
class myArray
{
	private:
		int size;
		int *p;
	public:
		myArray()
		{
			this->size = 0;
		}
		myArray(int size)
		{
			this->size = size;
			p = new int[size];
		}	
		//subscript operator overloading
		int& operator[](int index)
		{
			return p[index];
		}
		// Assignment Opeartor OverLoading
		myArray& operator=(myArray &that){
		for(int i =0; i< size; i++){
			this->p[i] = that.p[i];
		}
		return *this;
		}



		//Comparison operator overloading 
		bool operator==(myArray &that)
		{
			int count = 0;
			if(this->size != that.size)
			{
				return false;
			}
				for(int i =0;i<size;i++)
				{
					if(this->p[i] == that.p[i])
					{
						count++;
					}
				}
			return (count==size)?true:false;
		}

		// Not Equal to Operator overloading
		bool operator !=(myArray &that)
		{
			
			return !((*this)==that);
		}	
};


int main()
{
	myArray a(2);
	a[0]=100;
	a[1]=200;
	
	myArray b(2);
	b = a;
	b[1] = 50;

	if(a!=b)
	{
		cout<<"Not Equal"<<endl;
	}
	else
	{
			cout<<"Equal"<<endl;
	}


	cout<<a[0]<<endl;
	cout<<a[1]<<endl;
	return 0;
}
