{letterGrade[$NF]++;}
END{

	for (i in letterGrade)
		printf "The total number of %s's = %d\n", i, letterGrade[i];
   }
