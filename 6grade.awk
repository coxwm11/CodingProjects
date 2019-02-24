BEGIN { totalCount = 0;}	
{	count = 0;
	for (i = 2; i <= NF; i++)
	{
		count = count + $i;
	} 

	average = count/(NF-1);
	if (average >= 90) grade = "A";
        else  if (average >= 80) grade = "B";
        else  if (average >= 70) grade = "C";
        else  if (averagae >= 50) grade = "D";
        else  grade = "F";
	
	printf "%s has a letter grade of: %s \n",$1, grade;

}

