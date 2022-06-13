#include <iostream>
#include <iomanip>
#include <limits>

using namespace std;

int main(){
    
    float weight;
    float age;
    char gender;
    float bl;   //stores Biximent level
    float gf;   //stores gender factor
    float bmi;  //stores bmi value
    char again = 'y'; //for multiple user inputs 

    while(again == 'Y' || again == 'y'){
        
        //prompt for user input and also validation of the input by user
        cout<<"Enter your Gender : "<<endl;
        cin>>gender;
        gender = toupper(gender);
        while (gender !='R' && gender !='S' && gender !='T'){
            cout<<"Must be R, S or T : "<<endl;
        
            cin>>gender;
            gender = toupper(gender);
        }
    
        cout<<"Enter your age in solar cycles : "<<endl;
        while(!(cin>>age) || age<=0){
            cout<<"Must be a positive number : "<<endl;
            cin.clear();
            cin.ignore(numeric_limits<streamsize>::max(),'\n');
        }
    
        cout<<"Enter your weight in kilograms : "<<endl;
        while(!(cin>>weight) || weight<=0){
            cout<<"Must be a positive number : "<<endl;
            cin.clear();
            cin.ignore(numeric_limits<streamsize>::max(),'\n');
        }
    
        cout<<"Enter your Biximent level : "<<endl;
        while(!(cin>>bl) || bl<=0){
            cout<<"Must be a positive number : "<<endl;
            cin.clear();
            cin.ignore(numeric_limits<streamsize>::max(),'\n');
        }
        
        //calculating gender factor
        if(gender=='R'){
            gf = 7.35;
        }
        else if(gender=='S'){
            gf = 2.42;
        }
        else{
            gf = 5.67;
        }
        
        //calculating BMI value 
        bmi = (2.17*age) + ((bl*329) / (weight*gf));
        
        cout<<"Biximent Metabolic Index Report"<<endl;
        cout<<"Gender: "<<gender<<endl;
        cout<<"Age: "<<age<<" solar cycles"<<endl;
        cout<<"Weight: "<<weight<<" kilograms"<<endl;
        cout<<"Biximent Level: "<<bl<<endl;
        cout<<"BMI: "<<fixed<<setprecision(2)<<bmi<<endl;
        
        if(bmi<195){
            if(bmi<75){
                cout<<"Level of infection : Mild"<<endl;
                cout<<"No treatment required"<<endl;
            }else if(bmi>=75 && bmi<127.5){
                cout<<"Level of infection : Serious"<<endl;
                cout<<"Recommended treatment: Medication"<<endl;
            }else {
                cout<<"Level of infection : Acute"<<endl;
                cout<<"Recommended treatment: Ultraviolet treatment"<<endl;
            }
        }else{
            if(bmi<245){
                cout<<"Level of infection : Acute"<<endl;
                cout<<"Recommended treatment: Ultraviolet treatment Inhabitant is Highly Contagious"<<endl;
            }else if(bmi>=245 && bmi<375){
                cout<<"Level of infection : Severe"<<endl;
                cout<<"Recommended treatment: Replacement therapy Inhabitant is Highly Contagious"<<endl;
            }else {
                cout<<"Level of infection : Extreme"<<endl;
                cout<<"Recommended treatment: Hospitalization Inhabitant is Highly Contagious"<<endl;
            }
        }
        
        cout<<"Go again? (y/n)"<<endl;
        cin>>again;
        again = toupper(again);
        while (again !='Y' && again !='N'){
            cout<<"Must be y or n for YES or NO : "<<endl;
        
            cin>>again;
            again = toupper(again);
        }
        
    }//end of while
    
    cout<<"Thank you for using BMI calculator!"<<endl;
    return 0;
}