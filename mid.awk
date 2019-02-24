{ name[NR] = $1; grade[NR] = $2;}
 
END { middleValue = int(NR/2) + 1;

	printf "The middle grade belongs to %s\n ", name[middleValue];
	printf "The grade received was: %d \n", grade[middleValue];


	}
