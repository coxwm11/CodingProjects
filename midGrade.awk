BEGIN { totalCount = 0;}	
{	count = 0;
	for (i = 2; i <= NF; i++)
	{
		count = count + $i;
	} 

	average = count/(NF-1);
	print $1, average;
		
	

}

END {}
