#include<iostream>
#include<stdlib.h>
#include<ctime>
using namespace std;


class Game
{
	public :
		void hello()
	{
		string name;
	int num;
	cout<<"----------*----------\n";
	cout<<"        Name         \n";
	cout<<"----------*----------\n";
	
	cout<<"Enter Your Name : ";// To Print The Player Name
	cin>>name;
	
	cout<<"\n----------*----------\n";
	cout<<"        Round        \n";
	cout<<"----------*----------\n";
	
	cout<<name<<" How many rounds you want to play ? ";// Rounds Selected By Player
	cin>>num;
	
	cout<<"\n----------*----------\n";
	cout<<"        Game        \n";
	cout<<"----------*----------\n";
	int player_score=0,computer_score=0;//Score Board Start
	int player_choice,computer_choice;// declaring variable to ask choice what they want to go with either Rock, Paper Or Scissor
	
	for(int num1=1;num1<=num;num1++)//loop Created to play rounds that user told to play
	{
		cout<<"Round No : "<<num1<<"/"<<num<<endl;
		cout<<name<<"'s score = "<<player_score<<endl;	
		cout<<"Computer Score = "<<computer_score<<endl;
		cout<<"1. Rock"<<endl<<"2. Paper"<<endl<<"3. Scissor"<<endl;//choice for player for rock or paper or scissor
		do{
			cout<<"Select your choice : ";
			cin>>player_choice;	
		}while(player_choice !=1 && player_choice!=2 && player_choice!=3);
		srand(time(0));
		(rand()%3)+1;//random selection function for computer
		cout<<"Computer Choice : "<<computer_choice<<endl;
		if(player_choice==1&&computer_choice==3)//plyer choose rock and comp choose scissor than player wins
		{
			cout<<"Player Win ."<<endl;
			player_score++;
		}
		else if(player_choice==2&&computer_choice==1)//plyer choose paper and comp choose rock than player wins
		{
			cout<<"Player Win ."<<endl;
			player_score++;
		}
		else if(player_choice==3&&computer_choice==2)//plyer choose scissor and comp choose paper than player wins
		{
			cout<<"Player Win ."<<endl;
		}
		else if(player_choice==computer_choice)//match will be draw if both choose same
		{
			cout<<"Match Draw"<<endl;
		}
		else//if above all conditions are wrong than computer wins
		{
			cout<<"Computer Win ."<<endl;
			computer_score++;
		}
		
	}
	if(computer_score==player_score)//describe score if com score is 1 and ply score is 1 than match is draw
	{
		cout<<"Game is Drawn"<<endl;
	}
	else if(player_score>computer_score)//if player have more score than player is winner
	{
		cout<<name<<"You won The Game"<<endl;
	}
	else//if computer scores more than player than computer wins
	{
		cout<<"Computer Won the Game"<<endl;
	}

	}	
	
};

int main()
{
	Game g;
	g.hello();
	return 0;
}