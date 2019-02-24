BEGIN { totalCount = 0;}	
{	count = 0;
	for (i = 2; i <= NF; i++)
	{
		count = count + $i;
	} 

	average = count/(NF-1);
	totalCount = totalCount + average;
	printf "%s has an average of: %d \n", $1, average;
	

}

END {print "Class Average =", totalCount/(NR); }
