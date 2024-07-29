//File where I perform the operation:taking i/p from user file nm,no of student,file creation,file //display

#include"stud.h"
//#include"stud.cpp"
int main(){
	char fnm[20];
	cout<<"Enter the name that you want to give to the file:";
	cin>>fnm;
	int n;
	cout<<"Enter the number of the student:";
	cin>>n;
	student s[n];
	ofstream fout(fnm,ios::binary);
	ifstream fin(fnm,ios::binary);
	if(!fout || !fin){
		cout<<"File not found :(";
		return -1;
	}
	for(int i=0;i<n;i++){
		s[i].accept();
		fout.write((char*)&s[i],sizeof(student));	
	}
	for(int i=0;i<n;i++){
		fin.read((char*)&s[i],sizeof(student));
		s[i].display();
	}
}
