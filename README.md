# STABLE MARRIAGE PROBLEM
from algorithm design class

## OVERVIEW
The StableMarriage problem receives its input as ranked lists. Every man ranks the women
from most to least desired and every woman ranks the men from most to least desirable. Recall that running
the ProposeDispose algorithm in the most obvious way using these ranked lists results in an O(N^3)
algorithm where N is the number of men (or women). The reason this occurs is that when an engaged
woman receives a proposal, she must linearly scan her list to determine which of the men she prefers. In
class we showed a preprocessing step that could be done to reduce the time to O(N^2). In this project you’ll
be given the matrix (2-d array) containing the women’s rankings and need to perform this preprocessing
step.

## DETAILS
The input will come from a file called input.txt which will be placed in the same directory as your
java file. The first line of the file will have a single value which will be the value of N. The next N lines will
be the preference lists for the N women.  
You program will read in this file and perform the steps necessary to create the array where row i column
j tells you how woman i ranks man j. For example if a woman ranks the men 5 1 3 8 2 7 6 4 then you
should modify it to: man 1 is ranked 2nd, man 2 is ranked 5th, man 3 is ranked 3rd, man 4 is ranked 8th,
man 5 is ranked 1st, man 6 is ranked 7th, man 7 is ranked 6th, and man 8 is ranked 4th. So you should
create the line 2 5 3 8 1 7 6 4.   
Then you will print this array out to the screen using tabs to seperate items in the same row. See the sample
output below.

## SAMPLE EXECUTION
If input.txt contains
4  
1 2 3 4  
4 3 2 1  
1 3 2 4  
3 1 4 2  
then your program should output  
1 2 3 4  
4 3 2 1  
1 3 2 4  
2 4 1 3  
If input.txt contains  
6  
3 2 5 4 1 6  
4 3 5 2 6 1  
1 6 2 4 3 5  
5 1 4 6 2 3  
5 1 4 6 3 2  
3 2 1 6 5 4   
then your program should output  
5 2 1 4 3 6   
6 4 2 1 3 5   
1 3 5 4 6 2  
2 5 6 3 1 4  
2 6 5 3 1 4  
3 2 1 6 5 4  
If input.txt contains  
8  
6 1 3 2 4 5 8 7  
4 3 2 1 8 7 6 5  
1 3 5 7 2 4 6 8  
1 8 2 7 3 6 4 5  
4 5 3 6 2 7 1 8  
2 4 6 8 1 3 5 7  
8 7 6 5 4 3 2 1  
5 1 3 8 2 7 6 4  
then the output should be  
2 4 3 5 6 1 8 7  
4 3 2 1 8 7 6 5  
1 5 2 6 3 7 4 8  
1 3 5 7 8 6 4 2   
7 5 3 1 2 4 6 8  
5 1 6 2 7 3 8 4   
8 7 6 5 4 3 2 1   
2 5 3 8 1 7 6 4   
